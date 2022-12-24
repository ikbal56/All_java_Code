<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body 	class="bg-dark text-white">
	<div class="container">
	<h2>Registration Form</h2>
		<form action="./registration" method="post">
			
			<div class="form-group">
				<label for="patientName">Patient Name:</label> <input type="text"
					class="form-control" id="patientName" placeholder="Enter your Name"
					name="patientName">
			</div>	
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					class="form-control" id="password" placeholder="Enter your password"
					name="password"></div>
					<div class="form-group">
				<label for="patientContact">Patient Contact:</label> <input type="number"
					class="form-control" id="patientContact" placeholder="Enter contact number"
					name="patientContact">
			
				<button type="submit" class="btn btn-default">Sign Up</button>
		</form><br>		 
	</div>

</body>
</html>
