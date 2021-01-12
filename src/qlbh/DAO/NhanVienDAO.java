/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.util.List;
import qlbh.model.NhanVien;


/**
 *
 * @author Steven
 */
public interface NhanVienDAO {
    public List<NhanVien> getList();
    
    public String createOrUpdate(NhanVien nv);
    
    public String delete(NhanVien nv);
}
