<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
   var year = 1600;
   var str = '';
   var cnt = 0;
   
   for (var i = 0; i <= 400; i++) {
      if(((year % 4 == 0) && (year % 100 != 0)) 
            || (year % 400 == 0)){
         str = year + '년은 윤년입니다';
         cnt++;
      }else if(year % 100 == 0 || year % 4 != 0){
         str = year + '년은 평년입니다';
      }
      document.write(str + '<br/>');
      year++;
   }
   
   document.write(cnt);
   
   
</script>

</head>
<body>

</body>
</html>