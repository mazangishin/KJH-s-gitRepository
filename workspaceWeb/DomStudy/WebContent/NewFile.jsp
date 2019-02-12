<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		var globalNum = 10;
		globalNum2 = 20;
		
		function numbering() {
			globalNum3 = 30;
			var localNum = 40;
			
			document.write(globalNum);
			document.write(globalNum2);
			document.write(globalNum3);
			document.write(localNum);
			
		}
		
		numbering();
	</script>
</head>
<body>

</body>


</html>