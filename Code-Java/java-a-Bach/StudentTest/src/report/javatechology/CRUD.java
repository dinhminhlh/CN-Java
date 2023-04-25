/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class CRUD {
     static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";  
     static final String DB_URL = "jdbc:mysql://localhost:3306/qlsv";
     static final String USER = "root";
     static final String PASS = "";
     private List<Student> studentList = new ArrayList<>();
    
    
    public List<Student> findAll() {
        
        
        Connection conn = null;
        Statement stm = null;
        
        try {
            //lay tat ca danh sach sinh vien
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            //query
            String sql = "select * from student";
            stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {                
                Student std = new Student(
                        rs.getString("rollNo"), 
                        rs.getString("fullName"),
                        rs.getString("grade"),
                        rs.getFloat("gpa"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        return studentList;
    }
    
    public static void insert(Student std) {
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            //lay tat ca danh sach sinh vien
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            //query
            String sql = "INSERT INTO student(rollNo,fullName,grade,gpa)" + "VALUES(?,?,?,?)";
            pstm = conn.prepareCall(sql);
            
            pstm.setString(1, std.getRollNo());
            pstm.setString(2, std.getFullName());
            pstm.setString(3, std.getGrade());
            pstm.setFloat(4, std.getGpa());
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void update(Student std) {
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            //lay tat ca danh sach sinh vien
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            //query
            String sql = "update student set rollno=?,fullname=?,grade=?,gpa=? where rollno = ?";
            pstm = conn.prepareCall(sql);
            
            pstm.setString(1, std.getRollNo());
            pstm.setString(2, std.getFullName());
            pstm.setString(3, std.getGrade());
            pstm.setFloat(4, std.getGpa());
            pstm.setString(5, std.getRollNo());
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void delete(String rollNo) {
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            //lay tat ca danh sach sinh vien
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            //query
            String sql = "delete from student where rollno = ?";
            pstm = conn.prepareCall(sql);
            
            pstm.setString(1, rollNo);
            
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
}
