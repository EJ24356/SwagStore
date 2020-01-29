<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--
	Released for free under the Creative Commons Attribution 3.0 license
-->
<html lang="en">
	<head>
		<title>SwagStore</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>

		<!-- Header -->
			<header id="header">
				<nav class="left">
					<a href="#menu"><span>Menu</span></a>
				</nav>
				<a href="aboutus.jsp" class="logo">Swag Store</a>
			</header>

		<!-- Menu -->
			<nav id="menu" >
				<ul class="links">
					<li><a href="browse">Browse</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
					<li><a href="checkLogin?logout=true">Logout</a></li>
			        <li><a href="readcat">See our Categories</a></li>
			        <li><a href="vieworders">View Orders</a></li>
				</ul>
			</nav>

		<!-- Banner -->
			<section id="banner">
				<div class="content">
					<h1>Welcome, ${user.username}!</h1>
					<p>A variety of items for a variety of people</p>
					<ul class="actions">
						<li><a href="browse" class="button scrolly">Get Started</a></li>
					</ul>
				</div>
			</section>

		<!-- Two -->
			<section id="two" class="wrapper style1 special">
				<div class="inner">
					<h2>"Don't Chase, Get Chosen</h2>
				</div>
			</section>

		<!-- Three -->
			<section id="three" class="wrapper">
				<div class="inner flex flex-3">
					<div class="flex-item box">
						<div class="image fit">
							<img src="images/pic02.jpg" alt="" />
						</div>
						<div class="content">
							<h3>Clothes</h3>
						</div>
					</div>
					<div class="flex-item box">
						<div class="image fit">
							<img src="images/pic03.jpg" alt="" />
						</div>
						<div class="content">
							<h3>Accessories</h3>
						</div>
					</div>
					<div class="flex-item box">
						<div class="image fit">
							<img src="images/pic04.jpg" alt="" />
						</div>
						<div class="content">
							<h3>Treats</h3>
						</div>
					</div>
				</div>
			</section>

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
					&copy; SwagStore. Design by <a href = "https://www.linkedin.com/in/jesse-eldell-/">Jesse
						Eldell </a>
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
    