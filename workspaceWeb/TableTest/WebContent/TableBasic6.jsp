<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<style>
		table, th, td {
 		 	border: 1px solid black;
 		 	border-collapse: collapse;
 		 	text-align: left;
 		}
</style>
</head>

<body>
	
	<h1>표 만들기</h1>
	<h2>colgroup</h2>
	<table border="1" width="100%" summary="월별 스마트폰, 태블릿PC, 데스크탑PC 판매현황 ">
	  <caption>상품에 따른 월별 판매현황</caption>	
	  <colgroup>
	    <col width="20%" />
	    <col width="25%" />
	    <col width="25%" />
	    <col width="30%" />
	  </colgroup>
	  <thead>
	    <tr>
	      <th rowspan="2" scope="col">구분</th>
	      <th colspan="3" scope="colgroup" align="center">
	      <strong>상품종류</strong>	
	    </tr>
	    <tr>
	      <th scope="col">스마트폰</th>
	      <th scope="col">태블릿PC</th>
	      <th scope="col">데스크탑PC</th>	
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">1월</th>
	      <td>5만대</td>
	      <td>3만대</td>
	      <td>1만대</td>
	    </tr>	
	  </tbody>
	</table>
	<h2>id, headers</h2>
	<table border="1" width="100%" summary="월별 스마트폰, 태블릿PC, 데스크탑PC 판매현황 ">
	  <caption>상품에 따른 월별 판매현황</caption>	
	  <colgroup>
	    <col width="20%" />
	    <col width="25%" />
	    <col width="25%" />
	    <col width="30%" />
	  </colgroup>
	  <thead>
	    <tr>
	      <th rowspan="2" id="division">구분</th>
	      <th colspan="3" id="product">상품종류</th>	
	    </tr>
	    <tr>
	      <th headers="product" id="smartphone">스마트폰</th>
	      <th headers="product" id="tabletpc">태블릿PC</th>
	      <th headers="product" id="pc">데스크탑PC</th>	
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th headers="division">1월</th>
	      <td headers="product smartphone">5만대</td>
	      <td headers="product tabletpc">3만대</td>
	      <td headers="product pc">1만대</td>
	    </tr>	
	  </tbody>
	</table>
		
</body>
</html>
