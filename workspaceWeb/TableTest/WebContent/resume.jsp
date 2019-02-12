<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table, th, td {
		padding: 5px;
		border-collapse: collapse;
		font-size: 10px;
		text-align: center;
	}
	th, td {
		border: 1px solid black;
	}
	.header {
		background-color: #FFAFE6;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<div style="width: 675px;">
	
		<div>
			<p style="border: 1px solid white; background-color: #BDBDBD; 
			 height: 20px; width: 675px;">
			</p>
		</div>
		
		<div>
			<table style="width: 440px; margin-right: 40px; float: left;">
				<tr>
					<td style="height: 60px; border: 1px solid white; 
					 font-size: 30px; text-align: right;">
						<strong>입 사 지 원 서 </strong>
					</td>
				</tr>
			</table>
			<table style="float: left;  margin-bottom: 10px;">
				<tr>
					<th class="header" style="width: 30px;">구분</th>
					<th class="header" style="width: 90px;">지원 분야</th>
					<th class="header" style="width: 40px;">희망연봉</th>
				</tr>
				<tr style="height:50px;">
					<td>내용</td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>

		<div>
			<table style="height: 140px; width: 100px; float: left;
			 margin-right: 10px; margin-bottom: 10px;">
				<tr>
					<th></th>
				</tr>
			</table>
			<table style="margin-bottom: 10px;">
				<tr>
					<td style="background-color:#BDBDBD; width: 80px;">성&emsp;&emsp;명</td>
					<td colspan="3">(한문)</td>
				</tr>
				<tr>
					<td style="background-color:#BDBDBD; width: 80px;">주민번호</td>
					<td style="width: 150px;"></td>
					<td style="background-color:#BDBDBD; width: 100px;">생년월일</td>
					<td style="text-align: right; width: 190px;">
						&emsp;&emsp;년&emsp;&emsp;월&emsp;&emsp;일 (음력/양력)
					</td>
				</tr>
				<tr>
					<td style="background-color:#BDBDBD; width: 60px;">주&emsp;&emsp;소</td>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td style="background-color:#BDBDBD; width: 80px;">전화번호</td>
					<td></td>
					<td style="background-color:#BDBDBD; width: 100px;">E-MAIL</td>
					<td></td>
				</tr>
				<tr>
					<td style="background-color:#BDBDBD; width: 80px;">핸&nbsp;드&nbsp;폰</td>
					<td></td>
					<td style="background-color:#BDBDBD; width: 100px;">결혼유무</td>
					<td>미혼/기혼</td>
				</tr>
				<tr>
					<td style="background-color:#BDBDBD; width: 80px;">가족사항</td>
					<td>&emsp;&emsp;남&emsp;&emsp;녀&emsp;중</td>
					<td style="background-color:#BDBDBD; width: 100px;">주거사항</td>
					<td>동거/비 동거</td>
				</tr>
			</table>
		</div>
		
		<div>
			<table style="margin-bottom: 10px;">
				<tr>
					<th rowspan="4" style="background-color: #CF3682; width: 30px;">
						<b>학<br><br>력</b>
					</th>
					<th class="header" colspan="2">입학년월</th>
					<th class="header" colspan="2">졸업년월</th>
					<th class="header" style="width: 140px;">학&emsp;교&emsp;명</th>
					<th class="header" style="width: 70px;">전&emsp;공</th>
					<th class="header" style="width: 100px;">졸&emsp;업&emsp;구&emsp;분</th>
					<th class="header" style="width: 70px;">소재지</th>
				</tr>
				<tr>
					<td style="border-right: 1px dashed black; width: 55px;"></td>
					<td style="border-left: 1px dashed black; width: 30px;"></td>
					<td style="border-right: 1px dashed black; width: 55px;"></td>
					<td style="border-left: 1px dashed black; width: 30px;"></td>
					<td></td>
					<td></td>
					<td>졸업/재학</td>
					<td></td>			
				</tr>
				<tr>
					<td style="border-right: 1px dashed black;"></td>
					<td style="border-left: 1px dashed black;"></td>
					<td style="border-right: 1px dashed black;"></td>
					<td style="border-left: 1px dashed black;"></td>
					<td style="width: 140px;"></td>
					<td style="width: 70px;"></td>
					<td style="width: 100px;">졸업/재학/휴학</td>
					<td></td>		
				</tr>
				<tr>
					<td style="border-right: 1px dashed black;"></td>
					<td style="border-left: 1px dashed black;"></td>
					<td style="border-right: 1px dashed black;"></td>
					<td style="border-left: 1px dashed black;"></td>
					<td style="width: 140px;"></td>
					<td style="width: 70px;"></td>
					<td style="width: 100px;">졸업/재학/휴학</td>
					<td></td>		
				</tr>
			</table>
		</div>
		
		<div>	
			<table style="margin-bottom: 10px;">
				<tr>
					<th rowspan="4" style="background-color: #CF3682; width: 30px;">
						<b>경<br><br>력</b>
					</th>
					<th class="header" style="width: 165px;">근&emsp;무&emsp;기&emsp;간</th>
					<th class="header" style="width: 165px;">직&emsp;장&emsp;명</th>
					<th class="header" style="width: 75px;">직&emsp;위</th>
					<th class="header" style="width: 130px;">담&emsp;당&emsp;업&emsp;무</th>
					<th class="header" style="width: 50px;">비&emsp;고</th>
				</tr>
				<tr>
					<td>&emsp;&emsp;.&emsp;&emsp;.&emsp;&emsp;~&emsp;&emsp;.</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>&emsp;&emsp;.&emsp;&emsp;.&emsp;&emsp;~&emsp;&emsp;.</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>&emsp;&emsp;.&emsp;&emsp;.&emsp;&emsp;~&emsp;&emsp;.</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>
		
		<div style="height: 40px;">	
			<table style="margin-right: 5px; margin-bottom: 10px; float: left;
			 height: 40px;">
				<tr>
					<th rowspan="3" style="background-color: #CF3682; width: 30px;">
						<b>신<br><br>체</b>
					</th>
					<th class="header" style="width: 60px;">신장</th>
					<th class="header" style="width: 60px;">체중</th>
					<th class="header" style="width: 60px;">시력</th>
					<th class="header" style="width: 65px;">혈액형</th>
				</tr>
				<tr>
					<td rowspan="2" style="text-align: right;">cm&emsp;</td>
					<td rowspan="2" style="text-align: right;">kg&emsp;</td>
					<td>좌:</td>
					<td rowspan="2">형</td>
				</tr>
				<tr>
					<td>우:</td>
				</tr>
			</table>
			<table style="margin-bottom: 10px; float: left; height: 40px;">
				<tr>
					<th rowspan="3" style="background-color: #CF3682; width: 30px;">
						<b>병<br><br>역</b>
					</th>
					<th class="header" style="width: 75px;">구분</th>
					<th class="header" style="width: 50px;">병과</th>
					<th class="header" style="width: 50px;">계급</th>
					<th class="header" style="width: 80px;">소속부대</th>
				</tr>
				<tr>
					<td>필/면제</td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>복무기간</td>
					<td colspan="3">&emsp;&emsp;년&emsp;&emsp;월&emsp;&emsp;
					 ~&emsp;&emsp;년&emsp;&emsp;월</td>
				</tr>
			</table>
		</div>
		<div>
			<table style="margin-right: 5px; margin-bottom: 10px; float: left;
			 height: 90px;">
				<tr>
					<th rowspan="6" style="background-color: #CF3682; width: 30px;">
						<b>가<br><br>족<br><br>사<br><br>항</b>
					</th>
					<th class="header" style="width: 30px;">관계</th>
					<th class="header">성명</th>
					<th class="header">연령</th>
					<th class="header">근무처</th>
					<th class="header">직위</th>
					<th class="header">동거</th>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>
		<div>	
			<table style="margin-right: 5px; margin-bottom: 10px; float: left;
			 height: 90px;">
				<tr>
					<th rowspan="6" style="background-color: #CF3682; width: 30px;">
						<b>외<br><br>국<br><br>어</b>
					</th>
					<th>언&emsp;어</th>
					<th>능&emsp;력</th>
				</tr>
				<tr>
					<td>영어</td>
					<td>상&emsp;중&emsp;하</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>공인시험</td>
					<td>점&emsp;수</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>
		
		<div>
			<table style="margin-right: 5px; margin-bottom: 10px; float: left;">
				<tr>
					<th rowspan="4" style="background-color: #CF3682; width: 30px;">
						<b>O<br><br>A<br><br>능<br><br>력</b>
					</th>
					<td>워드&emsp;(한글/MS워드)</td>
					<td>상&emsp;중&emsp;하</td>
				</tr>
				<tr>
					<td>프레젠테이션&emsp;(파워포인트)</td>
					<td>상&emsp;중&emsp;하</td>
				</tr>
				<tr>
					<td>스프레드시트&emsp;(엑셀)</td>
					<td>상&emsp;중&emsp;하</td>
				</tr>
				<tr>
					<td>인터넷활용</td>
					<td>상&emsp;중&emsp;하</td>
				</tr>	
			</table>
			<table style="margin-right: 5px; margin-bottom: 10px; float: left;">
				<tr>
					<th rowspan="4" style="background-color: #CF3682; width: 30px;">
						<b>자<br><br>격<br><br>사<br><br>항</b>
					</th>
					<td>취득일자</td>
					<td>종&emsp;&emsp;류</td>
					<td>등급</td>
				</tr>
				<tr>
					<td>&emsp;&emsp;.&emsp;&emsp;.&emsp;&emsp;</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>&emsp;&emsp;.&emsp;&emsp;.&emsp;&emsp;</td>
					<td></td>
					<td></td>
				</tr>
			</table>		
		</div>
		
	</div>	
</body>
</html>