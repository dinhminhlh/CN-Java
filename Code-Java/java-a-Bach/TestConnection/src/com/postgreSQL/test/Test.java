package com.postgreSQL.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")

public class Test {
	
	private static String url = "jdbc:postgresql://localhost:5432/testdb"; 
	private static String user = "postgres";
	private static String password = "1234";
	
	Connection getConnection() {
		Connection cnt = null;
		try {
			cnt = DriverManager.getConnection(url,user,password);
			System.out.println("Connected to PostgreSQL");
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		Test app = new Test();
		app.getConnection();
	}
}
