<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var htmlStr = '';
	var danNum = 5;
	
 	htmlStr += '<table style="border-color: 1px solid black">';
 	htmlStr += '<tr><th>5단</th></tr>';
	
	for (var i = 1; i <= 9; i++) {
		htmlStr += '<tr><td>' + danNum + '*' + i + '=' 
			+ (danNum*i) + '</td></tr>';
	}
	
	htmlStr += '</table>';
	document.write(htmlStr);
	
</script>
</head>
<body>

</body>
</html>