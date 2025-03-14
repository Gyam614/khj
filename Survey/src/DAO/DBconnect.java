package DAO;

import java.sql.*;

public class DBconnect {
	
	
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	protected DBconnect() {
		connection();
	}
	
	private void connection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		String user = "java";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/java";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
	}


}
