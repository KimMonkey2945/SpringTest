<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>
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
	
<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	
</head>

<body>
	
	<div class="container">
		<header class="title text-center display-3">통나무 펜션</header>
		<nav>
			<ul class="nav d-flex justify-content-around">
				<li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
				<li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson06/addBookingView">예약하기</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson06/bookingList">예약목록</a></li>
			</ul>
		</nav>
		
		<content>
			<h1 class="text-center mt-3">예약하기</h1>
			
			<label>이름</label>
			<input class="form-control" type="text" name="name" id="nameInput">
			<label>예약날짜</label>
			<input class="date form-control" type="text" id="datepicker" name="date">
			<label>숙박일수</label>
			<input class="form-control" type="text" name="day" id="dayInput">
			<label>숙박인원</label>
			<input class="form-control" type="text" name="headcount" id="headcountInput">
			<label>전화번호</label>
			<input class="form-control" type="text" name="phoneNumber" id="phoneNumberInput">
			
			<input class="mt-3 btn form-control btn-warning" type="button" value="예약하기" id="addBookingBtn">
		</content>
			
	</div>
	
	<footer>
			<div class=" mt-3 small text-secondary">제주특별자치도 제주시 애월읍<br>
				사업자 등록 번호:111-22-255222/농어촌민박사업지정/대표:김동욱<br>
				Copyright 2025 tongnamu All right reserved
			</div>
	</footer>
	
		<script>
			$(document).ready(function(){
				
			  	
			    	$('#datepicker').datepicker({
			    		dateFormat:"yy-mm-dd"
			    	});
			 
			  	
			  	$("#addBookingBtn").on("click", function(){
			  		let name = $("#nameInput").val();
			  		let date = $("#datepicker").val();
			  		let day = $("#dayInput").val();
			  		let headcount = $("#headcountInput").val();
			  		let phoneNumber = $("#phoneNumberInput").val();
			  		
			  		if(name == ""){
			  			alert("이름을 입력하세요!!");
			  			return;
			  		}
			  		if(date == ""){
			  			alert("날짜를 입력하세요!!");
			  			return;
			  		}
			  		if(day == ""){
			  			alert("숙박일 수를 입력하세요!!");
			  			return;
			  		}
			  		if(headcount == ""){
			  			alert("숙박인원을 입력하세요!!");
			  			return;
			  		}
			  		if(phoneNumber == ""){
			  			alert("전화번호를 입력하세요!!");
			  			return;
			  		}
			  		
			  	$.ajax({
			  		type:"get",
			  		url:"/lesson06/addBooking",
			  		data:{"name":name, "date":date, "day":day, "headcount":headcount, "phoneNumber":phoneNumber},
			  		success:function(data){
			  			if(data == "success"){
			  				alert("예약성공");
			  				location.href = "/lesson06/bookingList";
			  			}else{
			  				alert("예약실패");
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