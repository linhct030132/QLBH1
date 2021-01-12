/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import java.io.Serializable;

/**
 *
 * @author Steven
 */
public class HangHoa implements Serializable{

    private String MaHang;
    private String TenHang;
    private String LoaiSanPham;
    private int GiaNhap;
    private int GiaBan;
    private String NhaCungCap;
    private int SoLuong;

    public HangHoa() {
    }

    public HangHoa(String MaHang, String TenHang, String LoaiSanPham, int GiaNhap, int GiaBan, String NhaCungCap, int SoLuong) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.LoaiSanPham = LoaiSanPham;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.NhaCungCap = NhaCungCap;
        this.SoLuong = SoLuong;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String LoaiSanPham) {
        this.TenHang = TenHang;
    }

    public String getLoaiSanPham() {
        return LoaiSanPham;
    }

    public void setLoaiSanPham(String LoaiSanPham) {
        this.LoaiSanPham = LoaiSanPham;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    

}
