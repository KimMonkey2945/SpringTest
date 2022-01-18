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
            <sction class="d-flex">
             
                <h3 class="mr-4">예약목록보기</h3>
                
                <table class="table">
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
                		<c:forEach var="last" items="${result}">
                		<tr>
                			<td>${last.name }</td>
                			<td><fmt:formatDate value="${last.date }" pattern="yyyy년 MM월 dd일"/></td>
                			<td>${last.day }</td>
                			<td>${last.headcount }</td>
                			<td>${last.phoneNumber }</td>
                			<c:choose>
                				<c:when test="${last.state eq '대기중'}">
                					<td class="text-info">${last.state }</td>
                				</c:when>
                				<c:when test="${last.state eq '확정'}">
                					<td class="text-success">${last.state }</td>
                				</c:when>
                			</c:choose>
                			
                			<td><input class="deleteBtn btn btn-danger" type="button" value="삭제" ></td>
                		</tr>
                		</c:forEach>
                	</tbody>
                
                
                
                </table>
                  

                    
           
                
            </sction>

            <footer class="mt-3 ml-4">
                <address>
                    제주특별자치도 제주시 애월읍  <br>
                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
                    Copyright 2025 tongnamu All right reserved
                </address>

            </footer>


        </div>
</body>
</html>