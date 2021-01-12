/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.DAO.KhachHangDAO;
import qlbh.DAO.KhachHangDAOImp;
import qlbh.model.KhachHang;

/**
 *
 * @author Steven
 */
public class KhachHAngSerivcesImp implements KhachHangServices {

    private KhachHangDAO khachHangDAO = null;

    public KhachHAngSerivcesImp() {
        this.khachHangDAO = new KhachHangDAOImp();
    }

    @Override
    public List<KhachHang> getList() {
        return khachHangDAO.getList();
    }

    @Override
    public String createOrUpdate(KhachHang kh) {
        return khachHangDAO.createOrUpdate(kh);

    }
}
