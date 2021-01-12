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
import java.sql.Date;
import java.sql.Statement;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import qlbh.controller.ConnectToSQL;
import qlbh.model.KhachHang;
import qlbh.model.MyCombobox;

/**
 *
 * @author Steven
 */
public class KhachHangDAOImp implements KhachHangDAO {

    @Override
    public List<KhachHang> getList() {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_KhachHang";
            List<KhachHang> list = new ArrayList<>();
           Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setHoTenKH(rs.getString("HoTenKH"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                list.add(kh);
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
    public String createOrUpdate(KhachHang kh) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_KhachHang(MaKH, HoTenKH, GioiTinh, NgaySinh, DiaChi, SDT) "
                    + "VALUES(?, ?, ?, ?, ?, ?)   "
                    + "ON DUPLICATE KEY UPDATE MaKH=Values(MaKH), HoTenKH=Values(HoTenKH),NgaySinh=Values(NgaySinh),GioiTinh=Values(GioiTinh),DiaChi= Values(DiaChi),SDT=Values(SDT) ";
            PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getHoTenKH());
            ps.setBoolean(3, kh.isGioiTinh());
            ps.setDate(4, new Date(kh.getNgaySinh().getTime()));
            ps.setString(5, kh.getDiaChi());
            ps.setString(6, kh.getSDT());
            ps.execute();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }
    
    public static ResultSet GetAll() {
        String cauTruyVan = "Select * from tb_KhachHang order by HoTenKH";
        return ConnectToSQL.GetData(cauTruyVan);
    }
    
    public static  ResultSet GetByMaKH(String MaKH){
        String cauTruyVan = "Select * from tb_KhachHang where MaKH = " + MaKH;
        return ConnectToSQL.GetData(cauTruyVan);
    }
    
    public static  ResultSet GetByKeyword(String keyword){
        String cauTruyVan = "Select * from tb_KhachHang where MaKH like '%" + keyword + "%'  or " 
                + " HoTenKH like N'%" + keyword + "%'";
        return ConnectToSQL.GetData(cauTruyVan);
    }
    
    public static void DoDuLieuVaoCBBKhachHang(JComboBox cbb, String keyword){
        cbb.removeAllItems();
        try {
            ResultSet rs = GetByKeyword(keyword);
            
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
           
            while(rs.next()){
                MyCombobox mb = new MyCombobox(rs.getString("HoTenKH"), 
                                            rs.getString("MaKH"));
                cbbModel.addElement(mb);                
            }
        } catch (SQLException ex) {
        }
    }
    
    public static KhachHang GetKHByMaKH(String MaKH){
//        ResultSet rs = KhachHangDAO.GetByMaKH(MaKH);
        
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_KhachHang where MaKH = " + MaKH;
            List<KhachHang> list = new ArrayList<>();
           Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setHoTenKH(rs.getString("HoTenKH"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                
                list.add(kh);
            }
            ps.close();
            conn.close();
            rs.close();
        } catch (SQLException ex) {
           
        }
        return null;
    }

}
