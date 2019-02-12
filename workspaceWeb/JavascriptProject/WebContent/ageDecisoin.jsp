<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var age = 0;
	
	age = -4;
	
	if (age >= 20) {
		document.write('당신은 성인입니다.');
	}else if (age >= 14) {
		document.write('당신은 청소년입니다.');	
	}else if (age > 0 && age < 14) {
		document.write('당신은 어린이입니다.');
	}else{
		document.write('잘못 입력하셨습니다.');
	} 
</script>
</head>
<body>

</body>
</html>