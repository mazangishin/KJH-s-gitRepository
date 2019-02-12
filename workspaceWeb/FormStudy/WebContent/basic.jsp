<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		border-collapse: collapse;
	}
	table, th, td {
		border: 1px solid black;
	}
</style>
<script type="text/javascript" src="./js/basic.js"></script>
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td onclick='showVal();'>1) 같은 파일 안에서 함수 선언 후 '일반 함수 호출' 
			  알림창 띄우기</td>
		</tr>
		<tr>
			<td onclick='linkTest();'>2) 다른 파일 안에서 선언되어 있는 함수를 호출하여
			 '외부 함수 호출' 알림창 띄우기</td>
		</tr>
	</table>
</body>
</html>