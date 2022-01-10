<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="resources/CSS/style.css">
<title>기상청</title>
</head>

<body>

	<div class="container">
		<div class="d-flex">
			<div class=" col-2 bg-primary">
				<div class="logo text-center ">
					<img class="bg-primary" width=30px alt="기상청로고"
						src="file:///C:/Users/User/Downloads/ci_20160630%20(1)/1%20%EA%B8%B0%EC%83%81%EC%B2%AD_%ED%95%9C%EA%B8%80_%EC%83%81%ED%95%98.jpg">
				</div>
				<ul class="nav">
					<li class="nav-item"><a class="nav-link text-light" href="#">날씨</a></li>
					<li class="nav-item"><a class="nav-link text-light"
						href="/lesson05/weatherView"">날씨입력</a></li>
					<li class="nav-item"><a class="nav-link text-light" href="#">테마날씨</a></li>
					<li class="nav-item"><a class="nav-link text-light" href="#">관측기후</a></li>
				</ul>
			</div>
			<div>

				<div class="ml-4">
					<h2>과거날씨</h2>
					<table class="table text-center">
						<tr>
							<th>날짜</th>
							<th>날씨</th>
							<th>기온</th>
							<th>강수량</th>
							<th>미세먼지</th>
							<th>풍속</th>
						</tr>

						<c:forEach var="weathers" items="${weather }">
							<tr>

								<fmt:formatDate value="${weathers.date }" pattern="yyyy년 M월 d일"
									var="date" />
								<td>${date}</td>
								<c:choose>
									<c:when test="${weathers.weather eq '맑음' }">
										<td><img alt="햇살이미지"
											src="http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg"></td>
									</c:when>
									<c:when test="${weathers.weather eq '구름조금' }">
										<td><img alt="구름이미지"
											src="http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg"></td>
									</c:when>
									<c:when test="${weathers.weather eq '흐림' }">
										<td><img alt="흐린이미지"
											src="http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg"></td>
									</c:when>
									<c:otherwise>
										<td><img alt="비이미지"
											src="http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg"></td>
									</c:otherwise>
								</c:choose>
								<td>${weathers.temperatures }</td>
								<td>${weathers.precipitation }mm</td>
								<td>${weathers.microDust }</td>
								<td>${weathers.windSpeed }km/h</td>
							</tr>
						</c:forEach>

					</table>

				</div>
			</div>

		</div>
		<div class="d-flex">
			<img width=80px alt="기상청로고" src="">
			<div class="small text-secondary ml-3">
				(07062) 서울시 동작구 여의대방로16길 61<br> Copyright@2020 KMA. All Rights
				RESERVED
			</div>
		</div>
</body>
</html>