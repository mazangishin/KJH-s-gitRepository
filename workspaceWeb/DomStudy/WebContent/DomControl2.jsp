<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div id='theBox'>
		<h1>요소 생성 연습</h1>
		<button id='btn' onclick="h1TagRemoveFnc();">나를 마우스 왼쪽 클릭하면 h1 태그가 사라져</button>
	</div>
		
	<div id='h1Container'>
		<h1>새로운 태그1</h1>
		<h1>새로운 태그2</h1>
		<h1>새로운 태그3</h1>
	</div>
	
</body>

<script type="text/javascript">
	function h1TagRemoveFnc(){
		var divObj = document.getElementById('h1Container');
		var h1ObjArr = divObj.getElementsByTagName('h1');
		for (var i = 0; i < 3; i++) {
			divObj.removeChild(h1ObjArr[0]);
		}
		/* divObj.removeChild(h1ObjArr[0]); */
	}
</script>
</html>