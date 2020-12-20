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
public class ChiTietPhieuKiemKe {
    String MaKiemKe, MaHang, TinhTrang;
    int SoLuong;

    public ChiTietPhieuKiemKe() {
    }

    public ChiTietPhieuKiemKe(String MaKiemKe, String MaHang, String TinhTrang, int SoLuong) {
        this.MaKiemKe = MaKiemKe;
        this.MaHang = MaHang;
        this.TinhTrang = TinhTrang;
        this.SoLuong = SoLuong;
    }

    public String getMaKiemKe() {
        return MaKiemKe;
    }

    public void setMaKiemKe(String MaKiemKe) {
        this.MaKiemKe = MaKiemKe;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuKiemKe{" + "MaKiemKe=" + MaKiemKe + ", MaHang=" + MaHang + ", TinhTrang=" + TinhTrang + ", SoLuong=" + SoLuong + '}';
    }
    
    
}
