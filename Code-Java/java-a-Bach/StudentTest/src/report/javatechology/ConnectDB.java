/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class ConnectDB {
    //khai báo các tham số kết nối
    static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/qlsv";
    static final String USER = "root";
    static final String PASS = "";
    
    public Connection getConnectDB(){
        //Khai báo đối tượng kết nối
        Connection conn = null;           
        try {
            //Nạp driver của mysql vào để sử dụng
           Class.forName(DRIVER_CLASS);         
            //Thực hiện kết nối đến db
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("connect successfully!");
        } catch (ClassNotFoundException ex) {
            System.out.println("connect failure!");
            System.err.println("Not found driver. Detail: " + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Not connection to MySQL. Detail: " + ex.getMessage());
        }        
        //Trả về kết nối
        return conn;
    }
    
}
