<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기추가</title>
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

<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>


</head>
<body>

	<div class="container">
		<h1>즐겨찾기추가하기</h1>
			<form method="post" action="/lesson06/test01/1">
				<label>제목</label> <input class="form-control" type="text" name="name" id="nameInput"> 
				<label>주소</label>
				<div class="d-flex"> 
					<input class="form-control" type="text" name="address" id="addressInput"><input class="btn btn-info ml-3" type="button" name="check" id="checkInput" value="중복확인"> 
				</div>
					<button class=" mt-3 btn btn-success col-12" type="button" id="addBtn">추가</button>
			</form>
		</div>

	<script>
		$(document).ready(function() {

			$("#addBtn").on("click", function() {
				let name = $("#nameInput").val();
				let address = $("#addressInput").val();

				if (name == "") {
					alert("이름을 입력하세요");
					return;
				}
				if (address == "") {
					alert("주소를 입력하세요");
					return;
				}
				
				//if (!address.startsWith("http://")) {
					//alert("올바른 주소를 입력하세요!");
					//return;
				//}else if (!address.startsWith("https://")) {
					//alert("올바른 주소를 입력하세요!");
					//return;
				//}

				if(!(address.startsWith("http://") || address.startsWith("https://"))){
						alert("올바른 주소를 입력하세요!");
						return;
				}

				$.ajax({
					type : "post",
					url : "/lesson06/test01/1",
					data : {"name" : name, "address" : address},
					success : function(data) {
						if (data = "success") {
							alert("입력성공");
							//window.location.href = '/lesson06/siteList';	
							$(location).attr('href', '/lesson06/test01');	
						} else {
							alert("입력실패");
						}
					},
					error : function() {
						alert("에러발생");

					}

				});

			});

		});
	</script>

</body>
</html>