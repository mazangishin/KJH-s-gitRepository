<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function morning() {
		alert('good morning');
	}
 	function afternoon() {
 		alert('good afternoon');
 	}
 	function bye() {
 		alert('goodbye');
 	}
</script>
</head>
<body>
	<button onclick="morning();">아침인사 버튼</button>
	<button onclick="afternoon();">점심인사 버튼</button>
	<button ondblclick="bye();">헤어질 때 인사 버튼</button>	
</body>
</html>
