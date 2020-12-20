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
public class NhaCungCap {
    private String MaNhaCungCap, TenNhaCungCap, DiaChi,
            Fax,Email;

    public NhaCungCap() {
    }

    public NhaCungCap(String MaNhaCungCap, String TenNhaCungCap, String DiaChi, String Fax, String Email) {
        this.MaNhaCungCap = MaNhaCungCap;
        this.TenNhaCungCap = TenNhaCungCap;
        this.DiaChi = DiaChi;
        this.Fax = Fax;
        this.Email = Email;
    }

    public String getMaNhaCungCap() {
        return MaNhaCungCap;
    }

    public void setMaNhaCungCap(String MaNhaCungCap) {
        this.MaNhaCungCap = MaNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return TenNhaCungCap;
    }

    public void setTenNhaCungCap(String TenNhaCungCap) {
        this.TenNhaCungCap = TenNhaCungCap;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
