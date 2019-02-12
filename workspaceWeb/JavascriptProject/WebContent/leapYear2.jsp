<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var year = 0;
	
	year = 2003;
	
 	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
 		document.write('윤년');
	}else{
 		document.write('평년');
 	}
	
// 	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
// 		document.write('윤년');
// 	}else if (year % 100 == 0 && year % 4 == 0) {
// 		document.write('평년');
// 	}else if (year % 4 == 0) {
// 		document.write('윤년');
// 	}else{
// 		document.write('평년');
// 	}
</script>
</head>
<body>

</body>
</html>