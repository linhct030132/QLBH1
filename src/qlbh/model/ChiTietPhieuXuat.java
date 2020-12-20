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
public class ChiTietPhieuXuat {
    String MaXuat, MaHang;
    int SoLuong;

    public ChiTietPhieuXuat() {
    }

    public ChiTietPhieuXuat(String MaXuat, String MaHang, int SoLuong) {
        this.MaXuat = MaXuat;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
    }

    public String getMaXuat() {
        return MaXuat;
    }

    public void setMaXuat(String MaXuat) {
        this.MaXuat = MaXuat;
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

    @Override
    public String toString() {
        return "ChiTietPhieuXuat{" + "MaXuat=" + MaXuat + ", MaHang=" + MaHang + ", SoLuong=" + SoLuong + '}';
    }
    
    
}
