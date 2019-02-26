<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table, tr, td, th{
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	.input{
		width: 130px;
	}
	
	.card{
		border-collapse: collapse;
		border: 0px;
		height: 30px;
	}
	
	
	
</style>

<script type="text/javascript">
	function businessCardMakeFnc(){
		var reCompanyName = document.getElementById('companyName').value;
		var reName = document.getElementById('name').value;
		var reMail = document.getElementById('mail').value;
		var reAddr = document.getElementById('addr').value;
		var reTel = document.getElementById('tel').value;
		
		var businessCompanyName = document.getElementById('businessCompanyName');
		var personName = document.getElementById('personName');
		var businessMail = document.getElementById('businessMail');
		var businessAddr = document.getElementById('businessAddr');
		var businessTel = document.getElementById('businessTel');
		
		
		
		
		
		businessCompanyName.innerHTML = reCompanyName;
		personName.innerHTML = reName;
		businessMail.innerHTML = reMail;
		businessAddr.innerHTML = reAddr;
		businessTel.innerHTML = reTel;
		
		
		
		
	}
</script>

<title>개인 정보 등록하기</title>


</head>

<body>
	
	<form action="#" method="get">
		<table style="width: 240px;">
			<tr>
				<th style="width: 70px;">회&nbsp;사&nbsp;명</th>
				<td style="width: 160px;"><input type="text" name="companyName" id = "companyName" class = "input"></td>
			</tr>
			<tr>
				<th style="width: 70px;">이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름</th>
				<td style="width: 160px;"><input type="text" name="name" id = "name" class = "input"></td>
			</tr>
			<tr>
				<th style="width: 70px;">메&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;일</th>
				<td style="width: 160px;"><input type="text" name="mail" value="" id = "mail" class = "input"></td>
			</tr>
			<tr>
				<th style="width: 70px;">주&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;소</th>
				<td style="width: 160px;"><input type="text" name="addr" id = "addr" class = "input"></td>
			</tr>
			<tr>
				<th style="width: 70px;">전&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;화</th>
				<td style="width: 160px;"><input type="text" name="tel" maxlength="13" id = "tel" class = "input"></td>
			</tr>
		</table>
		<input type="button" style="width: 100px;" value="명함 만들기" onclick="businessCardMakeFnc();">
	</form>
	
	<h2>명함</h2>
	<div id='businessCardDiv' style="width: 300px; height: 180px; border: 1px solid black;" class = "card">
		<div id = 'businessCompanyName' class = "card" style="background-color: #009999; text-align: right;"></div>
		<div id = 'personName' style="width: 160px;" class = "card"></div>
		<div id = 'businessMail' class = "card" style="background-color: #00ffff;"></div>
		<hr style="background-color: gray;">
		<div id = 'businessAddr' class = "card"></div>
		<div id = 'businessTel' class = "card" style="color: red;"></div>
	</div>
	
</body>

</html>