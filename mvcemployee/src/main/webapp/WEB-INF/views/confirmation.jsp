<%@page import="com.te.dtomvc.Employe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String message=(String)request.getAttribute("msg");
    Employe em=(Employe)request.getAttribute("Empp");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee confirmation</title>
</head>
<body>

<%=message %><br>

<%=em.getFirstName()%><br>
<%=em.getLastName()%><br>
<%=em.getPassword() %>
</body>
</html>