<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%
   String table = (String) request.getAttribute("table");
   %> 
<!DOCTYPE HTML>
<!--
	Released for free under the Creative Commons Attribution 3.0 license
-->
<html>
	<head>
		<title>Categories</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="subpage">

		<!-- Header -->
			<header id="header">
				<nav class="left">
					<a href="#menu"><span>Menu</span></a>
				</nav>
				<a href="checkLogin?check=true" class="logo">Swag Store</a>
			</header>

		<!-- Menu -->
			<nav id="menu">
				<ul class="links">
					<li><a href="checkLogin?check=true">Home</a></li>
					<li><a href="browse">Browse</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
				</ul>
			</nav>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<header class="align-center">
						<h1>Categories</h1>
					</header>

						<div class="row">
							<p>Here are our categories:</p>
						</div>
				</div>
					</section>
          
<!-- Insert table here -->
		<%=table %>

		<ul class="icons">
				<li><a href="https://twitter.com/EJ12345" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="https://www.facebook.com/jesse.eldell" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
				 <li><a href="https://www.instagram.com/i_am_jessy3/" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
				 <li><a href="https://github.com/EJ24356" class="icon fa-github"><span class="label">Github</span></a></li>
			 </ul>

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
	&copy; SwagStore. Design by <a href = "https://www.linkedin.com/in/jesse-eldell-/">Jesse Eldell </a>
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
