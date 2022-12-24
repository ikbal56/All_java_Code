<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Signup Form</title>
</head>
<body>

<form action="./patprocess">
<h2 style="text-align:center;">Welcome to Health Application</h2><br>
<h3 style="text-align:center;">Please Fill Your Details</h3><br>

Enter Your UserId:<input type="text" name="patientId"><br>
Enter Your Name:<input type="text" name="patientName"><br>
Enter Your Mobile:<input type="text" name="mobile"><br>
Enter Your City:<input type="text" name="city"><br>
Enter Your Password:<input type="text" name="password">
<input type="submit" name="submit">



</form>

</body>
</html>