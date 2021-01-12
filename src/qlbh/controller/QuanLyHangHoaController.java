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
import qlbh.model.HangHoa;
import qlbh.services.HangHoaServicesImp;
import qlbh.utility.ClassTableModel;
import qlbh.view.HangHoaFrm;
import qlbh.view.LoaiSanPhamFrm;
import qlbh.view.NhapSanPhamFrm;

/**
 *
 * @author Steven
 */
public class QuanLyHangHoaController {
    
    private JPanel jpnView;
    private JButton jbtnAdd;
    private JTextField jtfSearch;
    private JButton btnNhapSP;
    private JButton btnLoaiSP;
    
    public QuanLyHangHoaController(JPanel jpnView, JButton jbtnAdd, JTextField jtfSearch,
            JButton btnNhapSP, JButton btnLoaiSP) {
        this.jpnView = jpnView;
        this.jbtnAdd = jbtnAdd;
        this.jtfSearch = jtfSearch;
        this.btnNhapSP = btnNhapSP;
        this.btnLoaiSP = btnLoaiSP;
        this.hangHoaServicesImp = new HangHoaServicesImp();
        this.classTableModel = new ClassTableModel();
    }
    
    private HangHoaServicesImp hangHoaServicesImp = null;
    
    private ClassTableModel classTableModel = null;
    
    private final String[] listColumn = {"STT", "Mã Hàng", "Tên Hàng", "Loại Hàng", "Giá Bán",
        "Giá Nhập", "Nhà Cung Cấp", "Số Lượng"};
    
    private TableRowSorter<TableModel> row = null;
    
    public void setDataToTable() {
        List<HangHoa> listItem = hangHoaServicesImp.getList();
        DefaultTableModel model = classTableModel.setDeaultTableModelHH(listItem, listColumn);
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
        
        table.getColumnModel().getColumn(1).setMaxWidth(80);
        table.getColumnModel().getColumn(1).setMinWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    System.out.println(selectedRowIndex);
                    
                    HangHoa hh = new HangHoa();
                    hh.setMaHang(model.getValueAt(selectedRowIndex, 1).toString());
                    hh.setTenHang(model.getValueAt(selectedRowIndex, 2).toString());
                    hh.setLoaiSanPham(model.getValueAt(selectedRowIndex, 3).toString());
                    hh.setGiaBan((int) model.getValueAt(selectedRowIndex, 4));
                    hh.setGiaNhap((int) model.getValueAt(selectedRowIndex, 5));
                    hh.setNhaCungCap(model.getValueAt(selectedRowIndex, 6) != null
                            ? model.getValueAt(selectedRowIndex, 6).toString() : "");
                    hh.setSoLuong((int) model.getValueAt(selectedRowIndex, 7));
                    HangHoaFrm frm = new HangHoaFrm(hh);
                    frm.setTitle("Thông tin hàng hoá");
                    frm.setResizable(false);
                    frm.setLocationRelativeTo(null);
                    frm.setVisible(true);
                }
            }
            
        });
        
    }
    
    public void setEvents() {
        jbtnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HangHoaFrm frm = new HangHoaFrm(new HangHoa());
                frm.setVisible(true);
                frm.setTitle("Thông Tin Hàng Hoá");
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
        
        btnNhapSP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                NhapSanPhamFrm nhapsp = new NhapSanPhamFrm();
                nhapsp.setVisible(true);
                nhapsp.setTitle("Quản Lý Nhập Sản Phẩm");
                nhapsp.setResizable(false);
                nhapsp.setLocationRelativeTo(null);
                btnNhapSP.setBackground(new Color(0, 200, 83));
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                btnNhapSP.setBackground(new Color(0, 200, 83));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btnNhapSP.setBackground(new Color(0, 200, 83));
            }
        });
        
        btnLoaiSP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoaiSanPhamFrm loaisp = new LoaiSanPhamFrm();
                loaisp.setVisible(true);
                loaisp.setResizable(false);
                loaisp.setTitle("Quản Lý Loại Sản Phẩm");
                loaisp.setLocationRelativeTo(null);
                btnLoaiSP.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnLoaiSP.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLoaiSP.setBackground(new Color(0, 200, 83));
            }
                
        });
        
    }
}
