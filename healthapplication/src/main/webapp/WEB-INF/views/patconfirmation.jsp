<%@page import="com.te.healthdto.Patients"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
        String message=(String)request.getAttribute("msg");
        Patients pat=(Patients)request.getAttribute("patients");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=message%><br>
<%=pat.getPatientId()%>
<%=pat.getPatientName()%><br>
<%=pat.getMobile()%><br>
<%=pat.getCity()%><br>
<%=pat.getPassword()%><br>

</body>
</html>