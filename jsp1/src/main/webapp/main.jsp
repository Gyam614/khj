<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 1</title>

<script>
	//main.jsp페이지를 열면 처음에 로그인하기 버튼과 회원가입하기 버튼 두개만
	//보여야 한다.
	//로그인하기 버튼 클릭하면 로그인 양식 보여야하고
	//회원가입 버튼 클릭하면 회원가입 양식 보여야함

	<%
		String show = request.getParameter("show");
		if(show==null)
			show="";
	%>
	
	
	
document.addEventListener("DOMContentLoaded", () => { 
	const sIn = document.getElementById("signIn");
	const sUp = document.getElementById("signUp");
	const sInBtn = document.getElementById("loginOn");
	const sUpBtn = document.getElementById("joinOn");
	
	sIn.style.display = "<%= show.equals("login") ? "block" : "none" %>";
	sUp.style.display = "<%= show.equals("join") ? "block" : "none" %>";
	
	
	sInBtn.addEventListener("click", function(){
		sIn.style.display = "block";
		sUp.style.display = "none";
	})
	
	sUpBtn.addEventListener("click", function(){
		sIn.style.display = "none";
		sUp.style.display = "block";
	});
	
});

</script>

</head>
<body>

	<%
		String userId = (String)session.getAttribute("user");
		if(userId != null) {
			out.print("<b>너의 심장에 박힌 이름 : "+userId+"</b>");
		}
	%>

	<div id="nav">
		<input type = "button" value = "로그인하기" id="loginOn">
		<input type = "button" value = "회원가입하기" id="joinOn">
	</div>

	
	<div id = "signIn">
		<h2>너의 마음속에 로그인</h2>
		<form method="post" action="signIn.jsp">
			아이디: <input type="text" name="loginId"> <br>
			비밀번호: <input type="password" name="loginPw"> <br>
			<button> 로그인 </button>			
			</form>
	</div>
	
<div id = "signUp">
	<h2>너의 마음에 가입</h2>
	<form method="post" action="signUp.jsp">
	
		<!-- input 태그에 name이 없으면 죽었다 깨어나도 데이터 전달 안됨. -->
		아이디: <input type = "text" name ="id" placeholder = "아이디를 입력하세요." ><br>
		비밀번호: <input type = "password" name = "pw"> <br>
		생년월일: <input type = "date" name ="birth" value = "2000-03-13"
		min = "1950-01-01" max = "2008-12-31"> <br>
		이메일: <input type ="email" name = "email"> <br>
		<button> 가입 </button>
	</form>
</div>
	
</body>
</html>