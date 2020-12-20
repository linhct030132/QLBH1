/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.beans.HangHoaBean;


/**
 *
 * @author Steven
 */
public interface ThongKeService {
     public List<HangHoaBean> getListByHangHoa();
}
