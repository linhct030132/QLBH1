/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import com.toedter.calendar.JDateChooser;
import qlbh.controller.QuanLyNhanVienController;
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
import qlbh.model.NhanVien;
import qlbh.services.NhanVienServices;
import qlbh.services.NhanVienServicesImp;
import qlbh.view.NhanVienFrm;

/**
 *
 * @author Steven
 */
public class NhanVienController {

    private JButton btnSave;
    private JTextField txtMaNV;
    private JTextField txtName;
    private JDateChooser jdcDate;
    private JRadioButton jrdNam;
    private JRadioButton jrdNu;
    private JCheckBox cbTinhTrang;
    private JTextField txtSDT;
    private JTextArea jtaDiaChi;
    private JLabel jlbMsg;

    public NhanVien nv = null;

    public NhanVienServices nhanVienServices = null;

    public NhanVienController(JButton btnSave, JTextField txtMaNV, JTextField txtName,
            JDateChooser jdcDate, JRadioButton jrdNam, JRadioButton jrdNu, JCheckBox cbTinhTrang,
            JTextField txtSDT, JTextArea jtaDiaChi, JLabel jlbMsg) {
        this.btnSave = btnSave;
        this.txtMaNV = txtMaNV;
        this.txtName = txtName;
        this.jdcDate = jdcDate;
        this.jrdNam = jrdNam;
        this.jrdNu = jrdNu;
        this.cbTinhTrang = cbTinhTrang;
        this.txtSDT = txtSDT;
        this.jtaDiaChi = jtaDiaChi;
        this.jlbMsg = jlbMsg;

        this.nhanVienServices = new NhanVienServicesImp();
    }

    public void setView(NhanVien nv) {
        this.nv = nv;
        txtMaNV.setText( nv.getMaNV());
        txtName.setText(nv.getTenNV());
        jdcDate.setDate(nv.getNgaySinh());
        try {
            if (nv.getGioiTinh()) {
                jrdNam.setSelected(true);
            } else {
                jrdNu.setSelected(true);
            }
            cbTinhTrang.setSelected(nv.getTinhTrang());
        } catch (Exception e) {
        }
        txtSDT.setText(nv.getSDT());
        jtaDiaChi.setText(nv.getDiaChi());
        setEvents();
    }

    public void setEvents() {
        btnSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (txtName.getText().length() == 0) {
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                } else {
                    nv.setMaNV(txtMaNV.getText().toString());
                    nv.setTenNV(txtName.getText().trim().toString());
                    nv.setNgaySinh(jdcDate.getDate());
                    nv.setSDT(txtSDT.getText().toString());
                    nv.setDiaChi(jtaDiaChi.getText().toString());
                    nv.setGioiTinh(jrdNam.isSelected());
                    nv.setTinhTrang(cbTinhTrang.isSelected());
                    
                    if (txtMaNV.getText() != null || txtMaNV.getText().length() == 0) {
                        nhanVienServices.createOrUpdate(nv);
                        nhanVienServices.getList();
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
