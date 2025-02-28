package study0228_5;

import java.sql.*;

public class DBConnect { // 데이터베이스 연결 작업
	
	private Connection conn; // 계정 로그인 상태 저장
	private Statement st; //쿼리문 보내기 위해 필요
	private ResultSet rs; //조회 결과 받기
	
	protected DBConnect() {
		connection(); // 데이터베이스 연결
	}
	
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "java";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/java";
			
			conn = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결 실패");
			e.printStackTrace();
		}
	}

}
