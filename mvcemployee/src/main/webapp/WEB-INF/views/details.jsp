<%@page import="com.te.dtomvc.Employe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String message=(String)request.getAttribute("msg");
    Employe emp=(Employe)request.getAttribute("employee");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

<%=message%><br>
<%=emp.getEmpId() %><br>
<%=emp.getFirstName() %><br>
<%=emp.getLastName() %><br>
<%=emp.getContactNumber() %><br>

</body>
</html>