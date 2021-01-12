/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.sql.ResultSet;
import java.util.List;
import qlbh.controller.ConnectToSQL;
import qlbh.model.KhachHang;

/**
 *
 * @author Steven
 */
public interface KhachHangDAO {

    public List<KhachHang> getList();

    public String createOrUpdate(KhachHang kh); 
    
    public static  ResultSet GetByMaKH(String MaKH){
        String cauTruyVan = "Select * from tb_KhachHang where MaKH = " + MaKH;
        return ConnectToSQL.GetData(cauTruyVan);
    }
}
