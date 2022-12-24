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
<h2><samp><%=msg %></samp>
</h2><br>
<h2><form action="./appointment/getAll"><button type="submit" class="btn btn-primary">Book Appointment</button></form><br>
</h2>


</body>
</html>