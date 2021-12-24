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
<img  src="<%=getServletContext().getContextPath()%>/img/kratos.png" alt="Logo" />

<form  method="post" action="http://localhost:8080/battle_2/servletCreation">
    		<div >
        		<label for="name">Nom :</label>
        		<input type="text" id="name" name="user_name">
    		</div>
    		
    		<div >
        		<label for="tyype">Type :</label>
        		<input type="text" id="tyype" name="user_type">
    		</div>
    		<div>
    			<label for="age">Age :</label>
        		<input type="number" id="age" name="user_age">
    		</div>
    		<div >
       				 <button type="submit" id = "button" >Envoyer</button>
    		</div>
    		
 </form>
 

 
 
</body>
</html>