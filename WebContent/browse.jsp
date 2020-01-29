<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String table = (String) request.getAttribute("table");
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<title>Browser</title>
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
					<li><a href="userview.jsp">Home</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
					<li><a href="readcat">See our Categories</a></li>
					<li><a href="checkLogin?logout=true">Logout</a></li>
					<li><a href="viewcart">View Cart</a></li>
				    <li><a href="vieworders">View Orders</a></li>					
				</ul>
			</nav>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<header class="align-center">
						<h1>Browser Page</h1>
					</header>
					<div class="image fit">
						<img src="images/pic05.jpg" alt="browser" />
          </div>
          </div>
			</section>
	${message}

<%=table%>
<form name = "checkout" action="viewcart">
<input type="submit" name="checkoutcart" value="CheckOut">
</form>

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