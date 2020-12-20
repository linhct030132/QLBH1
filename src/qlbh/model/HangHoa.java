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
public class HangHoa implements Serializable{

    private int MaHang;
    private String TenHang;
    private Date NgaySuDung;
    private Date HanSuDung;
    private String XuatSu;
    private Double GiaBan;

    public HangHoa() {
    }

    public HangHoa(int MaHang, String TenHang, Date NgaySuDung, Date HanSuDung, String XuatSu, Double GiaBan) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.NgaySuDung = NgaySuDung;
        this.HanSuDung = HanSuDung;
        this.XuatSu = XuatSu;
        this.GiaBan = GiaBan;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public Date getNgaySuDung() {
        return NgaySuDung;
    }

    public void setNgaySuDung(Date NgaySuDung) {
        this.NgaySuDung = NgaySuDung;
    }

    public Date getHanSuDung() {
        return HanSuDung;
    }

    public void setHanSuDung(Date HanSuDung) {
        this.HanSuDung = HanSuDung;
    }

    public String getXuatSu() {
        return XuatSu;
    }

    public void setXuatSu(String XuatSu) {
        this.XuatSu = XuatSu;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

}
