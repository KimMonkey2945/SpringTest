<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
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
<title>날씨 입력</title>
</head>

<body>
	<form method="get" action="#">
		<div class="container d-flex">
			<div class="col-2">
				<div class="logo text-center"><img width=30px alt="기상청로고" src="https://cdn.ilyoseoul.co.kr/news/photo/202012/434545_351639_2648.jpg">기상청</div>
				<ul class="nav">
					<li class="nav-item"><a class="nav-link" href="#">날씨</a></li>
					<li class="nav-item"><a class="nav-link" href="#">날씨입력</a></li>
					<li class="nav-item"><a class="nav-link" href="#">테마날씨</a></li>
					<li class="nav-item"><a class="nav-link" href="#">관측기후</a></li>
				</ul>
			</div>
			<div>
				<h2>날씨입력</h2>
				<div>
					<div class="d-flex justify-content-around">
						날짜<input class="form-control" type="text" name="date">
						날씨 
						<select class="form-control" name="weather">
							<option>맑음</option>
							<option>비</option>
							<option>흐림</option>
							<option>구름조금</option>
						</select>
						미세먼지 
						<select class="form-control" name="microDust">
							<option>좋은</option>
							<option>나쁨</option>
							<option>보통</option>
							<option>최악</option>
						</select>
					</div>
					<div class="d-flex justify-content-around">
						기온<input class="form-control" type="text" name="temperature"><input class="form-control" type="text" value="" disabled readonly>
						강수량<input class="form-control" type="text" name="precipitation"><input class="form-control" type="text" value="" disabled readonly>
						풍속<input class="form-control" type="text" name="windSpeed"><input class="form-control" type="text" value="" disabled readonly>
					</div>
				</div>
					
					<button class="justify-content-end" type="submit">저장</button>
			</div>
		
		
		
		
		
		</div>
	</form>


</body>


</html>