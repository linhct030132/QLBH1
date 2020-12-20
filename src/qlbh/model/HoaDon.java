/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Steven
 */
public class HoaDon implements Serializable{
    private int MaHD;
    private Date NgayLap;
    private String NhanVienLap;
    private Double ThanhTien;

    public HoaDon() {
    }

    public HoaDon(int MaHD, Date NgayLap, String NhanVienLap, Double ThanhTien) {
        this.MaHD = MaHD;
        this.NgayLap = NgayLap;
        this.NhanVienLap = NhanVienLap;
        this.ThanhTien = ThanhTien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getNhanVienLap() {
        return NhanVienLap;
    }

    public void setNhanVienLap(String NhanVienLap) {
        this.NhanVienLap = NhanVienLap;
    }

    public Double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}
