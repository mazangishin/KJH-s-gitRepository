<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function addAccFnc() {
		var userIdObj = document.getElementById('userId');
		var accountVal = '계정명: ' + userIdObj.value + '</br>';  
		var idList = document.getElementById('output');
		idList.innerHTML = idList.innerHTML + accountVal;
	}

</script>
</head>
<body>

	   <div id='theBox'>
	      <h1>계정 등록 버튼</h1>
	      <input type="text" id='userId'>
	      <button id="btn1" onclick="addAccFnc();">버튼</button>
	   </div>
	
	   <h2>등록된 계정</h2>
	   <div id='output' style="border: 1px solid black;">
	      
	   </div>
	    
</body>

</html>