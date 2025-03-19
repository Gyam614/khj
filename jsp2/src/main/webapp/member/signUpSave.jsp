<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%-- signUpSave.jsp --%>
    
<%@ page import="java.sql.*" %>

<%
	
	Connection conn = null;
	PreparedStatement pt = null;



	
	try{
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user = "kimhj";
	String password = "1234";
	String url = "jdbc:mysql://210.219.170.244:3306/kimhj";
	conn = DriverManager.getConnection(url, user, password);
	
	}
	
	catch(Exception e){
		System.out.println("드라이버 로드 실패");
		e.printStackTrace(); 
		
		}
	
	String email = request.getParameter("email");
	String pw = request.getParameter("password");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String tempY = request.getParameter("birthY");
	String tempM = request.getParameter("birthM");
	int year = Integer.parseInt(tempY);
	int month = Integer.parseInt(tempM);
	
	
	String query = "insert into test_member(email, password, name," +
				"tel, birth_year, birth_month) values(?,?,?,?,?,?)";
	
	try {
		pt = conn.prepareStatement(query);
		pt.setString(1,email);
		pt.setString(2,pw);
		pt.setString(3, name);
		pt.setString(4, tel);
		pt.setInt(5,year);
		pt.setInt(6, month);
		pt.executeUpdate();
		
	} catch(Exception e) {
		System.out.println("회원가입 실패");
		e.printStackTrace(); 
	};
	
	%>
	
	<%= email %>