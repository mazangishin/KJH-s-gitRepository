<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	var firstNumObj = ""; 
	var secondNumObj = ""; 
	var outputSpaceObj = ""; 
	var str = "";
	var numStr = "";

	window.onload=function objFnc(){
		var firstNumObj = document.getElementById('firstNum'); 
		var secondNumObj = document.getElementById('secondNum'); 
		var outputSpaceObj = document.getElementById('outputSpace');
	}
 
	function addFnc(){
	 	var firstNumObj = document.getElementById('firstNum'); 
		var secondNumObj = document.getElementById('secondNum'); 
		var outputSpaceObj = document.getElementById('outputSpace');
		var str = "";
		var numStr = "";
		var firstInt = parseInt(firstNumObj.value)
		var secondInt = parseInt(secondNumObj.value)
		
		str = firstNumObj.value + " + " + secondNumObj.value + " = "
		numStr = firstInt + secondInt;
		outputSpaceObj.innerHTML = str + numStr;
	}
	function subFnc(){
		var firstNumObj = document.getElementById('firstNum'); 
		var secondNumObj = document.getElementById('secondNum'); 
		var outputSpaceObj = document.getElementById('outputSpace');
		var str = "";
		var numStr = "";
		var firstInt = parseInt(firstNumObj.value)
		var secondInt = parseInt(secondNumObj.value)
		
		str = firstNumObj.value + " - " + secondNumObj.value + " = "
		numStr = firstInt - secondInt;
		outputSpaceObj.innerHTML = str + numStr;
	}
	function mulFnc(){
		var firstNumObj = document.getElementById('firstNum'); 
		var secondNumObj = document.getElementById('secondNum'); 
		var outputSpaceObj = document.getElementById('outputSpace');
		var str = "";
		var numStr = "";
		var firstInt = parseInt(firstNumObj.value)
		var secondInt = parseInt(secondNumObj.value)
		
		str = firstNumObj.value + " * " + secondNumObj.value + " = "
		numStr = firstInt * secondInt;
		outputSpaceObj.innerHTML = str + numStr;
	}
	function divFnc(){	
		var firstNumObj = document.getElementById('firstNum'); 
		var secondNumObj = document.getElementById('secondNum'); 
		var outputSpaceObj = document.getElementById('outputSpace');
		var str = "";
		var numStr = "";
		var firstInt = parseInt(firstNumObj.value)
		var secondInt = parseInt(secondNumObj.value)
		
		str = firstNumObj.value + " / " + secondNumObj.value + " = "
		numStr = firstInt / secondInt;
		outputSpaceObj.innerHTML = str + numStr;
	}
</script>
<title>Test</title>
</head>
<body>

	<div>
		<input type="text" id="firstNum" placeholder="첫번째 숫자 입력">
		<input type="text" id="secondNum" placeholder="두번째 숫자 입력">
		<input type="button" value="+" onclick="addFnc();">
		<input type="button" value="-" onclick="subFnc();">
		<input type="button" value="*" onclick="mulFnc();">
		<input type="button" value="/" onclick="divFnc();">
	</div>
	<br>
	<div>
		<h1>출력결과</h1>
		<h1>
			<table style="border-collapse: collapse; 
				border: 1px solid #E0FF80; background-color: #FAED7D;">
				<tr>
					<td id="outputSpace"></td>
				</tr>
			</table>
		</h1>
	</div>

</body>
</html>