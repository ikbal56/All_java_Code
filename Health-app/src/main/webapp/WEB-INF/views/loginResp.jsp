<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
   String msg = (String)request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%=msg %>
</h2>
<h2><form action="./reponse"><button type="submit" class="btn btn-primary">See Booked Appointments</button></form><br>
</h2>

</body>
</html>