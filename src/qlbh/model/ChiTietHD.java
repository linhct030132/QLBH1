/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

/**
 *
 * @author Steven
 */
public class ChiTietHD {
    String MaChiTietHD;
    String MaHD;
    String MaHang;
    int SoLuong;
    double ThanhTien;

    public ChiTietHD() {
    }

    public ChiTietHD(String MaChiTietHD, String MaHD, String MaHang, int SoLuong, double ThanhTien) {
        this.MaChiTietHD = MaChiTietHD;
        this.MaHD = MaHD;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public String getMaChiTietHD() {
        return MaChiTietHD;
    }

    public void setMaChiTietHD(String MaChiTietHD) {
        this.MaChiTietHD = MaChiTietHD;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

   
}
