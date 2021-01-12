/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import qlbh.model.KhachHang;
import qlbh.services.KhachHAngSerivcesImp;
import qlbh.services.KhachHangServices;
import qlbh.utility.ClassTableModel;
import qlbh.view.KhachHangFrm;

/**
 *
 * @author Steven
 */
public class QuanLyKhachHangController {

    private JPanel jpnView;
    private JButton jbtnAdd;
    private JTextField jtfSearch;
    private JButton jbtnDelete;

    private KhachHangServices khachHangServices = null;

    private ClassTableModel classTableModel = null;

    private String[] listColumn = {"STT", "Mã Khách Hàng", "Họ Và Tên", "Giới Tính", "Ngày Sinh",
        "Địa Chỉ", "SĐT"};

    private TableRowSorter<TableModel> row = null;

    public QuanLyKhachHangController(JPanel jpnView, JButton jbtnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.jbtnAdd = jbtnAdd;
        this.jtfSearch = jtfSearch;
        this.jbtnDelete = jbtnDelete;

        this.khachHangServices = new KhachHAngSerivcesImp();

        this.classTableModel = new ClassTableModel();
    }

    public void setDataToTable() {
        List<KhachHang> listItem = khachHangServices.getList();
        DefaultTableModel model = classTableModel.setDeaultTableModelKH(listItem, listColumn);
        JTable table = new JTable(model);
        row = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(row);
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    row.setRowFilter(null);
                } else {
                    row.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    row.setRowFilter(null);
                } else {
                    row.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        table.getTableHeader().setFont(new Font("San Serif", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300, 400));

        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();

        //Chỉnh sỉze cột
        table.getColumnModel().getColumn(0).setMaxWidth(60);
        table.getColumnModel().getColumn(0).setMinWidth(60);
        table.getColumnModel().getColumn(0).setPreferredWidth(60);

        table.getColumnModel().getColumn(3).setMaxWidth(80);
        table.getColumnModel().getColumn(3).setMinWidth(80);
        table.getColumnModel().getColumn(3).setPreferredWidth(80);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    System.out.println(selectedRowIndex);

                    KhachHang kh = new KhachHang();
                    kh.setMaKH(model.getValueAt(selectedRowIndex, 1).toString());
                    kh.setHoTenKH(model.getValueAt(selectedRowIndex, 2).toString());
                    kh.setNgaySinh((Date) model.getValueAt(selectedRowIndex, 4));
                    kh.setGioiTinh(model.getValueAt(selectedRowIndex, 3).toString().equalsIgnoreCase("Nam"));
                    kh.setSDT(model.getValueAt(selectedRowIndex, 5) != null
                            ? model.getValueAt(selectedRowIndex, 5).toString() : "");
                    kh.setDiaChi(null != model.getValueAt(selectedRowIndex, 6)
                            ? model.getValueAt(selectedRowIndex, 6).toString() : "");

                    KhachHangFrm frm = new KhachHangFrm(kh);
                    frm.setTitle("Thông tin khách hàng");
                    frm.setResizable(false);
                    frm.setLocationRelativeTo(null);
                    frm.setVisible(true);
                }
            }

        });

    }

    public void setEvents() {
//        jbtnDelete.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                DefaultTableModel model = new DefaultTableModel();
//                JTable table = new JTable(model);
//
//                model = (DefaultTableModel) table.getModel();
//                int selectedRowIndex = table.getSelectedRow();
//                System.out.println(selectedRowIndex);
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                jbtnDelete.setBackground(new Color(0, 200, 83));
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                jbtnDelete.setBackground(new Color(100, 221, 23));
//            }
//
//        });
        jbtnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                KhachHangFrm frm = new KhachHangFrm(new KhachHang());
                frm.setVisible(true);
                frm.setTitle("Thông Tin Nhân Viên");
                frm.setLocationRelativeTo(null);
                frm.setResizable(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jbtnAdd.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbtnAdd.setBackground(new Color(100, 221, 23));
            }

        });

    }
}
