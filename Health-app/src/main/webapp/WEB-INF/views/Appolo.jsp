<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<style>
{
margin
:
 
0
;


    
padding
:
 
0
;


    
box-sizing
:
 
border-box
;



}
.full-page {
	height: 100vh;
	width: 100%;
	background: coral;
	position: absolute;
}

.sub-page {
	width: 1266px;
	height: 559px;
	position: absolute;
	background: url(bg1.jpg);
	background-size: cover;
	background-position: center;
	left: 50px;
	top: 50px;
}

.navigation-bar {
	display: flex;
	align-items: center;
	padding: 20px;
	padding-left: 80px;
	padding-right: 30px;
	padding-top: 50px;
}

.logo {
	position: fixed;
	margin-top: 10px;
}

.logo a {
	text-decoration: none;
	color: white;
	font-size: 30px;
}

nav {
	flex: 1;
	position: fixed;
	right: 0;
}

nav ul {
	display: inline-block;
	list-style: none;
}

nav ul li {
	display: inline-block;
	margin-right: 90px;
	margin-top: 17px;
}

nav ul li a {
	text-decoration: none;
	font-size: 20px;
	color: white;
	font-family: sans-serif;
}

nav ul li a:hover {
	color: saddlebrown;
}

.row {
	display: flex;
	align-items: center;
	flex-wrap: wrap;
	justify-content: space-around;
}

.col-1 {
	flex-basis: 50%;
	min-width: 300px;
}

.form-box {
	width: 300px;
	height: 400px;
	position: relative;
	top: 50px;
	left: 120px;
	background: rgba(0, 0, 0, 0.6);
}

.main-heading {
	color: orangered;
	padding-bottom: 20px;
}

.form {
	position: relative;
	margin: 0 auto 100px;
	padding: 45px;
	text-align: center;
}

.form input {
	font-family: sans-serif;
	outline: none;
	border: none;
	border-bottom: 1px solid black;
	width: 100%;
	margin: 0 0 15px;
	padding: 15px;
	font-size: 14px;
}

.form button {
	font-family: sans-serif;
	width: 100%;
	color: white;
	font-size: 14px;
	cursor: pointer;
	padding: 15px;
	border: none;
	background: coral;
}

.form .message {
	font-size: 12px;
	margin: 15px 0 0;
	color: white;
}

.form .message a {
	color: orangered;
	text-decoration: none;
}

.form .register-form {
	display: none;
}

.defination {
	text-align: left;
	font-size: 30px;
	color: white;
	font-family: 'Kaushan Script', cursive;
	padding-left: 60px;
}
</style>
<head>
<meta charset="UTF-8">
<title>seek coding</title>
<link rel="stylesheet" href="style.css">
<link
	href="https://fonts.googleapis.com/css2?family=Kaushan+Script&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="full-page">
		<div class="sub-page">
			<div class="navigation-bar">
				<div class="logo">
					<a href='photography.html'>Doctor's Login Page</a>
				</div>
				<nav>
					<ul id='MenuItems'>
						<li><a href='#'>Home</a></li>
						<li><a href='#'>Photos</a></li>
						<li><a href='#'>Services</a></li>
						<li><a href='#'>Contact</a></li>
					</ul>
				</nav>
			</div>
			<div class="row">
				<div class="col-1">
					<div class="form-box">
						<div class="form">

							<form action="./Login" method="post">
								<center>
									<h1 class="main-heading">Login Form</h1>
								</center>

								<div class="form-group">
									<label for="id">Doctor Id:</label> <input type="number"
										class="form-control" id="email" name="id">

								</div>
								<div class="mb-3">
									<label for="password" class="form-label">Password</label> <input
										type="password" class="form-control" id="password">
								</div>
								<button type="submit" class="btn btn-primary">Login</button>
								<p class="message">
									Not Registered? <a href="./insert">Register</a>
								</p>
						</div>
					</div>
				</div>
				<div class="col-1">
					<p class='defination'>
					<h2>Welcome to the Appolo Hospitals</h2> <h4><br>Established by Dr Prathap
						C Reddy in 1983, Apollo Healthcare has a robust presence across
						the healthcare ecosystem. From routine wellness & preventive
						health care to innovative life-saving treatments and diagnostic
						services, Apollo Hospitals has touched more than 120 million lives
						from over 120 countries, offering the best clinical outcomes.<br>Book
						An appointment</h4>
					</p>
				</div>
			</div>
		</div>
	</div>
	<script src='https://code.jquery.com/jquery-3.2.1.min.js'>
		
	</script>
	<script>
		$('.message a').click(function() {
			$('form').animate({
				height : "toggle",
				opacity : "toggle"
			}, "slow");
		});
	</script>
</body>
</html>