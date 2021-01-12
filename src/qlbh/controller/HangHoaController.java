/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import qlbh.model.HangHoa;
import qlbh.services.HangHoaServices;
import qlbh.services.HangHoaServicesImp;

/**
 *
 * @author Steven
 */
public class HangHoaController {
    private JTextField txtMaHH;
    private JTextField txtName;
    private JTextField txtGiaNhap;
    private JComboBox ccbLoaiSP;
    private JComboBox ccbNhaCungCap;
    private JTextField txtTonKho;
    private JTextField txtGiaBan;
    private JLabel jlbMsg;
    private JButton btnSave;

   
    
    private HangHoa hh = null;
    
    private HangHoaServices hangHoaServices = null;

    public HangHoaController(JComboBox ccbLoaiSP,JTextField txtMaHH, JTextField txtName, JTextField txtGiaNhap, 
            JComboBox ccbNhaCungCap, JTextField txtTonKho, JTextField txtGiaBan, JLabel jlbMsg, JButton btnSave) {
        this.txtMaHH = txtMaHH;
        this.txtName = txtName;
        this.txtGiaNhap = txtGiaNhap;
        this.ccbLoaiSP = ccbLoaiSP;
        this.ccbNhaCungCap = ccbNhaCungCap;
        this.txtTonKho = txtTonKho;
        this.txtGiaBan = txtGiaBan;
        this.jlbMsg = jlbMsg;
        this.btnSave = btnSave;
        
        this.hangHoaServices = new HangHoaServicesImp();
    }

  
    
    
       public void setView(HangHoa hh) {
        this.hh = hh;
        txtMaHH.setText( hh.getMaHang());
        txtName.setText(hh.getTenHang());
        txtGiaNhap.setText(""+ hh.getGiaNhap());
        txtGiaBan.setText("" + hh.getGiaBan());
        ccbLoaiSP.addItem(hh.getLoaiSanPham());
        ccbNhaCungCap.addItem(hh.getNhaCungCap());
        txtTonKho.setText("" + hh.getSoLuong());
        setEvents();
     }
       
       public void setEvents() {
        btnSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (txtName.getText().length() == 0 ) {
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                } else {
                    hh.setMaHang(txtMaHH.getText().toString());
                    hh.setTenHang(txtName.getText().trim().toString());
                    hh.setLoaiSanPham(ccbLoaiSP.getSelectedItem().toString());
                    hh.setNhaCungCap(ccbNhaCungCap.getSelectedItem().toString());
                    hh.setGiaNhap(Integer.parseInt(txtGiaNhap.getText()));
                    hh.setGiaBan(Integer.parseInt(txtGiaBan.getText()));
                    hh.setSoLuong(Integer.parseInt(txtTonKho.getText().toString()));
                    if (showDialog()) {
                        
                        if (txtMaHH.getText().length() != 0) {
                            txtMaHH.setText("#" + hh.getMaHang());
                            jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                            hangHoaServices.createOrUpdate(hh);
                            hangHoaServices.getList();
                        } else {
                            jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                        }
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSave.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSave.setBackground(new Color(100, 221, 23));
            }

        });
  
    }
         private boolean showDialog() {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn muốn cập nhật dữ liệu hay không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
    }
}
