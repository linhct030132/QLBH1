/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import java.util.Date;

/**
 *
 * @author Steven
 */
public class PhieuXuatHang {
    String MaXuat,MaNV;
    Date NgayXuat;

    public PhieuXuatHang(String MaXuat, String MaNV, Date NgayXuat) {
        this.MaXuat = MaXuat;
        this.MaNV = MaNV;
        this.NgayXuat = NgayXuat;
    }

    public String getMaXuat() {
        return MaXuat;
    }

    public void setMaXuat(String MaXuat) {
        this.MaXuat = MaXuat;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }
    
    
}
