<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style> 
		* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		}
		
		h2 {
			display: flex;
			align-items: center;
			justify-content: center;
		}
	
		.container {
		display: flex;
		gap: 30px;
		align-items: flex-start;
		justify-content: center;
		margin: 0 auto;
		}
		
		.option {
			display: flex;
			flex-direction: column;
			align-items: flex-start;
			gap: 5px;
			align-items: left;
		}
		
		#contentContainer {
			display: flex;
			flex-direction: column;
			align-items: center;
			width: 100%;
			max-width:400px;
			margin: 10px auto;
			
		}
	
		#title, #writer {
		width: 150px;
		}
	
		#content {
			margin: 0 auto;
			width: 400px;
			height: 400px;
			line-height: 20px;
			}
			
			
		button {
			 width: 100%;
    		height: 40px;
   			margin-top: 10px;
   		 	display: flex;
    		justify-content: center;
    		align-items: center;
    	
		}	
	</style>
</head>
<body>

	<div id = "board">
		<h2> 게시글 작성 </h2>
		<form method = "post" action="save.jsp">
		
			<!--input 태그에 꼭 name 적기!-->
			
		<div class = "container">
			<div class = "option">
				<label for="title">글제목</label>
				<input type = "text" name = "title" id = "title"> <br> 
			</div>
			<div class = "option"> 
				<label for="writer">작성자</label>
				<input type = "text" name = "writer" id = "writer"> <br>
			</div>
		</div>
		<div class = "option" id="contentContainer">
			<label for="content">내용</label>
			<textarea name = "content" id = "content" placeholder = "내용을 입력해주세요."></textarea> <br>
			<button> 게시 </button>
		</div>
		</form>
	</div>

</body>
</html>