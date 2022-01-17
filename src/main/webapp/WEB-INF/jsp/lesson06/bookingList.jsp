<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약목록보기</title>
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
			<ul class="nav d-flex justify-content-around"">
				<li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
				<li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson06/addBookingView">예약하기</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson06/bookingList">예약목록</a></li>
			</ul>
		</nav>
		
		<content>
			<h1 class="text-center">예약목록보기</h1>
			
			<table class="table form-control">
				<thead>
					<tr>
						<th>이름</th>
						<th>예약날짜</th>
						<th>숙박일수</th>
						<th>숙박인원</th>
						<th>전화번호</th>
						<th>예약상태</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					
					<c:forEach var="bookings" items="${booking }">
						<tr>
							<td>${bookings.name }</td>
							
							<fmt:formatDate value="${bookings.date }" pattern="yyyy년M월d일" var="Date"/>
							<td>${Date }</td>
							<td>${bookings.day }</td>
							<td>${bookings.headcount }</td>
							<td>${bookings.phoneNumber }</td>
							
							<c:choose>
								<c:when test="${bookings.state eq '대기중' }">
									<td class="text-info">${bookings.state }</td>
								</c:when>
								<c:when test="${bookings.state eq '확정' }">
									<td class="text-success">${bookings.state }</td>
								</c:when>
								<c:when test="${bookings.state eq '취소' }">
									<td class="text-danger">${bookings.state }</td>
								</c:when>
							</c:choose>
							
							<td><button class="deleteBtn btn btn-danger" type="button" data-booking-id="${bookings.id }">삭제</button></td>				
						</tr>
					</c:forEach>
				</tbody>
			</table>
		
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
				
				$(".deleteBtn").on("click", function(){
					let id = $(this).data("booking-id");
					
				$.ajax({
					type:"get",
					url:"/lesson06/deleteList",
					data:{"id":id},
					success:function(data){
						if(data == "success"){
						alert("삭제성공!!")
						location.reload();							
						}else{
							alert("삭제실패");
						return;
						}
					},
					error:function(){
						alert("에러발생!!");
					}
					
				});
					
					
				});
				
			});
		
		
		</script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>