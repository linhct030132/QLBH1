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
    String MaHD, MaHang;
    int SoLuong;
    Double DonGia;

    public ChiTietHD(String MaHD, String MaHang, int SoLuong, Double DonGia) {
        this.MaHD = MaHD;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public ChiTietHD() {
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

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    @Override
    public String toString() {
        return "ChiTietHD{" + "MaHD=" + MaHD + ", MaHang=" + MaHang + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    
}
