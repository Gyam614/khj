<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   

<%!
//선언문 - 변수, 메서드선언, 클래스 정의
int age = 0;
int[] arr = new int[]{10,20,30,40,50,60};
%>

<%  
//스크립틀릿 - 메서드선언과 클래스 정의를 제외한 자바 언어 구현 가능
age = 25;
%>

<%= age
//표현식
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= age %></h1>
	<ul>
		<%
			for(int i=0; i<arr.length; i++) {
		%>
			<li> <%= arr[i] %> </li>
		<% } %>
	</ul>

</body>
</html>