<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="assets/css/login.css"/>
</head>
<body>

  <!-- Header -->
    <header id="header">
      <a href="index.jsp" class="logo">Go Home</a>
    </header>


<h2>Login Page</h2>

<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button>
<h3>Click on the "login" button to sign in
or Click below on sign up to create a new account</h3>

<div id="id01" class="modal">
  <form class="modal-content animate" action="checkLogin" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="images/avatar.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>

      <label for="pwd"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="pwd" required>

      <button type="submit" value="login">Login</button>
      <label>
        <input type="checkbox" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
    </div>
  </form>
</div>

<footer id="footer">
<a href="registration.jsp">Create a New Account</a>
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

<script src="assets/js/modal.js"></script>


</body>
</html>

    