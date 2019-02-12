<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div id='theBox'>
		<h1>요소 생성 연습</h1>
		<!-- 	<button id='btn1'>버튼1</button>
			<button id='btn2'>버튼2</button> -->
	</div>
</body>

<script type="text/javascript">
/* 	var newDivTag = document.createElement('div');
	var newH1Tag = document.createElement('h1');
	
	var h1TextTag = document.createTextNode('요소 생성 연습');
	
	newDivTag.setAttribute('id', 'theBox');
	
	newH1Tag.appendChild(h1TextTag);
	newDivTag.appendChild(newH1Tag);
	
	var bodyObj = document.getElementsByTagName('body');
	
	bodyObj.appendChild(newDivTag);	 */
	
	var createButton = document.createElement('button');
	var buttonText = document.createTextNode('버튼1');
	createButton.setAttribute('id', 'btn1');
	createButton.appendChild(buttonText);
	
	var createButton1 = document.createElement('button');
	var buttonText1 = document.createTextNode('버튼2');
	createButton1.setAttribute('id', 'btn2');
	createButton1.appendChild(buttonText1);
	
	var divObj = document.getElementById('theBox');
	divObj.appendChild(createButton);
	divObj.appendChild(createButton1);
	
</script>
</html>