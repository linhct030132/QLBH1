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
public class HoaDon implements Serializable {
    
    private String MaHD;
    private int SoHoaDon;
    private Date NgayLapHD;
    private String MaNV;
    private String MaKH;
    private int TongTien;

    public HoaDon(String MaHD, Date NgayLapHD, String MaNV, String MaKH, int TongTien, int SoHoaDon) {
        this.MaHD = MaHD;
        this.NgayLapHD = NgayLapHD;
        this.SoHoaDon = SoHoaDon;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.TongTien = TongTien;
    }

    public HoaDon() {
    }

    public int getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(int SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }
    
    

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(Date NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    
    
}
