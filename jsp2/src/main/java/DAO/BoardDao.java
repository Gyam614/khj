package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Board;

public class BoardDao {
   
   private Connection conn;
   private PreparedStatement pt;
   private ResultSet rs;
   
   public BoardDao() {
      connect();
   }
   
   public void insert(Board board) {
	   //쿼리문 작성하고 PreparedStatement를 사용하여 저장되게 만들기
	   String sql = "insert into jsp_board(writer, title, content, write_date)"
				+ "values(?,?,?,now())";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, board.getWriter());
			pt.setString(2, board.getTitle());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
			System.out.println("게시글 업로드 완료");
				
			}catch(Exception e) {
				System.out.println("게시글 업로드 실패");
				e.printStackTrace();
			}
   }
   
   public boolean loginCheck(String email,String pw) {
      String sql = "select * from test_member "+
               "where email=? and password=?";
      try {
         pt = conn.prepareStatement(sql);
         pt.setString(1, email);
         pt.setString(2, pw);
         rs=pt.executeQuery();
         if(rs.next())return true; // 로그인 성공
      }catch(SQLException e) {
         System.out.println(" 아이디 비번 조회 실패");
         e.printStackTrace();
      }
      return false; // 로그인 실패 -아이디 또는 비번틀림
   }
   public void connect() {
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String user = "kimhj";
         String pass = "1234";
         String url = "jdbc:mysql://210.219.170.244:3306/kimhj";
         conn = DriverManager.getConnection(url,user,pass);
         
         
      }catch(Exception e){
         System.out.print("드라이버 로드 실패및 접속 실패");
         e.printStackTrace();
      }
   }

public ArrayList<Board> select() {
	// TODO Auto-generated method stub
	ArrayList<Board> list = new ArrayList<>();
	
	String sql = "select * from jsp_board order by board_id desc";
	try {
		pt = conn.prepareStatement(sql);
		rs = pt.executeQuery();
		while(rs.next()) {
			Board data = new Board(rs.getInt("board_id"),
						rs.getString("writer"), rs.getString("title"),
						rs.getString("content"),
						rs.getDate("write_date").toLocalDate());
			list.add(data);
		}
		
	}catch(SQLException e) {
		System.out.println("게시판 전체 조회 실패");
	};
	return list;
}

}
