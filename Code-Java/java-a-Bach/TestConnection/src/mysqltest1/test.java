
package mysqltest1;

import com.mysql.cj.jdbc.Driver;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class test {


    @SuppressWarnings({})
    public static void main(String[] args) throws SQLException {
        
        try{
            String strConn = "jdbc:mysql://localhost/quanlysanpham"; // neu de localhost:8888 thi bi treo chuong trinh ????
            Properties pro = new Properties();
            pro.put("user", "root");
            pro.put("password", "");

            Driver driver = new Driver();

            java.sql.Connection conn = driver.connect(strConn, pro);

            if (conn != null) {
                System.out.println("Ket noi thanh cong");
            } else {
                System.err.println("Ket noi khong thanh cong");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
