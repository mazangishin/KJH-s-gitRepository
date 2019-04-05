<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<script type="text/javascript">
	window.onload = function(){
		var memberNameObj = document.getElementById('memberName')
		
		memberNameObj.disabled="disabled";
		memberNameObj.style.backgroundcolor = '#E7E7E7';
	}
	
	function pageMoveListFnc(){
		location.href = "list.do";
	}
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/Header.jsp" />
	
	<h1>회원정보</h1>
	<form action="./update.do" method="get">
	<input type="hidden" name='no' value='${memberVo.no}'>
		이름: <input type="text" name='name' readonly="readonly" 
				id='memberName' value='${memberVo.name}'><br>
		이메일: <input type="text" name="email" 
				value='${memberVo.email}' readonly="readonly"><br>
		가입일: <fmt:formatDate value="${memberVo.createDate}"
				pattern="yyyy-MM-dd"/><br>
		<input type="submit" value="수정하기">
		<input type="button" value="돌아가기" onclick="pageMoveListFnc();">
	</form>

	<jsp:include page="/WEB-INF/views/Tail.jsp" />

</body>
</html>