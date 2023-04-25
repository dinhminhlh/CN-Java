/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class InsertData {
    static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/qlsv";
    static final String USER = "root";
    static final String PASS = "";
    String sql = "INSERT INTO student(rollNo,fullName,grade,gpa)" + "VALUES(?,?,?,?)";
    
    @SuppressWarnings("null")
    public void addData(Student student){
        PreparedStatement  pstm = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, student.getRollNo());
            pstm.setString(2, student.getFullName());
            pstm.setString(3, student.getGrade());
            pstm.setFloat(4, student.getGpa());
            
            pstm.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
