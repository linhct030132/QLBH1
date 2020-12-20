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
public class ChiTietNhapHang {
    String MaNhap, MaHang, ChietKhau;
    int SoLuong;
    Double DonGia;

    public ChiTietNhapHang() {
    }

    public ChiTietNhapHang(String MaNhap, String MaHang, String ChietKhau, int SoLuong, Double DonGia) {
        this.MaNhap = MaNhap;
        this.MaHang = MaHang;
        this.ChietKhau = ChietKhau;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaNhap() {
        return MaNhap;
    }

    public void setMaNhap(String MaNhap) {
        this.MaNhap = MaNhap;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(String ChietKhau) {
        this.ChietKhau = ChietKhau;
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
        return "ChiTietNhapHang{" + "MaNhap=" + MaNhap + ", MaHang=" + MaHang + ", ChietKhau=" + ChietKhau + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    
}
