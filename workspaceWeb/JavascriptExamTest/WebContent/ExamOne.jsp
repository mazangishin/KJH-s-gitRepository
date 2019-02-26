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
	
	function registerFnc() { //가입 버튼을 누르면 작동
		
		var idObj = document.getElementById('id');
		var nameObj = document.getElementById('name');
		var pwdObj = document.getElementById('pwd');
		var pwdChkObj = document.getElementById('pwdChk');
		
		if (idObj.value == '') { //id에 아무런 값이 들어가지 않은 경우 알림창이 뜬다.
			alert('아이디를 입력하세요!');
			idObj.focus();
			return;
		}else if (nameObj.value == '') { //이름에 아무런 값이 들어가지 않은 경우 알림창이 뜬다.
			alert('이름을 입력하세요!');
			nameObj.focus();
			return;
		}else if (pwdObj.value == '') { //password에 아무런 값이 들어가지 않은 경우 알림창이 뜬다.
			alert('비밀번호를 입력하세요!');
			pwdObj.focus();
			return;
		}else if (pwdChkObj.value == '') { //password확인에 아무런 값이 들어가지 않은 경우 알림창이 뜬다.
			alert('비밀번호 확인란을 입력하세요!');
			pwdChkObj.focus();
			return;
		}else if (pwdChkObj.value != pwdObj.value) { //password와 password확인에 들어간 값이 다를 경우 알림창이 뜬다.
			alert('패스워드가 틀립니다.\n다시 확인하세요!!');
			pwdChkObj.value == '';
			pwdChkObj.focus();
			return;
		}else{ //문제 없을 시에 알림창이 뜬다.
			alert('성공적으로 가입이 되었습니다.');
		}
		
	}
</script>
</head>
<body>

	<form action="#" method="post">
		<div>
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
					<td colspan="2" style="text-align: right">
						<button onclick='registerFnc();'>가입</button> <!-- 가입 버튼 생성 -->
						<input type="reset" value="취소"> <!-- 취소를 누르면 입력된 값이 초기화됨 -->
					</td>	
				</tr>
			</table>
		</div>
	</form>
</body>
</html>