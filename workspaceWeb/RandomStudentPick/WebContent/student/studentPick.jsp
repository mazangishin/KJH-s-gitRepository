<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	table {
		border-collapse: collapse;
	}
	table, tr, td {
		color: #ffffff;
		border: 1px solid blue;
		background-color: #3DB7CC;
	}
	function randomPickFnc() {
		
	}
	function  
</script>
<title>Insert title here</title>
</head>
<body>

	<div>
		<input type="text" id="inputNum" value placeholder="숫자만 입력">
		<input type="button" id="pick" value="학생뽑기" onclick="randomPickFnc();">
		<input type="button" value="전체추가" onclick="addAllFnc();">
	</div>
	<br>
	<div>
		<table>
			<tr>
				<td id="printSpace"></td>
			</tr>
			<tr>
				<td id="d"></td>
			</tr>
		</table>
	</div>
</body>
</html>