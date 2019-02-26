<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		width: 240px;
		font-weight: bold;
	}
	table, tr, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
	input {
		width: 130px;
	}	
	.businessCardDivClass {
		height: 30px;		
	}
	#businessCardDiv {
	    width: 300px; 
        height: 180px; 
        border: 1px solid black; 
	}
	#businessCardDiv > div { 
    	height: 30px; 
    }
</style>

<title>개인 정보 등록하기</title>


</head>

<body>
	
	<form action="#" method="get">
		<table>
			<tr>
				<td style="width: 70px;">
					회&nbsp;사&nbsp;명
				</td>
				<td id="" style="width: 160px;">
					<input type="text" name="companyName" 
					 id="idCompanyName">
				</td>
			</tr>
			<tr>
				<td>
					이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름
				</td>
				<td>
					<input type="text" name="name" 
					 id="idName">
				</td>
			</tr>
			<tr>
				<td>
					메&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;일
				</td>
				<td>
					<input type="text" name="mail" value=""
					 id="idMail">
				</td>
			</tr>
			<tr>
				<td>
					주&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;소
				</td>
				<td>
					<input type="text" name="addr" id="idAddr">
				</td>
			</tr>
			<tr>
				<td>
					전&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;화
				</td>
				<td>
					<input type="text" name="tel" maxlength="13"
					 id="idTel">
				</td>
			</tr>
		</table>
		<input type="button" value="명함 만들기" onclick='businessCardMakeFnc();'>
	</form>
	
	<h2>명함</h2>
	<div id='businessCardDiv'>
		<div id="inputCompanyNameVal"></div>
		<div id="inputNameVal"></div>
		<div id="inputMailVal"></div>
		<hr style="background-color: gray;">
		<div id="inputAddrVal"></div>
		<div id="inputTelVal"></div>
	</div>
	
</body>

<script type="text/javascript">

function businessCardMakeFnc() { 
	
	 var companyNameObj = document.getElementById('idCompanyName'); 
     var companyNameVal = companyNameObj.value;
     var inputCompanyName = document.getElementById('inputCompanyNameVal');
     
     inputCompanyName.innerHTML = companyNameVal;
     inputCompanyName.style.textAlign = 'right';
     inputCompanyName.style.backgroundColor = '#489FAE';
     
     var nameObj = document.getElementById('idName');
     var nameVal = nameObj.value;
     var inputName = document.getElementById('inputNameVal');
     
     if (nameObj.value == '') {
        alert('이름을 입력해주세요.');
        return;
     }
     
     inputName.innerHTML = nameVal;
     inputName.style.font = 'bold';
     inputName.style.fontSize = '20px';
     
     var mailObj = document.getElementById('idMail');
     var mailVal = mailObj.value;
     var inputMail = document.getElementById('inputMailVal');
     
     inputMail.innerHTML = mailVal;
     inputMail.style.fontSize = '18px';
     inputMail.style.backgroundColor = '#12EAFF';
     
     var addrObj = document.getElementById('idAddr');
     var addrVal = addrObj.value;
     var inputAddr = document.getElementById('inputAddrVal');
     
     inputAddr.innerHTML = addrVal;
     
     var telObj = document.getElementById('idTel');
     var TelVal = telObj.value;
     var inputTel = document.getElementById('inputTelVal');
     
     inputTel.innerHTML = TelVal;
     inputTel.style.color = '#FF0000';
	
} 

</script>

</html>