<%@page import="com.tg.mymember.MyMemberDto"%>
<%@page import="com.tg.member.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 조회</title>
	<script type="text/javascript">
		function backPageFnc() {
			location.href = './list';
		}
		function deleteUserFnc () {
			var obj = document.getElementById('no');
			var memberNo = obj.value;
			
			location.href ='./delete?no=' + memberNo;
		}
	</script>
</head>
<body>
	<% 
	//	ArrayList<MemberDto> memberList = 
	//		(ArrayList<MemberDto>)request.getAttribute("memberList");
	//	MemberDto memberDto = memberList.get(0);
		
		MyMemberDto myMemberDto = (MyMemberDto)request.getAttribute("myMemberDto");
	%>
				
	<jsp:include page="/Header.jsp"/>

	<h1>회원 정보 조회</h1>
	<form action="./update" method="post">
		번호: <input type="text" name='no' value="<%=myMemberDto.getNo()%>" readonly/><br>
		이름: <input type="text" name='name' value="<%=myMemberDto.getName()%>"><br>
		이메일: <input type="text" name='email' value="<%=myMemberDto.getEmail()%>"><br>
		가입일: <%=myMemberDto.getCreateDate()%><br>
		<input type="submit" value="수정">
		<input type="button" value="뒤로가기" onclick="backPageFnc();">
		<input type="button" value="삭제" onclick='deleteUserFnc();'>
	</form>

	<jsp:include page="/Tail.jsp"/>

</body>
</html>