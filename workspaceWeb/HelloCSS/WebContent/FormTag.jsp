<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<body>

	<h1>textarea요소와 select요소</h1>
	<form action="board.php" method="post">
	<fieldset>
	  <legend>여러 줄 글상자와 목록상자</legend>
	  <p>
	  	답글<br /> 
	  	<textarea cols="30" rows="5" name="reply"></textarea>
	  </p>
	  <p>과목 선택
	    <select>
	      <option value="html5">html5</option>
	      <option value="css3">css3</option>
	      <option value="javascript">javascript</option>
	      <option value="Query">jQuery</option>        
	    </select>
	  </p>
	  <p>스터디 지역
	    <select>
	      <optgroup label="관악구">
	        <option value="gwanak-bcd">봉천동</option>
	        <option value="gwanak-sld">신림동</option>
	        <option value="gwanak-nhd">남현동</option>
	      </optgroup>
	      <optgroup label="동대문구">		 
	        <option value="ddm-jnd" >전농동</option>
	        <option value="ddm-dsn">답십리</option>
	        <option value="ddm-ssd">신설동</option>
	      </optgroup> 
	    </select>
	  </p>
	</fieldset>
	</form>

</body>
</html>
