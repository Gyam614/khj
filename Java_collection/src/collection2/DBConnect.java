package collection2;

import java.sql.*;

public class DBConnect {
	public Connection conn;
	public Statement st;
	public ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	private void connection() {
		//드라이버 로드
		//계정 로그인 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로드 실패");
			e.printStackTrace();
		}
	
	
	
	
	try {
		String user = "java";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/java";
		conn = DriverManager.getConnection(url,user,password);
		
	} catch(SQLException e)	{
		System.out.println("드라이브 로드 실패");
		e.printStackTrace();
	}
	
	try {
		st = conn.createStatement();
//		rs = st.executeQuery();
	} catch(SQLException e) {
		System.out.println("드라이버 로드 실패");
	}
	
	}
}
