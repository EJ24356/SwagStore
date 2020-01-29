<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Customer" %>
    <%@page import="model.Order" %>
    <%@page import="model.Address" %>
    <%
    String table = (String) session.getAttribute("table");
    Customer customer = (Customer) session.getAttribute("customer");
    Order order = (Order) session.getAttribute("order");
    Address addy = (Address) session.getAttribute("addy");
    %>

<!DOCTYPE html>
<html>
	<head>
		<title>View Order</title>
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
				<a href="userview.jsp" class="logo">Swag Store</a>
			</header>

		<!-- Menu -->
			<nav id="menu">
				<ul class="links">
					<li><a href="userview.jsp">Home</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
					<li><a href="browse">Browse</a></li>
					<li><a href="checkLogin?logout=true">Logout</a></li>
				</ul>
			</nav>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<header class="align-center">
						<h1>Thanks for your purchase <%=customer.getName() %> !</h1>
					</header>
					<div class="image fit">
						<img src="images/pic05.jpg" alt="browser" />
          </div>
          </div>
			</section>
			<h2>Your Order has been completed!</h2>

<%=table%>

<label>Address:</label>
<h2>Street: <%=addy.getStreet()%></h2>
<h2>City: <%=addy.getCity()%></h2>
<h2>State: <%=addy.getState()%></h2>
<h2>ZipCode <%=addy.getZipcode()%></h2>
<h2>Country: <%=addy.getCountry()%></h2>

<label>Purchase Date:</label>
<h2><%=order.getOrderdate()%></h2>

<label>Shipping Date:</label>
<h2><%=order.getShippingdate()%></h2>




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
