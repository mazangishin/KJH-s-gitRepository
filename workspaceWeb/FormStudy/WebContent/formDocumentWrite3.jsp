<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.newDivTag {
		border: 1px solid black;
		height: 30px;
		width: 30px;
	}
</style>
<title>웹 문서구조</title>
	
<script type="text/javascript">
	var count = 1;
	
	function addDivFnc() {
		var divObj = document.getElementsByTagName('body')[0];
		var divStr = '';
		
		divStr += '<div class="newDivTag">';
		divStr += '<span>' + count + '</span>';
		divStr += '</div>';
		
		count++;
		
		divObj.innerHTML = divObj.innerHTML + divStr;
		
	}
	
	
</script>

</head>
<body>

	<div>
		<h1 id="title">DOM</h1>
		<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
		<button onclick='addDivFnc();'>추가 버튼</button>
	</div>

</body>

</html>