/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlbh.controller.ConnectToSQL;
import qlbh.model.HangHoa;

/**
 *
 * @author Steven
 */
public class HangHoaDAOImp implements HangHoaDAO{

    @Override
    public List<HangHoa> getList() {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_HangHoa";        //Lay du lieu bang tb_HangHoa
            List<HangHoa> list = new ArrayList<>();
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HangHoa hh = new HangHoa();
                hh.setMaHang(rs.getInt("MaHang"));
                hh.setTenHang(rs.getString("TenHang"));
                hh.setXuatSu(rs.getString("XuatSu"));
                hh.setGiaBan(rs.getDouble("GiaBan"));
                list.add(hh);
            }
            ps.close();
            rs.close();
            conn.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public int createOrUpdate(HangHoa hh) {
        return 0;
    }
    
    
}
