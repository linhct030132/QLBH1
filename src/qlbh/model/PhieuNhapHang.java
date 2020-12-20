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
public class PhieuNhapHang {
    String MaHang;
    Date NgayNhap;
    int SoLuong;

    public PhieuNhapHang(String MaHang, Date NgayNhap, int SoLuong) {
        this.MaHang = MaHang;
        this.NgayNhap = NgayNhap;
        this.SoLuong = SoLuong;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
