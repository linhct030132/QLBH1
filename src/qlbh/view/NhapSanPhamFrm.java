/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.view;

/**
 *
 * @author Steven
 */
public class NhapSanPhamFrm extends javax.swing.JFrame {

    /**
     * Creates new form NhapSanPhamFrm
     */
    public NhapSanPhamFrm() {
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

        jScrollPane18 = new javax.swing.JScrollPane();
        tblPhieuNhap_PhieuNhap = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        btnThem_PhieuNhap = new javax.swing.JButton();
        btnXoa_PhieuNhap = new javax.swing.JButton();
        btnSua_PhieuNhap = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblChiTietPhieuNhap_PhieuNhap = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        btnThemCTPN_PhieuNhap = new javax.swing.JButton();
        btnXoaXTPN_PhieuNhap = new javax.swing.JButton();
        btnSuaCTPN_PhieuNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPhieuNhap_PhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Phiếu Nhập", " Nhân Viên", "Nhà Phân Phối", "Tổng Tiền", "Ngày Nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuNhap_PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuNhap_PhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(tblPhieuNhap_PhieuNhap);

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setText(" Phiếu Nhập");

        btnThem_PhieuNhap.setText("Thêm ");
        btnThem_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhieuNhapActionPerformed(evt);
            }
        });

        btnXoa_PhieuNhap.setText("Xóa");
        btnXoa_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhieuNhapActionPerformed(evt);
            }
        });

        btnSua_PhieuNhap.setText("Sửa");
        btnSua_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhieuNhapActionPerformed(evt);
            }
        });

        tblChiTietPhieuNhap_PhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã CTPN", "Mã Phiếu Nhập", "Sản Phẩm", "Số Lượng", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietPhieuNhap_PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietPhieuNhap_PhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblChiTietPhieuNhap_PhieuNhap);
        if (tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumnCount() > 0) {
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setText("Chi Tiết Phiếu Nhập");

        btnThemCTPN_PhieuNhap.setText("Thêm ");
        btnThemCTPN_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTPN_PhieuNhapActionPerformed(evt);
            }
        });

        btnXoaXTPN_PhieuNhap.setText("Xóa");
        btnXoaXTPN_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaXTPN_PhieuNhapActionPerformed(evt);
            }
        });

        btnSuaCTPN_PhieuNhap.setText("Sửa");
        btnSuaCTPN_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTPN_PhieuNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThem_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnXoa_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThemCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoaXTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSuaCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_PhieuNhap)
                    .addComponent(btnXoa_PhieuNhap)
                    .addComponent(btnSua_PhieuNhap))
                .addGap(12, 12, 12)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCTPN_PhieuNhap)
                    .addComponent(btnXoaXTPN_PhieuNhap)
                    .addComponent(btnSuaCTPN_PhieuNhap))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPhieuNhap_PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuNhap_PhieuNhapMouseClicked
        int viTriDongVuaBam = tblPhieuNhap_PhieuNhap.getSelectedRow();
        txtMaPhieuNhap_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 1).toString());
        txtTongTien_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 4).toString());
        txtChuTich_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 6).toString());
        setSelectedCombobox(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 3).toString(), cbbNhaPhanPhoi_PhieuNhap);
        setSelectedCombobox(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 2).toString(), cbbNhanVien_PhieuNhap);

        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_PhieuNhap.getText());
        String ngaynhap = tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 5).toString();
        System.out.println("" + ngaynhap);
        String strngay, strthang, strnam;
        strngay = ngaynhap.substring(8, 10);
        strthang = ngaynhap.substring(5, 7);
        strnam = ngaynhap.substring(0, 4);
        int ngay, thang, nam;
        ngay = Integer.valueOf(strngay);
        thang = Integer.valueOf(strthang);
        nam = Integer.valueOf(strnam);
        cbbNgay_PhieuNhap.setSelectedItem(String.valueOf(ngay));
        cbbThang_PhieuNhap.setSelectedItem(String.valueOf(thang));
        cbbNam_PhieuNhap.setSelectedItem(String.valueOf(nam));
        txtMaPhieuNhap_CTPN.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 1).toString());
    }//GEN-LAST:event_tblPhieuNhap_PhieuNhapMouseClicked

    private void btnThem_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhieuNhapActionPerformed
        ThemPhieuJDL PN = new ThemPhieuJDL(this, true);
        PN.setVisible(true);
        PN.setTitle("Thêm Phiếu Nhập");
        
        String MaPhieuNhap, MaNhanVien, MaNhaPhanPhoi, TongTien, NgayNhap, ChuThich;
        MaPhieuNhap = txtMaPhieuNhap_PhieuNhap.getText();
        MaNhanVien = GetCbbSelected(cbbNhanVien_PhieuNhap);
        MaNhaPhanPhoi = GetCbbSelected(cbbNhaPhanPhoi_PhieuNhap);
        String ngay, thang, nam;
        ngay = cbbNgay_PhieuNhap.getSelectedItem().toString();
        thang = cbbThang_PhieuNhap.getSelectedItem().toString();
        nam = cbbNam_PhieuNhap.getSelectedItem().toString();
        NgayNhap = nam + "-" + thang + "-" + ngay;
        TongTien = txtTongTien_PhieuNhap.getText();
        ChuThich = txtChuTich_PhieuNhap.getText();
        String cautruyvan = "insert into PhieuNhap values("
        + " " + MaNhanVien + " , " + MaNhaPhanPhoi + " ," + TongTien
        + ",'" + NgayNhap + "', N'" + ChuThich + "')";
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if(txtTongTien_PhieuNhap.getText().equals("")){
            txtTongTien_PhieuNhap.setText("0");
            TongTien="0";
        }
        if (kiemtra) {
            HUYPHPK00628_ASM_GD2.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm Khách Hàng", "lỗi", 2);
        }
        LayDuLieuPhieuNhap();
    }//GEN-LAST:event_btnThem_PhieuNhapActionPerformed

    private void btnXoa_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhieuNhapActionPerformed
        if (!txtMaPhieuNhap_PhieuNhap.getText().equals("")) {
            String MaPhieuNhap = txtMaPhieuNhap_PhieuNhap.getText();
            String cautruyvan = "delete PhieuNhap where MaPhieuNhap=" + MaPhieuNhap;
            String ctvKiemThu = "select count(MaCTPN) as SoChiTietPhieuMua"
            + " from PhieuNhap,ChiTietPhieuNhap where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and "
            + "PhieuNhap.MaPhieuNhap= " + MaPhieuNhap;
            ResultSet rs1 = huyphpk00628_asm_gd2.HUYPHPK00628_ASM_GD2.connection.ExcuteQueryGetTable(ctvKiemThu);
            System.out.println(ctvKiemThu);
            int so1 = 0;
            try {
                if (rs1.next()) {
                    so1 = rs1.getInt("SoChiTietPhieuMua");
                    if (rs1.getInt("SoChiTietPhieuMua") == 0) {
                        huyphpk00628_asm_gd2.HUYPHPK00628_ASM_GD2.connection.ExcuteQueryUpdateDB(cautruyvan);
                        System.out.println("đã xóa");
                        LayDuLieuPhieuNhap();
                    } else {
                        ThongBao("không thể xóa bởi Phiếu nhập đã có " + so1 + " chi tiết Phiếu nhập!", "báo lỗi", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ThongBao("bạn chưa chọn Phiếu nhập để xóa", "xóa bằng niềm tin à!khi không biết xóa cái nào", 2);
        }
    }//GEN-LAST:event_btnXoa_PhieuNhapActionPerformed

    private void btnSua_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhieuNhapActionPerformed
        String MaPhieuNhap, MaNhanVien, MaNhaPhanPhoi, TongTien, NgayNhap, ChuThich;
        MaPhieuNhap = txtMaPhieuNhap_PhieuNhap.getText();
        MaNhanVien = GetCbbSelected(cbbNhanVien_PhieuNhap);
        MaNhaPhanPhoi = GetCbbSelected(cbbNhaPhanPhoi_PhieuNhap);
        String ngay, thang, nam;
        ngay = cbbNgay_PhieuNhap.getSelectedItem().toString();
        thang = cbbThang_PhieuNhap.getSelectedItem().toString();
        nam = cbbNam_PhieuNhap.getSelectedItem().toString();
        NgayNhap = nam + "-" + thang + "-" + ngay;
        TongTien = txtTongTien_PhieuNhap.getText();
        ChuThich = txtChuTich_PhieuNhap.getText();
        String cautruyvan = "update  PhieuNhap set "
        + " MaNhanVien= " + MaNhanVien + " , MaNhaPhanPhoi=" + MaNhaPhanPhoi + " ,TongTien=" + TongTien
        + ",NgayNhap='" + NgayNhap + "', ChuThich=N'" + ChuThich + "'where MaPhieuNhap=" + MaPhieuNhap;
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (!txtMaPhieuNhap_PhieuNhap.equals("")) {
            HUYPHPK00628_ASM_GD2.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công");
        } else {
            ThongBao("Bạn chọn phiếu nhập!", "lỗi", 2);
        }
        LayDuLieuPhieuNhap();
    }//GEN-LAST:event_btnSua_PhieuNhapActionPerformed

    private void tblChiTietPhieuNhap_PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietPhieuNhap_PhieuNhapMouseClicked
        int viTriDongVuaBam = tblChiTietPhieuNhap_PhieuNhap.getSelectedRow();
        txtMaCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 1).toString());
        txtMaPhieuNhap_CTPN.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 2).toString());
        setSelectedCombobox(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 3).toString(), cbbSanPhamCTPN_PhieuNhap);
        txtSoLuongCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 4).toString());
        txtTongTienCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 5).toString());
        txtChuThichCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 6).toString());
    }//GEN-LAST:event_tblChiTietPhieuNhap_PhieuNhapMouseClicked

    private void btnThemCTPN_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTPN_PhieuNhapActionPerformed
        String MaCTPN,MaPhieuNhap,MaSanPham,SoLuong,TongTien,ChuThich;
        MaCTPN=txtMaCTPN_PhieuNhap.getText();
        MaPhieuNhap=txtMaPhieuNhap_PhieuNhap.getText();
        MaSanPham=GetCbbSelected(cbbSanPhamCTPN_PhieuNhap);
        SoLuong=txtSoLuongCTPN_PhieuNhap.getText();
        TongTien=txtTongTienCTPN_PhieuNhap.getText();
        ChuThich=txtChuThichCTPN_PhieuNhap.getText();

        String tb="", cautruyvan = "insert into ChiTietPhieuNhap values("
        + " " + MaPhieuNhap + " , " + MaSanPham + " ," + SoLuong
        + "," + TongTien + ", N'" + ChuThich + "')";
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if(txtSoLuongCTPN_PhieuNhap.equals("")){
            tb+="Chưa nhập Số lượng";
            kiemtra=false;}
        try {
            int bien= Integer.valueOf(txtSoLuongCTPN_PhieuNhap.getText());

        } catch (Exception e) {
            kiemtra=false;
            tb+="Số lượng phải nhập bằng số";
        }
        if (!txtMaPhieuNhap_CTPN.equals("") && kiemtra==true) {

            HUYPHPK00628_ASM_GD2.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm ", "lỗi", 2);
        }
        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_CTPN.getText());
    }//GEN-LAST:event_btnThemCTPN_PhieuNhapActionPerformed

    private void btnXoaXTPN_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaXTPN_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaXTPN_PhieuNhapActionPerformed

    private void btnSuaCTPN_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTPN_PhieuNhapActionPerformed
        String MaCTPN,MaPhieuNhap,MaSanPham,SoLuong,TongTien,ChuThich;
        MaCTPN=txtMaCTPN_PhieuNhap.getText();
        MaPhieuNhap=txtMaPhieuNhap_PhieuNhap.getText();
        MaSanPham=GetCbbSelected(cbbSanPhamCTPN_PhieuNhap);
        SoLuong=txtSoLuongCTPN_PhieuNhap.getText();
        TongTien=txtTongTienCTPN_PhieuNhap.getText();
        ChuThich=txtChuThichCTPN_PhieuNhap.getText();

        String tb="", cautruyvan = "update  ChiTietPhieuNhap set "
        + " "  + " MaSanPham= " + MaSanPham + " ,SoLuong=" + SoLuong
        + ",TongTien=" + TongTien + ", ChuThich=N'" + ChuThich + "'where MaCTPN="+MaCTPN;
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if(txtSoLuongCTPN_PhieuNhap.equals("")){
            tb+="Chưa nhập Số lượng";
            kiemtra=false;}
        try {
            int bien= Integer.valueOf(txtSoLuongCTPN_PhieuNhap.getText());

        } catch (Exception e) {
            kiemtra=false;
            tb+="Số lượng phải nhập bằng số";
        }
        if (!txtMaPhieuNhap_CTPN.equals("") && kiemtra==true) {

            HUYPHPK00628_ASM_GD2.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã sửa Thành Công");
        } else {
            ThongBao("Không thể Thêm ", "lỗi", 2);
        }
        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_CTPN.getText());
    }//GEN-LAST:event_btnSuaCTPN_PhieuNhapActionPerformed

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
            java.util.logging.Logger.getLogger(NhapSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapSanPhamFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaCTPN_PhieuNhap;
    private javax.swing.JButton btnSua_PhieuNhap;
    private javax.swing.JButton btnThemCTPN_PhieuNhap;
    private javax.swing.JButton btnThem_PhieuNhap;
    private javax.swing.JButton btnXoaXTPN_PhieuNhap;
    private javax.swing.JButton btnXoa_PhieuNhap;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JTable tblChiTietPhieuNhap_PhieuNhap;
    private javax.swing.JTable tblPhieuNhap_PhieuNhap;
    // End of variables declaration//GEN-END:variables
}
