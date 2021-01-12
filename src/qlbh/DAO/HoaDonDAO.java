/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import qlbh.controller.ConnectToSQL;
import qlbh.model.HoaDon;

/**
 *
 * @author Steven
 */
public class HoaDonDAO {
    
     
    
    public static String DinhDangNgay(Date ngay) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        return dateFormat.format(ngay);
    }
    
    Connection conn = ConnectToSQL.getConnection();
    public static ResultSet CountSoHoaDon(String SoHoaDon) {
        String sql = "select Count(*) from tb_hoadon where SoHoaDon like N'%" + SoHoaDon + "%'";
        return ConnectToSQL.GetData(sql);
    }
    
    //7 Hàm lấy theo SoHoaDon
    public static ResultSet GetBySoHoaDon(String SoHoaDon) {
        String sql = "select * from tb_hoadon where SoHoaDon = N'" + SoHoaDon + "'";
        return ConnectToSQL.GetData(sql);
    }
    
    public static int ThemHD(HoaDon hd){
        try {
           String sql = "set dateformat dmy INSERT INTO tb_HoaDon  " +
"           ([MaHD]" +
"           ,[SoHoaDon]  " +
"           ,[NgayTaoHD]  " +
"           ,[MaNhanVien]  " +
"           ,[MaKhachHang]  " +
"           ,[TongTien]  " +
"           ,[GhiChu])  " +
"     VALUES  " +
"           ( '"+hd.getMaHD()+ "' " + 
"           ,'" +hd.getSoHoaDon()+ "'  " +
"           ,'" + DinhDangNgay(hd.getNgayLapHD())+ "'  " +
"           ," +hd.getMaNV()+ "  " +
"           ," +hd.getMaKH()+ "  " +
"           ," +hd.getTongTien()+ "  )" ;
        
        System.out.println(sql);
           return ConnectToSQL.ExecuteTruyVan(sql);
       } catch (Exception ex) {
           ex.printStackTrace();
       }
        return 0;
   }
    
    
}
