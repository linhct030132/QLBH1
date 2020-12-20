/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlbh.controller.ConnectToSQL;
import qlbh.model.HoaDon;

/**
 *
 * @author Steven
 */
public class HoaDonDAOImp implements HoaDonDAO{

    @Override
    public List<HoaDon> getList() {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_HoaDon";
            List<HoaDon> list = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setNgayLap(rs.getDate("Date"));
                hd.setThanhTien(rs.getDouble("ThanhTien"));
                list.add(hd);
            }
            ps.close();
            conn.close();
            rs.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public int createOrUpdate(HoaDon hd) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_HoaDon(MaHD, NgayLap, ThanhTien) "
                    + "VALUES(?, ?, ?)   ";
            PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDate(1, (Date) hd.getNgayLap());
            ps.setDouble(2, hd.getThanhTien());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            conn.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
}
