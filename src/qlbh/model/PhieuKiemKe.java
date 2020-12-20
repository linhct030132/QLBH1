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
public class PhieuKiemKe {
    String MaKiemKe, MaNV;
    Date NgayKiemKe;

    public PhieuKiemKe(String MaKiemKe, String MaNV, Date NgayKiemKe) {
        this.MaKiemKe = MaKiemKe;
        this.MaNV = MaNV;
        this.NgayKiemKe = NgayKiemKe;
    }

    public String getMaKiemKe() {
        return MaKiemKe;
    }

    public void setMaKiemKe(String MaKiemKe) {
        this.MaKiemKe = MaKiemKe;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayKiemKe() {
        return NgayKiemKe;
    }

    public void setNgayKiemKe(Date NgayKiemKe) {
        this.NgayKiemKe = NgayKiemKe;
    }
    
    
}
