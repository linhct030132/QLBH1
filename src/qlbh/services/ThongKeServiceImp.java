/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.DAO.ThongKeDAO;
import qlbh.DAO.ThongKeDAOImp;
import qlbh.beans.HangHoaBean;

/**
 *
 * @author Steven
 */
public class ThongKeServiceImp implements ThongKeService {

    private ThongKeDAO thongKeDAO = null;

    public ThongKeServiceImp() {
        thongKeDAO = new ThongKeDAOImp();
    }

    @Override
    public List<HangHoaBean> getListByHangHoa() {
        return thongKeDAO.getListByHangHoa();
    }
}
