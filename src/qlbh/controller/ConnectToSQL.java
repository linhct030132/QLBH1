/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven
 */
public class ConnectToSQL {
    
    
    public static Connection getConnection() { 
        try {
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH", "root", "123456");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static ResultSet GetData(String sql){
        try {
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH", "root", "123456");
            Statement stm = conn.createStatement();           
            ResultSet rs = stm.executeQuery(sql);
            
            return rs;
            
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu");
            return null; 
        }
    }
    
     public static int ExecuteTruyVan(String sql){
        try {
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH", "root", "123456");
            Statement stm = conn.createStatement();
            int kq = stm.executeUpdate(sql);
            return kq;
        } catch (SQLException ex) {
            System.out.println("Lỗi thực thi lệnh SQL");
            return -1;
        }        
    }
    
    public static void main(String args[]) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }
}
    
     

