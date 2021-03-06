/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import qlbh.DAO.HangHoaDAOImp;
import qlbh.DAO.HoaDonDAOImp;
import qlbh.DAO.KhachHangDAOImp;
import qlbh.controller.ChuyenDoi;
import qlbh.model.KhachHang;
import qlbh.model.MyCombobox;
import qlbh.utility.ClassTableModel;

/**
 *
 * @author Steven
 */
public class HoaDonFrm extends javax.swing.JFrame {


    /**
     * Creates new form HoaDonFrm
     */
    public HoaDonFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmnCTHD = new javax.swing.JPopupMenu();
        mnXoaSP = new javax.swing.JMenuItem();
        jpnSanPham = new javax.swing.JPanel();
        cbLoaiSP = new javax.swing.JComboBox<>();
        txtTenSP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSanPham = new javax.swing.JTable();
        jpnThongTinHD = new javax.swing.JPanel();
        jlbTongTien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTienKhachTra = new javax.swing.JTextField();
        jlbTienThua = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        txtTongTien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbCTHD = new javax.swing.JTable();
        jpnHoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoHoaDon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTimKhachHang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbKhachHang = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtThongTinKH = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();

        mnXoaSP.setText("jMenuItem1");
        mnXoaSP.setComponentPopupMenu(pmnCTHD);
        pmnCTHD.add(mnXoaSP);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpnSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sản Phẩm"));

        cbLoaiSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoaiSPItemStateChanged(evt);
            }
        });

        txtTenSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenSPKeyReleased(evt);
            }
        });

        jtbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hàng", "Tên Hàng", "Giá", "Số Lượng", "Loại Hàng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbSanPham);

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnSanPhamLayout.createSequentialGroup()
                        .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
        );

        jlbTongTien.setText("Tổng Tiền: ");

        jLabel8.setText("Tiền Khách Trả: ");

        txtTienKhachTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienKhachTraActionPerformed(evt);
            }
        });

        jlbTienThua.setText("Tiền Trả Khách:");

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh Toán");

        javax.swing.GroupLayout jpnThongTinHDLayout = new javax.swing.GroupLayout(jpnThongTinHD);
        jpnThongTinHD.setLayout(jpnThongTinHDLayout);
        jpnThongTinHDLayout.setHorizontalGroup(
            jpnThongTinHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinHDLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jlbTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jpnThongTinHDLayout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpnThongTinHDLayout.setVerticalGroup(
            jpnThongTinHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinHDLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpnThongTinHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnThongTinHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jtbCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Hàng", "Tên Hàng", "Số Lượng", "Đơn Giá", "Thành TIền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbCTHD);

        jLabel1.setText("Ngày Tạo:");

        jLabel2.setText("Số Hóa Đơn:");

        jLabel3.setText("Nhân Viên: ");

        jLabel4.setText("Tìm Khách Hàng:");

        txtTimKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKhachHangKeyReleased(evt);
            }
        });

        jLabel5.setText("Khách Hàng:");

        cbKhachHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKhachHangItemStateChanged(evt);
            }
        });

        jLabel6.setText("Thông Tin Khách Hàng:");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayTao)
                    .addComponent(txtSoHoaDon)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtThongTinKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTimKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtThongTinKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongTinHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jpnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnThongTinHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLoaiSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoaiSPItemStateChanged
        // TODO add your handling code here:
        MyCombobox cbb = (MyCombobox) cbLoaiSP.getSelectedItem();
        ResultSet rsall = HangHoaDAOImp.Search(cbb.Value.toString(), txtTenSP.getText());
        ClassTableModel.DoDuLieu(jtbSanPham, rsall);
    }//GEN-LAST:event_cbLoaiSPItemStateChanged

    private void txtTenSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenSPKeyReleased
        // TODO add your handling code here:
        MyCombobox cbb = (MyCombobox) cbLoaiSP.getSelectedItem();
        ResultSet rsall = HangHoaDAOImp.Search(cbb.Value.toString(), txtTenSP.getText());
        ClassTableModel.DoDuLieu(jtbSanPham, rsall);
    }//GEN-LAST:event_txtTenSPKeyReleased
    
    private String SoHoaDon() {
        String soHoaDon = "";
        try {

            DateFormat dateFormat = new SimpleDateFormat("yyMMdd");

            Date d = new Date();

            soHoaDon = dateFormat.format(d);
            System.out.println("soHoaDon: " + soHoaDon);
            ResultSet rs = HoaDonDAOImp.CountSoHoaDon(soHoaDon);
            int rowCount = 0;
            if (rs.next()) {
                rowCount = rs.getInt(1);
            }
            boolean dup = false;
            do {
                if (rowCount > 98) {
                    soHoaDon = soHoaDon + (rowCount + 1);
                } else if (rowCount > 8) {
                    soHoaDon = soHoaDon + "0" + (rowCount + 1);
                } else {
                    soHoaDon = soHoaDon + "00" + (rowCount + 1);
                }
                System.out.println("soHoaDon: " + soHoaDon);
                ResultSet rs2 = HoaDonDAOImp.GetBySoHoaDon(soHoaDon);
                if (rs2.next()) {
                    dup = true;
                    rowCount++;
                    soHoaDon = dateFormat.format(d);
                } else {
                    dup = false;
                }
            } while (dup);

        } catch (SQLException ex) {
            System.out.println("Lỗi số hóa đơn");
        }

        return soHoaDon;
    }
    
    private static String MaSP;
    static int SoLuong;
    private static String tenSP;

    private void jtbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbSanPhamMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() >= 2) {

            MaSP = jtbSanPham.getValueAt(jtbSanPham.getSelectedRow(), 0).toString();
            SoLuong = Integer.parseInt(jtbSanPham.getValueAt(jtbSanPham.getSelectedRow(), 3).toString());
            AddSanPhamJDL jdl = new AddSanPhamJDL(this, true);
            jdl.setVisible(true);
            jdl.setResizable(false);
            System.out.println(SoLuong);

            tenSP = jtbSanPham.getValueAt(jtbSanPham.getSelectedRow(), 1).toString();
            double thanhTien, dongia;
            dongia = Double.parseDouble(jtbSanPham.getValueAt(jtbSanPham.getSelectedRow(), 2).toString());
            thanhTien = dongia * SoLuong;

            ThemSanPhamTbCTHD(MaSP, tenSP, SoLuong, dongia, thanhTien);
            txtTongTien.setText(ChuyenDoi.DinhDangTien(TinhTien()));

        }
    }//GEN-LAST:event_jtbSanPhamMouseClicked

    private void txtTienKhachTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienKhachTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienKhachTraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResultSet rsSP = HangHoaDAOImp.GetAll();
        ClassTableModel.DoDuLieu(jtbSanPham, rsSP);
        DoDuLieuVaoCBBLoaiSanPham(cbLoaiSP);
        String keyword = "";
        KhachHangDAOImp.DoDuLieuVaoCBBKhachHang(cbKhachHang, keyword);
    }//GEN-LAST:event_formWindowOpened

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void cbKhachHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKhachHangItemStateChanged
        // TODO add your handling code here:
        if (cbKhachHang.getItemCount() > 0) {
            MyCombobox cbb = (MyCombobox) cbKhachHang.getSelectedItem();
            KhachHang kh = KhachHangDAOImp.GetKHByMaKH(cbb.Value.toString());
            if (kh != null) {
                txtThongTinKH.setText(kh.getDiaChi());
                System.out.println(txtThongTinKH.getText());
            }
        }
    }//GEN-LAST:event_cbKhachHangItemStateChanged

    private void txtTimKhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKhachHangKeyReleased
        // TODO add your handling code here:
        String keyword = txtTimKhachHang.getText();
        KhachHangDAOImp.DoDuLieuVaoCBBKhachHang(cbKhachHang, keyword);
    }//GEN-LAST:event_txtTimKhachHangKeyReleased

    private void ThemSanPhamTbCTHD(String MaSP, String tenSP, int soLuong, double donGia, double thanhTien) {

        DefaultTableModel tbModel = (DefaultTableModel) jtbCTHD.getModel();

        Object obj[] = new Object[6];

        obj[0] = tbModel.getRowCount() + 1;
        obj[1] = MaSP;
        obj[2] = tenSP;
        obj[3] = soLuong;
        obj[4] = ChuyenDoi.DinhDangTien(donGia);
        obj[5] = ChuyenDoi.DinhDangTien(thanhTien);

        tbModel.addRow(obj);
    }

    public static double ChuyenTien(String tien) {
        try {
            return NumberFormat.getNumberInstance().parse(tien).doubleValue();
        } catch (ParseException ex) {

        }
        return 0;
    }

    private double TinhTien() {
        double tongTien = 0;
        for (int i = 0; i < jtbCTHD.getRowCount(); i++) {
            tongTien += ChuyenTien(jtbCTHD.getValueAt(i, 5).toString());
        }

        return tongTien;
    }
    
    public static void DoDuLieuVaoCBBLoaiSanPham(JComboBox cbb){
        try {
            ResultSet rs = HangHoaDAOImp.GetAll();
            
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
            MyCombobox cbb0 = new MyCombobox("Tất cả", 0);
            cbbModel.addElement(cbb0);
            while(rs.next()){
                MyCombobox mb = new MyCombobox(rs.getString("LoaiSanPham"), 
                                            rs.getString("MaLoaiSanPham"));
                cbbModel.addElement(mb);                
            }
        } catch (SQLException ex) {
        }
    }
    
    private void TaoMoiHD(){
        txtSoHoaDon.setText(SoHoaDon());
        
        DefaultTableModel tbModel = (DefaultTableModel)jtbCTHD.getModel();
        tbModel.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> cbKhachHang;
    private javax.swing.JComboBox<String> cbLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbTienThua;
    private javax.swing.JLabel jlbTongTien;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnThongTinHD;
    private javax.swing.JTable jtbCTHD;
    private javax.swing.JTable jtbSanPham;
    private javax.swing.JMenuItem mnXoaSP;
    private javax.swing.JPopupMenu pmnCTHD;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtSoHoaDon;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtThongTinKH;
    private javax.swing.JTextField txtTienKhachTra;
    private javax.swing.JTextField txtTimKhachHang;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
