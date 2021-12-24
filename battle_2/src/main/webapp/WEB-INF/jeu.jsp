<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
  <%@include file="css/stylex.css" %>
</style>
<body>
<c:forEach var="nom" items="${test}">
	<li class="a">${nom}</li>
</c:forEach>

Votre nom : <c:out value="${u_name}" /> !<br> 
Type : <c:out value="${u_type}" /><br>
Vos PV : <c:out value="${j_pV}" /> !<br> 
<br>

COM : <c:out value="${adv_name}" /> !<br> 
COM PV : <c:out value="${adv_pV}" /> !<br> 

 
 <div class="btns" >

 
 <div class="btn">
  <form method="post" action="http://localhost:8080/battle_2/servletAttaque">
 		<button type="submit" > <img  src="https://cdn-icons-png.flaticon.com/512/523/523813.png" alt="Logo" /></button>
 </form>
 </div>
 
  <div class="btn">
   <form method="post" action="http://localhost:8080/battle_2/servletRestauration">
 		<button type="submit" > <img  src="https://cdn.icon-icons.com/icons2/1581/PNG/512/3668865-beauty-cosmetics-health-heart_108034.png" alt="Logo" /></button>
   </form>
 </div>
 
  </div>
 

 


</body>
</html>