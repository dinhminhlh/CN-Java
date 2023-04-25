package mysqltest3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	
	@SuppressWarnings("unused")
	Connection getConnection() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/quanlysanpham","root","");
			System.out.println("Ket noi thanh cong");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {		
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.getConnection();
	}
}
