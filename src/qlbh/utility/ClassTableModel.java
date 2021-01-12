/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import qlbh.model.HangHoa;
import qlbh.model.HoaDon;
import qlbh.model.KhachHang;
import qlbh.model.NhanVien;

/**
 *
 * @author Steven
 */
public class ClassTableModel {

    public DefaultTableModel setDefaultTableModelNV(List<NhanVien> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }

        };
        dtm.setColumnIdentifiers(listColumn);
        int num = listItem.size();
        Object[] obj;
        NhanVien nv = null;

        for (int i = 0; i < num; i++) {
            nv = listItem.get(i);
            obj = new Object[columns];
            obj[1] = nv.getMaNV();
            obj[0] = (i + 1);
            obj[2] = nv.getTenNV();
            obj[3] = nv.getGioiTinh() == true ? "Nam" : "Nữ";
            obj[6] = nv.getDiaChi();
            obj[5] = nv.getSDT();
            obj[7] = nv.getTinhTrang();
            obj[4] = nv.getNgaySinh();
            dtm.addRow(obj);
        }

        return dtm;
    }

    public DefaultTableModel setDeaultTableModelHH(List<HangHoa> listItem, String[] listColumn) {

        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        int num = listItem.size();
        Object[] obj;
        HangHoa hh = null;
            for (int i = 0; i < num; i++) {
                hh = listItem.get(i);
                obj = new Object[columns];
                obj[1] = hh.getMaHang();
                obj[0] = (i + 1);
                obj[2] = hh.getTenHang();
                obj[3] = hh.getLoaiSanPham();
                obj[4] = hh.getGiaBan();
                obj[5] = hh.getGiaNhap();
                obj[6] = hh.getNhaCungCap();
                obj[7] = hh.getSoLuong();
                dtm.addRow(obj);
            }
        return dtm;
    }
    
    public DefaultTableModel setDeaultTableModelKH(List<KhachHang> listItem, String[] listColumn) {

        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        int num = listItem.size();
        Object[] obj;
        KhachHang kh = null;
            for (int i = 0; i < num; i++) {
                kh = listItem.get(i);
                obj = new Object[columns];
                obj[1] = kh.getMaKH();
                obj[0] = (i + 1);
                obj[2] = kh.getHoTenKH();
                obj[4] = kh.getNgaySinh();
                obj[3] = kh.isGioiTinh() == true ? "Nam" : "Nữ";
                obj[5] = kh.getDiaChi();
                obj[6] = kh.getSDT();
                dtm.addRow(obj);
            }
        return dtm;
    }
    
    public DefaultTableModel setDeaultTableModelHD(List<HoaDon> listItem, String[] listColumn) {

        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        int num = listItem.size();
        Object[] obj;
        HoaDon hd = null;
            for (int i = 0; i < num; i++) {
                hd = listItem.get(i);
                obj = new Object[columns];
                obj[1] = hd.getMaHD();
                obj[0] = (i + 1);
                obj[2] = hd.getMaKH();
                obj[4] = hd.getMaNV();
                obj[3] = hd.getNgayLapHD();
                obj[5] = hd.getSoHoaDon();
                obj[6] = hd.getTongTien();
                dtm.addRow(obj);
            }
        return dtm;
    }
    
    public static void DoDuLieu(JTable tbl, ResultSet rs ){
        //Tạo 1 DefaultTableModel 
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        //Xóa các dòng trong table
        tbModel.setRowCount(0);
        //Tạo 1 mảng Object có 4 phần tử
        Object obj[] = new Object[5];
        
        try {
            while(rs.next()){                
                obj[0] = rs.getString("MaHang");
                obj[1] = rs.getString("TenHang");
                obj[2] = rs.getString("GiaBan");                
                obj[3] = rs.getString("SoLuong");
                obj[4] = rs.getString("LoaiSanPham");
                //Thêm obj vào table
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
        }
    }

}
