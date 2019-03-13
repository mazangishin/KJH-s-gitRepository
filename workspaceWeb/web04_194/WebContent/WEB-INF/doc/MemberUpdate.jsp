<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
		<h1>회원등록</h1>
		<form action='./update' method='post'>
			번호 : <input type='text' name='memberno'><br/>
			이름 : <input type='text' name='name'><br/>
			이메일 : <input type='text' name='email'><br/>
			비밀번호 : <input type='text' name='pwd'><br/>
			가입일 : <br/>
			<input type='submit' value='수정'>
			<input type='reset' value='취소'>
		</form>
		
<script type="text/javascript">

</script>
</body>
</html>