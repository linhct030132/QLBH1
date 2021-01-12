/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import qlbh.model.KhachHang;
import qlbh.services.KhachHAngSerivcesImp;
import qlbh.services.KhachHangServices;

/**
 *
 * @author Steven
 */
public class KhachHangController {
     private JButton btnSave;
    private JTextField txtMaNV;
    private JTextField txtName;
    private JDateChooser jdcDate;
    private JRadioButton jrdNam;
    private JRadioButton jrdNu;
    private JTextField txtSDT;
    private JTextArea jtaDiaChi;
    private JLabel jlbMsg;

    public KhachHang kh = null;

    public KhachHangServices khachHangServices = null;

    public KhachHangController(JButton btnSave, JTextField txtMaNV, JTextField txtName,
            JDateChooser jdcDate, JRadioButton jrdNam, JRadioButton jrdNu,
            JTextField txtSDT, JTextArea jtaDiaChi, JLabel jlbMsg) {
        this.btnSave = btnSave;
        this.txtMaNV = txtMaNV;
        this.txtName = txtName;
        this.jdcDate = jdcDate;
        this.jrdNam = jrdNam;
        this.jrdNu = jrdNu;
        this.txtSDT = txtSDT;
        this.jtaDiaChi = jtaDiaChi;
        this.jlbMsg = jlbMsg;

        this.khachHangServices = new KhachHAngSerivcesImp();
    }

    public void setView(KhachHang kh) {
        this.kh = kh;
        txtMaNV.setText( kh.getMaKH());
        txtName.setText(kh.getHoTenKH());
        jdcDate.setDate(kh.getNgaySinh());
        try {
            if (kh.isGioiTinh()) {
                jrdNam.setSelected(true);
            } else {
                jrdNu.setSelected(true);
            }
        } catch (Exception e) {
        }
        txtSDT.setText(kh.getSDT());
        jtaDiaChi.setText(kh.getDiaChi());
        setEvents();
    }

    public void setEvents() {
        btnSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (txtName.getText().length() == 0) {
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                } else {
                    kh.setMaKH(txtMaNV.getText().toString());
                    kh.setHoTenKH(txtName.getText().trim().toString());
                    kh.setNgaySinh(jdcDate.getDate());
                    kh.setSDT(txtSDT.getText().toString());
                    kh.setDiaChi(jtaDiaChi.getText().toString());
                    kh.setGioiTinh(jrdNam.isSelected());
                    
                    if (txtMaNV.getText() != null || txtMaNV.getText().length() == 0) {
                        khachHangServices.createOrUpdate(kh);
                        khachHangServices.getList();
                        jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                    } else {
                        jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
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
