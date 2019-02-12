<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
	<style type = "text/css">
   		li > p {
   			color : blue;
   			border: 1px solid black;
   		}       --- li 속 바로 아래 p 태그의 글자들을 파란색으로 처리함.    
   		li > img {
   			border-color : SlateBlue;
			width : 50px;
			height : 50px;
   		}
	</style>
</head>
<body>
   <ul>
      <li style='border: 1px solid tomato;'>
      	<p>7월의 여행지</p>
      	<img border = "2" src="./icox_logo.gif" alt="아이콕스"/>
      </li>
      <li style='border: 1px solid tomato;'><p>8월의 여행지</p></li>
   </ul>
   <p>내년의 여행지</p>
</body>
</html>