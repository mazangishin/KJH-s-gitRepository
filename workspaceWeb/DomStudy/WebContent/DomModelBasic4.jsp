<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div title="이게 웹 접근성이야">
		<h1>선택자</h1>
		<h2 id="title">
			원거리 선택자
		</h2>
		<ul>
			<li>
				getElementById
			</li>
			<li>
				getElementsByTagnName
			</li>
		</ul>
		<h2 id="title2">
			근거리 선택자
		</h2>
		<ul id="list" style="font-style: oblique;">
			<li>
				parentNode
			</li>
			<li>
				childNodes
			</li>
			<li>
				children
			</li>
			<li>
				firstChild
			</li>
			<li>
				previousSibling
			</li>
			<li>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	var childObjArr1 = document.getElementById('list').childNodes;
	alert(childObjArr1.length);
	var childObjArr = document.getElementById('list').children;
	alert(childObjArr.length);
	
	for (var i = 0; i < childObjArr.length; i++) {
		childObjArr[i].style.fontStyle = 'oblique';
//		document.write(childObjArr[i].tagName + '<br/>');
	}
	
</script>
</html>