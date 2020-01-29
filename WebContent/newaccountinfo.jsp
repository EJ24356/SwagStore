<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String name = (String) request.getAttribute("name");
    String email =(String) request.getAttribute("email");
    String phonenumber = (String) request.getAttribute("phonenumber");
    String street = (String) request.getAttribute("street");
    String city = (String) request.getAttribute("city");
    String state = (String) request.getAttribute("state");
    String zipcode = (String) request.getAttribute("zipcode");
    String country = (String) request.getAttribute("country");
    String username = (String) request.getAttribute("username");
    String password = (String) request.getAttribute("password");
    %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>New Account Info</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/browserstyle.css" />
	</head>
	<body class="subpage">

		<!-- Header -->
			<header id="header">
				<nav class="left">
					<a href="#menu"><span>Menu</span></a>
				</nav>
				<a href="index.jsp" class="logo">Swag Store</a>
			</header>

		<!-- Menu -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
					<li><a href="readcat">See our Categories</a></li>
				</ul>
			</nav>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<header class="align-center">
						<h1>New Account Info</h1>
					</header>
					<div class="image fit">
						<img src="images/pic05.jpg" alt="browser" />
          </div>
          </div>
			</section>

<h3>Name: <%=name %></h3>
<h3>Email: <%=email %></h3>
<h3>PhoneNumber: <%=phonenumber %></h3>
<h3>Street: <%=street %></h3>
<h3>City: <%=city %></h3>
<h3>State: <%=state %></h3>
<h3>ZipCode: <%=zipcode %></h3>
<h3>Country: <%=country %></h3>
<h3>Username: <%=username %></h3>
<h3>Current Password: <%=password %> </h3>
<h4>**Write your username and password down**</h4>


			<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<h2>Contact</h2>
					<ul class="actions">
						<li><span class="icon fa-phone"></span> <a href="tel:706-542-3000">(706) 542-9106</a></li>
						<li><span class="icon fa-envelope"></span> <a href="mailto:jjldell14@gmail.com">swagStore@swag.com</a></li>
						<li><span class="icon fa-map-marker"></span> <a href="https://maps.google.com/?q=600 S Lumpkin St, Athens, GA 30605">
							4630 Piercy Road Athens,GA 30609</a></li>
					</ul>
				</div>
				<div class="copyright">
					&copy; SwagStore. Design by <a href = "https://www.linkedin.com/in/jesse-eldell-/">
					Jesse Eldell </a>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>