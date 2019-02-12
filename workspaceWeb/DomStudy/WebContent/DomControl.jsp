<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<!-- <div id='theBox'>
		<h1>요소 생성 연습</h1>
		<button id='btn' onclick="clickEvent();">나를 마우스 왼쪽 클릭하면 h1 태그가 생겨</button>
	</div>
	
	<div id='h1Container'>
		
	</div> -->
	
</body>

<script type="text/javascript">
	
 	var newDivTag = document.createElement('div');
 	newDivTag.setAttribute('id', 'theBox');
 	
	var newH1Tag = document.createElement('h1');
	var h1TextTag = document.createTextNode('요소 생성 연습');
	newH1Tag.appendChild(h1TextTag);
	
	var createButton = document.createElement('button');
	var buttonText = document.createTextNode('나를 마우스 왼쪽 클릭하면 h1 태그가 생겨');
	createButton.setAttribute('id', 'btn');
	createButton.setAttribute('onclick', 'clickEvent');
	createButton.appendChild(buttonText);
	
	var bodyObj = document.getElementsByTagName('body');
	
	newDivTag.appendChild(newH1Tag);
	newDivTag.appendChild(createButton);
	
	var newDivTag1 = document.getElementById('h1Container');
	
	function clickEvent() {
		var addH1Tag = document.createElement('h1');
		var h1Text = document.createTextNode('졸림..');
		addH1Tag.appendChild(h1Text);
		newDivTag1.appendChild(addH1Tag);
	}
	
</script>
</html>