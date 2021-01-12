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
import java.sql.Statement;
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
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                HangHoa hh = new HangHoa();
                hh.setMaHang(rs.getString("MaHang"));
                hh.setTenHang(rs.getString("TenHang"));
                hh.setLoaiSanPham(rs.getString("LoaiSanPham"));
                hh.setGiaNhap(rs.getInt("GiaNhap"));
                hh.setGiaBan(rs.getInt("GiaBan"));
                hh.setNhaCungCap(rs.getString("NhaCungCap"));
                hh.setSoLuong(rs.getInt("SoLuong"));
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
    public String createOrUpdate(HangHoa hh) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_HangHoa(MaHang, TenHang, LoaiSanPham, GiaNhap,GiaBan, NhaCungCap, SoLuong) "
                    + "VALUES(?, ?, ?, ?, ?, ?,?)"
                    + " ON DUPLICATE KEY UPDATE MaHang = VALUES(MaHang), TenHang=VALUES(TenHang), LoaiSanPham=VALUES(LoaiSanPham), GiaNhap=VALUES(GiaNhap),GiaBan=VALUES(GiaBan),NhaCungCap = VALUES(NhaCungCap),SoLuong=VALUES(SoLuong);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hh.getMaHang());
            ps.setString(2, hh.getTenHang());
            ps.setString(3, hh.getLoaiSanPham());
            ps.setInt(4, hh.getGiaBan());
            ps.setInt(5, hh.getGiaNhap());
            ps.setString(6, hh.getNhaCungCap());
            ps.setInt(7, hh.getSoLuong());
            ps.executeUpdate();
            ps.close();
            conn.close();
            GetAll();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ResultSet GetAll(){
        String sql="SELECT * FROM tb_HangHoa";        
        return ConnectToSQL.GetData(sql);
    }
    
    public static ResultSet Search(String Loai,String keyword ){
        String sql="SELECT * FROM tb_HangHoa where "
                + "(MaHang  like N'%"  + keyword 
                + "%' or TenHang like N'%" + keyword + "%' or '' = '" + keyword 
                + "') and (LoaiSanPham  = " + Loai + " or 0 = " + Loai + ")";        
        return ConnectToSQL.GetData(sql);
    }
    
}
