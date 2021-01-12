/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.DAO.HoaDonDAOImp;
import qlbh.model.HoaDon;

/**
 *
 * @author Steven
 */
public class HoaDonServicesImp implements HoaDonServices{
     private HoaDonDAOImp hoaDonDAO = null;

    public HoaDonServicesImp() {
        this.hoaDonDAO = new HoaDonDAOImp();
    }

    @Override
    public List<HoaDon> getList() {
        return  hoaDonDAO.getList();
    }

    @Override
    public String createOrUpdate(HoaDon hd) {
        return hoaDonDAO.createOrUpdate(hd);
    }

    
}
