/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import qlbh.controller.ConnectToSQL;
import qlbh.model.LoaiSanPham;

/**
 *
 * @author Steven
 */
public class LoaiSanPhamFrm extends javax.swing.JFrame {

    /**
     * Creates new form LoaiSanPhamFrm
     */
    public LoaiSanPhamFrm() {
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

        jButton3 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSanPham_LoaiSanPham = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        btnThemLoai = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLoaiSanPham = new javax.swing.JTable();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel73.setText("Loại Sản Phẩm");

        tblSanPham_LoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sản Phẩm ", "Tên Sản Phẩm", "Loại Sản Phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblSanPham_LoaiSanPham);

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setText(" Sản Phẩm");

        btnThemLoai.setBackground(new java.awt.Color(76, 175, 80));
        btnThemLoai.setText("+Thêm ");
        btnThemLoai.setBorder(null);
        btnThemLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiActionPerformed(evt);
            }
        });

        jScrollPane3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jScrollPane3ComponentShown(evt);
            }
        });

        tblLoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Loại Sản Phẩm ", "Tên Loại Sản Phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLoaiSanPham);
        if (tblLoaiSanPham.getColumnModel().getColumnCount() > 0) {
            tblLoaiSanPham.getColumnModel().getColumn(0).setResizable(false);
            tblLoaiSanPham.getColumnModel().getColumn(1).setResizable(false);
            tblLoaiSanPham.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addComponent(jLabel74)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(jLabel73)
                .addContainerGap(489, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel74)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String MaLoai;
    private static String TenLoai;

    private void btnThemLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiActionPerformed
        // TODO add your handling code here:

        ThemLoaiSpJDL them = new ThemLoaiSpJDL(this, true);
        them.setVisible(true);
        them.setTitle("Thêm Loại Sản Phẩm");
        layDuLieuLoaiSanPham();

    }//GEN-LAST:event_btnThemLoaiActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        layDuLieuLoaiSanPham();

    }//GEN-LAST:event_formWindowOpened

    private void jScrollPane3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane3ComponentShown

    private void tblLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSanPhamMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() >= 2) {
            LayDuLieuSanPhamofLoaiSanPham((String) tblLoaiSanPham.getValueAt(tblLoaiSanPham.getSelectedRow(), 1));
            System.out.println(tblLoaiSanPham.getValueAt(tblLoaiSanPham.getSelectedRow(), 1));

        }
    }//GEN-LAST:event_tblLoaiSanPhamMouseClicked

    public void layDuLieuLoaiSanPham() {
        String sql = "";
        sql = "select * from tb_loaisanpham ";
        Connection conn = ConnectToSQL.getConnection();
        DefaultTableModel tableModel = (DefaultTableModel) tblLoaiSanPham.getModel();
        tableModel.setRowCount(0);
        Object[] item = new Object[3];
        int c = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                c++;

                item[0] = c;
                item[1] = rs.getString("MaLoaiSanPham");
                item[2] = rs.getString("TenLoaiSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void LayDuLieuSanPhamofLoaiSanPham(String MaLoaiSanPham) {
        String sql = "";
        sql = "select MaHang,tb_HangHoa.TenHang,tb_LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham from tb_HangHoa,tb_LoaiSanPham where"
                + " tb_HangHoa.LoaiSanPham=tb_LoaiSanPham.MaLoaiSanPham and MaLoaiSanPham=" + MaLoaiSanPham;
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm"};
        Connection conn = ConnectToSQL.getConnection();
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham_LoaiSanPham.setModel(tableModel);
        int c = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaSanPham");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getString("TenLoaiSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
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
            java.util.logging.Logger.getLogger(LoaiSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoaiSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoaiSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoaiSanPhamFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaiSanPhamFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemLoai;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblLoaiSanPham;
    private javax.swing.JTable tblSanPham_LoaiSanPham;
    // End of variables declaration//GEN-END:variables
}
