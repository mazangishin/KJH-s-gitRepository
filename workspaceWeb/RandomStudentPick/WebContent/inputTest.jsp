<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	function nameFnc(){
		var nameObj = document.getElementById('inputName'); 
		var outputSpaceObj = document.getElementById('outputSpace');
		var str = '';
		
		str = "이름 : " + nameObj.value;
		outputSpaceObj.innerHTML = str;
	}
</script>
<title>Test</title>
</head>
<body>

	<div>
		<input type="text" id="inputName" placeholder="이름 입력">
		<input type="button" value="출력" onclick="nameFnc();">
	</div>
	<br>
	<div>
		<table style="border-collapse: collapse; 
			color: #ffffff; border: 1px solid blue; background-color: #3DB7CC;">
			<tr>
				<td id="outputSpace"></td>
			</tr>
		</table>
	</div>

</body>
</html>