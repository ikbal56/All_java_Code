<%@page import="com.te.Entity.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.te.Entity.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
  Patient patient=(Patient)request.getAttribute("patient");
  String date=(String)request.getAttribute("date");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body  {

	height:1024px;
	width:1024px;
    
    background-repeat: no-repeat;
    background-size: cover;
    background-blend-mode:screen;
    color:#009999;
    background-image:url(C:\Users\HP\Desktop\bg.jpg);
   
}
</style>


<body class="p-3 mb-2 bg-secondary text-black">
<h2>
Your Appointment is booked Successfully Below are the Doctor details :<br>
<%
Patient patientref= (Patient) request.getAttribute("patient");
List<Doctor> doctor= new ArrayList<Doctor>();
doctor.addAll(patientref.getDoctor());
//ArrayList<String> calenderlist = (ArrayList<String>) request.getAttribute("calender");
%>
</h2>
<h1>Doctor's List</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b>Doctor ID</b></th>
			<th><b>Doctor Name</b></th>
			<th><b>Specialized In</b></th>			
		</tr>
		<%
		
		for (Doctor s : doctor) {
		%>
		<tr>
			<td><%=s.getDoctorId()%></td>
			<td><%=s.getDoctorName()%></td>
			<td><%=s.getDoctorSpecification()%></td>
			<%-- <%			for(String li : calenderlist)
			{ %>
					<td><%=li%></td>
		<%} %>	
		 --%>
		</tr>
		<%
		}
		%>


<h5>
Your Appointment Booked On Date And Time :
<br>
<%=
date
%>
</h5>       
</body>
</html>