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
public class LoaiSanPham {
    private String MaLoaiSanPham;
    private String TenLoaiSanPham;

    public LoaiSanPham(String MaLoaiSanPham, String TenLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.TenLoaiSanPham = TenLoaiSanPham;
    }

    public LoaiSanPham() {
    }

    public String getMaLoaiSanPham() {
        return MaLoaiSanPham;
    }

    public void setMaLoaiSanPham(String MaLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return TenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String TenLoaiSanPham) {
        this.TenLoaiSanPham = TenLoaiSanPham;
    }
    
    
}
