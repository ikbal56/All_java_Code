<%@page import="com.te.Entity.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%
 String msg=(String)request.getAttribute("msg");
    Patient doctor =(Patient)request.getAttribute("object");
    %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%=msg %></h2><br>

<h3>Patient Id :<%=doctor.getPatientId() %><br>
<h3>Patient Name :<%=doctor.getPatientName() %><br>
<h3>Patient Contact :<%=doctor.getPatientContact() %><br>
<h2>
<form action="./login"><button type="submit" class="btn btn-primary">Login</button></form><br>
</h2>
</body>
</html>