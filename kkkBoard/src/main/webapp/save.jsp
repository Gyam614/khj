
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.time.format.DateTimeFormatter"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>

<%
	String myTitle = request.getParameter("title");
	String me = request.getParameter("writer");
	String myContent = request.getParameter("content");
	
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String date = dateTime.format(formatter);
	
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pt = null;
	
	
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user = "java";
	String password = "1234";
	String url = "jdbc:mysql://localhost:3306/java";
	conn = DriverManager.getConnection(url, user, password);
	
	} catch(Exception e){
		System.out.println("드라이버 로드 실패");
		e.printStackTrace(); 
		}
	
	
	//게시글 작성 DB로 저장
	
	
	
	String sql = "insert into board(title, writer, content, date) values(?,?,?,?)";
	
	try {
		pt = conn.prepareStatement(sql);
		pt.setString(1, myTitle);
		pt.setString(2, me);
		pt.setString(3, myContent);
		pt.setString(4, date);
		pt.executeUpdate();
		System.out.println("게시글 업로드 완료");
		
		} catch(SQLException e){
			System.out.println("게시글 작성 실패");
			e.printStackTrace(); 
			}
			
		%>
		
		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 게시글 작성 완료! </h2>

	<a href = "board.jsp"> 글 작성창으로 돌아가기 </a>

</body>
</html>