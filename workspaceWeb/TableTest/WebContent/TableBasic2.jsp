<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<style>
		table, th, td {
 		 	border-collapse: collapse;
		}
		th, td {
  			padding: 5px;
  			text-align: center;
		}
</style>
</head>

<body>
	<table style="width:25%; border:1px solid black;">
		<tr>
			<td colspan='2'style="border:1px solid firebrick;">1번</td>		
			<td style="border:1px solid firebrick;">1-3</td>
			<td style="border:1px solid firebrick;">1-4</td>
		</tr>
		<tr >
			<td rowspan='3'style="border:1px solid navy;">2번</td>
			<td style="border:1px solid navy;">2-2</td>
			<td style="border:1px solid navy;">2-3</td>
			<td style="border:1px solid navy;">2-4</td>
		</tr>
		<tr>
			<td style="border:1px solid black;">3-2</td>
			<td style="border:1px solid black;">3-3</td>
			<td style="border:1px solid black;">3-4</td>
		</tr>
		<tr>
			<td style="border:1px solid gold;">4-2</td>
			<td style="border:1px solid gold;">4-3</td>
			<td style="border:1px solid gold;">4-4</td>
		</tr>
	</table>
	
</body>
</html>
