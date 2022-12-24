<%@page import="com.te.Entity.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
 String msg=(String)request.getAttribute("msg");
    Doctor doctor =(Doctor)request.getAttribute("object");
    %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%=msg %></h2><br>

<h3>Employement Id :<%=doctor.getDoctorId() %><br>
<h3>Employement Name :<%=doctor.getDoctorName() %><br>
<h3>Employement Specification :<%=doctor.getDoctorSpecification() %><br>
<h2>
<form action="./login"><button type="submit" class="btn btn-primary">Login</button></form><br>
</h2>
</body>
</html>