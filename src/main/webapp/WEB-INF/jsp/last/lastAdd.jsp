<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
     <title>통나무 펜션</title>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    </head>

    <body>
        <div id="wrap" >
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
                <img src="" id="bannerImage">
            </section>
            <sction>
             
          
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
	
                
                
             </sction>

            <footer class="mt-3 ml-4">
                <address>
                    제주특별자치도 제주시 애월읍  <br>
                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
                    Copyright 2025 tongnamu All right reserved
                </address>

            </footer>


        </div>
        
        <script>
        	$(document).ready(function(){
        		
        		$('#datepicker').datepicker({
		    		dateFormat:"yy-mm-dd",
		    		minDate:0
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
			  		if(isNaN(day)){ // 숫자로만 아루어 진게 아닐경우 true
			  			alert("숙박일 수는 숫자만 가능 합니다.")
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
        				url:"/lastPrac/addList",
        				data:{"name":name, "date":date, "day":day, "headcount":headcount, "phoneNumber":phoneNumber},
        				success:function(data){
        					if(data.success == "true"){
        						location.href ="/lastPrac/showList"
        					}else{
        						alert("삭제실패!!");
        						return;
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