<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<style type="text/css">
	nav>ul>li {
		float: left;
		
	}
 	nav>ul {
 		list-style: none;
 		padding: 0px;
 		overflow: hidden;
 		display: table;
 		margin-left: auto;
 		margin-right: auto;
 	}
 	nav>ul>li>a {
 		display: block;
 		color: white;
 		padding: 5px;
 		text-decoration: none;
 		vertical-align: middle;
 		height: 25px;
 	}
 	nav>ul>li>a:hover {
 		color: #ffD9EC;
 		font-weight: bold;
 	}
  	nav>ul>li>a{ 
 	  background:#1AAB8A; 
 	  color:#fff; 
 	  border:none; 
 	  position:relative; 
 	  height:60px; 
 	  font-size:1.6em; 
 	  padding:0 2em; 
 	  cursor:pointer; 
 	  transition:800ms ease all; 
 	  outline:none; 
 	} 
 	nav>ul>li>a:hover{ 
 	  background:#fff; 
 	  color:#1AAB8A; 
 	} 
 	nav>ul>li>a:before, nav>ul>li>a:after{ 
 	  content:''; 
 	  position:absolute; 
 	  top:0; 
 	  right:0; 
 	  height:2px; 
 	  width:0; 
 	  background: #1AAB8A; 
 	  transition:400ms ease all; 
 	} 
 	nav>ul>li>a:after{ 
 	  right:inherit; 
 	  top:inherit; 
 	  left:0; 
 	  bottom:0; 
 	} 
 	.active {
 		font-weight: bold;
 	}
</style>

<script type="text/javascript"
	src="/springHome/resources/js/jquery-3.3.1.js">
</script>
<script type="text/javascript">
	function goPage(pageNumber) {
			var curPage = $("#curPage"); 
			// var curPage = document.getElementById(curPage);
			curPage.val(pageNumber);
			// curPage.value = pageNumber;
			$("#pagingForm").submit();
			// document.getElementByID(pagingForm);
			// pagingForm은 mamberListView에 있다.
	} 
	window.onload = function() {
		var curPageDoc = $('#curPage');
		var id = '#pageButton' + curPageDoc.val();
		
		$(id).addClass('active');
	}
</script>

	<nav id="pagingNav">
		<ul>
			<li>
				<a href='#' onclick="goPage(${pagingMap.memberPaging.prevPage});">
					<span>≪</span>
				</a>
			</li>
			
			<c:forEach var="num" begin="${pagingMap.memberPaging.blockBegin}"
				end="${pagingMap.memberPaging.blockEnd}">
				<li id="pageButton${num}">
					<a href="#" onclick="goPage(${num});">
						<c:out value="${num}"/>
					</a>
				</li>
			</c:forEach>
			
			<li>
				<a href='#' onclick="goPage(${pagingMap.memberPaging.nextPage});">
					<span>≫</span>
				</a>
			</li>
		</ul>
	</nav>

