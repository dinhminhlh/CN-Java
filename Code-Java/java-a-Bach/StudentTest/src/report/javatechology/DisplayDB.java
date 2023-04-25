/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class DisplayDB {
     static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";  
     static final String DB_URL = "jdbc:mysql://localhost:3306/qlsv";
     static final String USER = "root";
     static final String PASS = "";
     static final String QUERY = "SELECT rollNo, fullName, grade, gpa FROM student";
     
     
     @SuppressWarnings("null")
    public void getData(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName(DRIVER_CLASS);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(QUERY);
            System.out.printf("%-10s %-20s %-10s %-10s\n" , "id","fullname","grade","gpa");
            while(rs.next()){
                System.out.printf("%-10s %-20s %-10s %-10.2f\n", rs.getString("rollNo"), rs.getString("fullName"), rs.getString("grade"), rs.getFloat("gpa"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException ex) {
             Logger.getLogger(DisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }finally{  
          try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}
