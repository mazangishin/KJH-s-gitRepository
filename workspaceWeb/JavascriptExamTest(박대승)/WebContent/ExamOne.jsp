<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
table, tr, td {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 210px;
}

</style>

<title>회원가입</title>

<script type="text/javascript">
	function registerFnc() {
		var id = document.getElementById('id');
		var idChk = document.getElementById('id').value;
		var name = document.getElementById('name');
		var nameChk = document.getElementById('name').value;
		var pwd= document.getElementById('pwd');
		var pwdChk = document.getElementById('pwd').value;
		var repwd = document.getElementById('pwdChk');
		var repwdChk = document.getElementById('pwdChk').value;
		
		
		
		
		if(idChk == ''){
			alert('아이디를 입력하세요!');			
			id.focus();
			return;
		}else if(nameChk == ''){
			alert('이름을 입력하세요!');
			name.focus();
			return;
		}else if(pwdChk == ''){
			alert('비밀번호를 입력하세요!');
			pwd.focus();
			return;
		}else if(repwdChk == ''){
			alert('비밀번호 확인란을 입력하세요!');
			repwd.focus();
			return;
		}else if(pwdChk != repwdChk){
			alert('패스워드가 틀립니다.'+'\n'+'다시 확인하세요!!');
			repwd.focus();
			repwdChk = '';
			return;
		}else{
			alert('"성공적으로 가입이 되었습니다."');
			return;
		}
		
	}
</script>
</head>
<body>

	<form action="#" method="post">
		<table id='userAccountTable'>
			<tr>
				<td>id</td>
				<td><input type="text" id='id' class='id' name="id" size="15"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id='name' class='name' name="name" size="15"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" id='pwd' class='pwd' name="pwd" size="15"></td>
			</tr>
			<tr>
				<td>password확인</td>
				<td><input type="password" id='pwdChk' class='pwdChk' name="pwdChk" size="15"></td>
			</tr>
			<tr>
				<td colspan="2" style="border: 1px solid black; text-align: right;">
					<button onclick="registerFnc()">가입</button>
					<input type="reset" value="취소"/>
				</td>
			</tr>
			
		</table>
		
		
	</form>
</body>
</html>