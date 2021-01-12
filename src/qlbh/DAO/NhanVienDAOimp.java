package qlbh.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import qlbh.model.NhanVien;
import qlbh.controller.ConnectToSQL;

/**
 *
 * @author Steven
 */
public class NhanVienDAOimp implements NhanVienDAO {

    @Override
    public List<NhanVien> getList() {

        Connection conn = null;
        Statement ps = null;
            
        try {
            conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_NhanVien";
            List<NhanVien> list = new ArrayList<>();
            ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("SDT"));
                nv.setTinhTrang(rs.getBoolean("TinhTrang"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                list.add(nv);
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
    public String createOrUpdate(NhanVien nv) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_NhanVien(MaNV, TenNV,GioiTinh, NgaySinh, DiaChi,SDT, TinhTrang) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?) "
                    + " ON DUPLICATE KEY UPDATE MaNV = VALUES(MaNV) ,TenNV=VALUES(TenNV), GioiTinh=VALUES(GioiTinh), NgaySinh=VALUES(NgaySinh),DiaChi=VALUES(DiaChi), SDT=VALUES(SDT), TinhTrang=VALUES(TinhTrang);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getTenNV()); 
            ps.setDate(4, new Date(nv.getNgaySinh().getTime()));
            ps.setBoolean(3, nv.getGioiTinh());
            ps.setString(6, nv.getSDT());
            ps.setString(5, nv.getDiaChi());
            ps.setBoolean(7, nv.getTinhTrang());
            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            String generatedKey = null;
//            if(rs.next()){
//                generatedKey = rs.getString(1);
//            }
            ps.close();
            conn.close();
//            return generatedKey;
            getList();
         } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String delete(NhanVien nv){
         try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "DELETE FROM Table WHERE MaNV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.execute();
            ps.close();
            conn.close();
            getList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAOimp();
        System.out.println(nhanVienDAO.getList());
    }

}
