<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> HomePage</title>
</head>
<body>

<h1 style="text-align:center">Welcome to Health Application</h1>
<h3>Please choose below Options to navigate</h3>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
 
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
     
      <li class="nav-item">
        <a class="nav-link" href="./signup">SignUp To Health App <span class="sr-only"></a>
      </li>
     
      <li class="nav-item active">
        <a class="nav-link" href="./login">Login Health App<span class="sr-only"></span></a>
      </li>
      
    </ul>
  </div>
</nav>



</body>
</html>