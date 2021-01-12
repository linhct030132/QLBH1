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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlbh.controller.ConnectToSQL;
import qlbh.model.HoaDon;

/**
 *
 * @author Steven
 */
public class HoaDonDAOImp extends HoaDonDAO{
    Connection conn = ConnectToSQL.getConnection();
    public List<HoaDon> getList() {
        try {
            String sql = "Select * from tb_HoaDon";
            List<HoaDon> list = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString("MaHD"));
                hd.setMaKH(rs.getString("MaKH"));
                hd.setMaNV(rs.getString("MaNV"));
                hd.setNgayLapHD(rs.getDate("NgayLapHD"));
                hd.setSoHoaDon(rs.getInt("SoHoaDon"));
                hd.setTongTien(rs.getInt("TongTien"));
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
    
     
    
    

//    @Override
   public String createOrUpdate(HoaDon hd) {
       try {
           String sql = "INSERT INTO tb_HoaDon(MaHD, NgayDat, ThanhTien) "
                   + "VALUES(?, ?, ?)   ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,hd.getMaHD());
            ps.setString(2, hd.getMaKH());
            ps.setString(3, hd.getMaNV());
            ps.setDate(4, new Date(hd.getNgayLapHD().getTime()));
            ps.setInt(5, hd.getSoHoaDon());
            ps.setInt(6, hd.getTongTien());
            ps.execute();
           ps.close();
            conn.close();
        } catch (Exception ex) {
           ex.printStackTrace();
       }
        return null;
    }
  
   public ArrayList<HoaDon> findByDate(String Date) {
       ArrayList<HoaDon> list = new ArrayList<>();
       String sql = "SELECT * FROM tb_HoaDon WHERE NgayLap LIKE ? ";
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setString(1, "%" + Date + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString("MaHD"));
                hd.setNgayLapHD(rs.getDate("NgayLapHD"));
                hd.setTongTien(rs.getInt("TongTien"));
                list.add(hd);
            }
            ps.close();
            conn.close();
            rs.close();
            return list;
       } catch (Exception e) {
          e.printStackTrace();
           System.out.println("true");
       }
       return null;
   }

    
}
