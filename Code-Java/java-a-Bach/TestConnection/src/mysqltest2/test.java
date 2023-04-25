package mysqltest2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql. DriverManager;
/**
 *
 * @author ADMIN
 */
public class test {
    
    
    Connection getConnection() {
    	Connection con = null;
    	
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","");
				System.out.println("ket noi thanh cong");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
		return con;
    }
        
    public static void main(String[] args) {
    	test test = new test();
    	test.getConnection();
	}
}
