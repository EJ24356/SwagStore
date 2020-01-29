<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Products" %>
 
<% Products product = (Products) session.getAttribute("product");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "assets/css/browserstyle.css" />
<title>SwagStore - Add an Item</title>
</head>
<body>


<!-- Header -->
			<header id="header">
				<nav class="left">
					<a href="#menu"><span>Menu</span></a>
				</nav>
				<a href="browse" class="logo">Swag Store</a>
			</header>

		<!-- Menu -->
			<nav id="menu">
				<ul class="links">
					<li><a href="userview.jsp">Home</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
					<li><a href="readcat">See our Categories</a></li>
					<li><a href="viewcart">View Cart</a></li>
				</ul>
			</nav>
			
		<div class="inner">
					<header class="align-center">
						<h1>SwagStore - Add an Item</h1>
					</header>
					<div class="image fit">
						<img src="images/pic05.jpg" alt="browser" />
          </div>
          </div>
		
			
<form name=addForm action=add2cart method=get >

   <label>
    What is the amount of <%=product.getName()%> do you want to buy?
   </label>
   <input type="text" name=itemnum value="" />
   <br>
   
   <input type=submit name=submit value="Add to Cart" />

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