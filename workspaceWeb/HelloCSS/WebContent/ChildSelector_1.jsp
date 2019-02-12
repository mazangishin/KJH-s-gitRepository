<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title> new document </title>
	<META HTTP-EQUIV="CONTENT-TYPE"  CONTENT="TEXT/HTML; CHARSET=UTF-8" />
	<style type = "text/css">
		body #solidRed li {
			border : 1px solid red;
			padding-top: 60px;
  			padding-right: 30px;
  			padding-bottom: 60px;
  			padding-left: 30px;
  		}
  		
/*		.listSelect {
			border : 1px dotted blue;
  			padding-left: 100px;
  			padding-top: 30px;
		}
*/
		body #list p {
			border : 1px dotted blue;
  			padding-left: 100px;
  			padding-top: 30px;
		} 
	</style>
</head>

<body>
<div>
	<h1>선택자</h1>
	<h2 id="title">원거리 선택자</h2>
	<ul id="solidRed">
		<li>getElementById</li>
		<li>getElementsByTagnName</li>
	</ul>
	<div title='select연습'>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="list">
			<li>parentNode</li>
			<li><p>childNodes</p></li>
			<li><p>children</p></li>
			<li><p>firstChild</p></li>
			<li>previousSibling</li>
			<li>nextSibling</li>
		</ul>
	</div>
</div>
 </body>
</html>
