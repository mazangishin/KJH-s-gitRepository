<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		border-collapse: collapse;
		height: 60px;
	}
	table, tr, td {
		border: 1px solid black;
	}
</style>
<title>Insert title here</title>
<script type="text/javascript">
	function age() {
		var docVal = document.getElementById('formCont');
		var str = '제 나이는' + docVal + ' 입니다.';
		var obj = document.getElementById(spanTest);
		obj.innerHTML = str;
	}
</script>
</head>
<body>
	
	<form id='formCont'>
		<table>
			<tr>
				<td>
					<input type="text" id='st' name="st">
					<input type="button" value='당신의 나이는?' onclick="age();">
				</td>
			</tr>
			<tr>
				<td>
					<span id='spanTest'></span>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>