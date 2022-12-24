<%@page import="java.util.ArrayList"%>
<%@page import="com.te.Entity.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Patient's List</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b>Patient ID</b></th>
			<th><b>Patient Name</b></th>
			<th><b>Contact number</b></th>
		</tr>
		<%
		ArrayList<Patient> std = (ArrayList<Patient>) request.getAttribute("allpatient");
		for (Patient s : std) {
		%>
		<tr>
			<td><%=s.getPatientId()%></td>
			<td><%=s.getPatientName()%></td>
			<td><%=s.getPatientContact()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<hr />
</body>
</html>