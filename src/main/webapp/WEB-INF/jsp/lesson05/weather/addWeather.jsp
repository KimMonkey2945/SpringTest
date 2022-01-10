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
</head>

<body>

	<form method="get" action="/lesson05/add_Weather">
	
		<div class="container">
		
			<div class="d-flex">
			
				<div class="col-2 bg-primary">
				
					<div class="logo text-center">
						<img width=30px alt="기상청로고" src="">기상청
					</div>
					
					<ul class="nav">
						<li class="nav-item"><a class="text-light nav-link"
							href="/lesson05/get_Weather">날씨</a></li>
						<li class="nav-item"><a class="text-light nav-link" href="#">날씨입력</a></li>
						<li class="nav-item"><a class="text-light nav-link" href="#">테마날씨</a></li>
						<li class="nav-item"><a class="text-light nav-link" href="#">관측기후</a></li>
					</ul>
					
				</div>
				
				<div>

					<div class="ml-4">
						<h2>날씨입력</h2>
						
						<div class="d-flex">
							<label>날짜</label><input class="form-control col-3" type="text" name="date">

							<label>날씨</label>
							<select class="form-control col-3" name="weather">
								<option value="맑음">맑음</option>
								<option value="비">비</option>
								<option value="흐림">흐림</option>
								<option value="구름조금">구름조금</option>
							</select>
							
							<label>미세먼지</label> 
							<select class="form-control col-3" name="microDust">
								<option value="좋음">좋음</option>
								<option value="나쁨">나쁨</option>
								<option value="보통">보통</option>
								<option value="최악">최악</option>
							</select>
						</div>
						
						<div class="d-flex mt-3">
						
							<label>기온</label>
							<div class="input-group col-3">
								<input type="text" class="form-control" name="temperatures">
								<span class="input-group-text">℃</span>
							</div>

							<label>강수량</label>
							<div class="input-group col-3">
								<input type="text" class="form-control" name="precipitation">
								<span class="input-group-text">mm</span>
							</div>
							<label>풍속</label>
							<div class="input-group col-3">
								<input type="text" class="form-control" name="windSpeed">
								<span class="input-group-text">km/h</span>
							</div>
						</div>
					</div>
					
					<div class="">
						<button class=" btn btn-success justify-content-right mt-3" type="submit">저장</button>
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
		</div>

	</form>


</body>


</html>