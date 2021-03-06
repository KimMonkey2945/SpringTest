<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 리스트</title>
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
	<div class="container">
		<h1>즐겨찾기목록</h1>
		<table class="table">
			<tr>
				<th>No.</th>
				<th>이름</th>
				<th>주소</th>
				<th></th>
			</tr>

			<c:forEach var="sites" items="${site}" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${sites.name }</td>
					<td>${sites.address }</td>
					<td><button class="deleteBtn btn btn-danger" type="button" data-sites-id="${sites.id }">삭제</button></td>
					<!--아이디로 할 땐 한가지 밖에 못함. 여러개 일땐 클래스로 잡아오는것이 좋음 -->
				</tr>
			</c:forEach>
		</table>
	</div>

	<script>
		$(document).ready(function() {

			$(".deleteBtn").on("click", function() {
								
				let id = $(this).data("sites-id");
				

				$.ajax({
					type:"get",
					url:"/lesson06/deleteAddress",
					data:{"id": id},
					success: function(data) {
						if (data == "success") {
							alert("삭제성공!!")
							location.reload();
						} else {
							alert("삭제실패..")
						}
					},
					error: function() {
						alert("에러발생")
					}

				});

			});

		});
	</script>












</body>
</html>