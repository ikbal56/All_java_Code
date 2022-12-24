<%@page import="com.te.healthdto.Doctors"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
     String message=(String)request.getAttribute("msg");
    Doctors doc=(Doctors)request.getAttribute("doc");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=message%><br>
<%=doc.getDoctorId()%>
<%=doc.getDoctorName() %><br>
<%=doc.getSpecialists() %><br>
<%=doc.getMobile() %><br>
<%=doc.getEmail() %><br>
<%=doc.getPassword() %><br>


</body>
</html>