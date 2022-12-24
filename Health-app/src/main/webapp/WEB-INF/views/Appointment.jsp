<%@page import="java.util.ArrayList"%>
<%@page import="com.te.Entity.Doctor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Doctor's List</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b>Doctor ID</b></th>
			<th><b>Doctor Name</b></th>
			<th><b>Specialized In</b></th>
		</tr>
		<%
		ArrayList<Doctor> std = (ArrayList<Doctor>) request.getAttribute("alldoctor");
		for (Doctor s : std) {
		%>
		<tr>
			<td><%=s.getDoctorId()%></td>
			<td><%=s.getDoctorName()%></td>
			<td><%=s.getDoctorSpecification()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<hr />
	<form action="./appoint" method="get">
		<div class="form-group">
			<label for="doctorId">Doctor Id:</label> <input type="number"
				class="form-control" id="doctorId" name="doctorId">

		</div>
		<div class="form-group">
			<label for="doctorId">Date of Appointment:</label> <input type="date"
				size="30" class="form-control" min="2022-01-01" max="2030-01-01"
				id="calender" name="calender">
		</div>

		<label for="cars">Choose a Time Slot:</label> <select name="time"
			id="time">
			<option value="11Am-12AM">11AM-12AM</option>
			<option value="3PM-4PM">3PM-4PM</option>
			<option value="4PM-5PM">4PM-5PM</option>
			<option value="5PM-6PM">5PM-6PM</option>
		</select> <br> <br> <input type="submit" value="Book Appointment" />
	</form>



</body>
</html>