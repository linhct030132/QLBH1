/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import java.util.List;
import javax.swing.JPanel;
import qlbh.beans.HangHoaBean;
import qlbh.services.ThongKeService;
import qlbh.services.ThongKeServiceImp;

/**
 *
 * @author Steven
 */
public class QuanLyThongKeController {
    private ThongKeService thongKeService = null;
    
    public QuanLyThongKeController(){
        thongKeService = new ThongKeServiceImp();
    }
    
    private void setDateToChart(JPanel JpnItem){
        List<HangHoaBean> listItem = thongKeService.getListByHangHoa();
    }
}
