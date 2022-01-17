<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>


</head>

<body>
	<div id="wrap">
		<header class="mt-4">
			<div class="text-center display-4">통나무 팬션</div>
			<nav class="mt-4">
				<ul class="nav nav-fill">
					<li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
					<li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
					<li class="nav-item"><a class="nav-link" href="#">예약안내</a></li>
					<li class="nav-item"><a class="nav-link" href="#">커뮤니티</a></li>
				</ul>
			</nav>
		</header>

		<section class="banner">
			<img src="#" id="bannerImage">
		</section>
		<sction class="d-flex">
		<article
			class="reservation d-flex justify-content-center align-items-center">
			<div class="display-4">
				실시간 <br> 예약 하기
			</div>
		</article>
		<article class="reservation-confirm">
			<div class="m-4">
				<div class="d-flex align-items-end">
					<h3 class="mr-4">예약 확인</h3>





					<label class="input-label">이름 </label> <input type="text" class="form-control text-input" name="name" id="nameInput">
					<div class="input-gorup form-inline mt-3">
						<label class="input-label">전화번호 </label> <input type="text" class="form-control text-input" name="phoneNumber" id="phoneNumberInput">
					</div>

					<div class="d-flex justify-content-end">
						<button class="btn btn-success mt-3 mr-5" id="checkBtn">조회하기</button>
					</div>
				</div>
		</article>
		<article
			class="reservation-call d-flex justify-content-center align-items-center">
			<div>
				<h3>예약문의 :</h3>
				<h1>010-</h1>
				<h1>000-1111</h1>
			</div>
		</article>
		</sction>

		<footer class="mt-3 ml-4">
			<address>
				제주특별자치도 제주시 애월읍 <br> 사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 /
				대표:김통목 <br> Copyright 2025 tongnamu All right reserved
			</address>

		</footer>
	</div>


	<script>
		$(document).ready(function(){
			
			$("#checkBtn").on("click", function(){
				let name = $("#nameInput").val();
				let phoneNumber = $("#phoneNumberInput").val();
				
				if(name == ""){
					alert("이름을 입력하세요!!")
					return;
				}
				if(phoneNumber == ""){
					alert("전화번호를 입력하세요!!")
					return;
				}
				
				
			$.ajax({
				type:"get",
				url:"/lesson06/searchReservation",
				//밑에데이터 안의 00은 컨트롤러의 파라미터와 같아야함
				data:{"name":name, "phoneNumber":phoneNumber},
				//data 자체가 객체를 가지고 있는 키가됨...
				success:function(data){
					if(data.searchReservation == "true"){
						
					}else{
						alert("조회 결과가 없습니다..");
					}
				},
				error:function(){
					alert("에러발생");
				}
				
				});
				
			});
			
			
		});
	
	
	</script>












</body>
</html>