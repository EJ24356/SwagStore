<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<a href="checkLogin?check=true" class="logo">Swag Store</a>
			</header>
		<h2>${msg}</h2>
		
		<!-- Menu -->
			<nav id="menu" >
				<ul class="links">

				<li><a href="checkLogin?check=true">Home</a></li>
					<li><a href="aboutus.jsp">About Us</a></li>
					<li><a href="login.jsp">Login</a></li>
			<li><a href="readcat">See our Categories</a></li>
				</ul>
			</nav>

<!-- Form -->
  <h3>Registration</h3>

  <form method="get" name= "register" action="validate">
    <div>
      <!-- Name -->
      <div class="6u 12u$(xsmall)">
        <input type="text" name="name" id="name" value="" placeholder="Name" required/>
      </div>
      <!-- email -->
      <div class="6u$ 12u$(xsmall)">
        <input type="email" name="email" id="email" value="" placeholder="Email" required/>
      </div>
      <!-- phonenumber -->
     <div class="6u$ 12u$(xsmall)">
       <input type="text" name="phonenumber" id="phonenumber" value="" placeholder="Phonenumber" required/>
     </div>
      <!-- Street-->
      <div class="6u$ 12u$(xsmall)">
        <input type="text" name="street" id="street" value="" placeholder="Street" required />
      </div>
      <!-- City -->
     <div class="6u$ 12u$(xsmall)">
       <input type="text" name="city" id="city" value="" placeholder="City" required/>
     </div>
      <!-- State -->
      <div class="6u$ 12u$(xsmall)">
        <select name="state" id="state">
          <option value="na">State</option>
          <option value="AL">Alabama</option>
        	<option value="AK">Alaska</option>
        	<option value="AZ">Arizona</option>
        	<option value="AR">Arkansas</option>
        	<option value="CA">California</option>
        	<option value="CO">Colorado</option>
        	<option value="CT">Connecticut</option>
        	<option value="DE">Delaware</option>
        	<option value="DC">District Of Columbia</option>
        	<option value="FL">Florida</option>
        	<option value="GA">Georgia</option>
        	<option value="HI">Hawaii</option>
        	<option value="ID">Idaho</option>
        	<option value="IL">Illinois</option>
        	<option value="IN">Indiana</option>
        	<option value="IA">Iowa</option>
        	<option value="KS">Kansas</option>
        	<option value="KY">Kentucky</option>
        	<option value="LA">Louisiana</option>
        	<option value="ME">Maine</option>
        	<option value="MD">Maryland</option>
        	<option value="MA">Massachusetts</option>
        	<option value="MI">Michigan</option>
        	<option value="MN">Minnesota</option>
        	<option value="MS">Mississippi</option>
        	<option value="MO">Missouri</option>
        	<option value="MT">Montana</option>
        	<option value="NE">Nebraska</option>
        	<option value="NV">Nevada</option>
        	<option value="NH">New Hampshire</option>
        	<option value="NJ">New Jersey</option>
        	<option value="NM">New Mexico</option>
        	<option value="NY">New York</option>
        	<option value="NC">North Carolina</option>
        	<option value="ND">North Dakota</option>
        	<option value="OH">Ohio</option>
        	<option value="OK">Oklahoma</option>
        	<option value="OR">Oregon</option>
        	<option value="PA">Pennsylvania</option>
        	<option value="RI">Rhode Island</option>
        	<option value="SC">South Carolina</option>
        	<option value="SD">South Dakota</option>
        	<option value="TN">Tennessee</option>
        	<option value="TX">Texas</option>
        	<option value="UT">Utah</option>
        	<option value="VT">Vermont</option>
        	<option value="VA">Virginia</option>
        	<option value="WA">Washington</option>
        	<option value="WV">West Virginia</option>
        	<option value="WI">Wisconsin</option>
        	<option value="WY">Wyoming</option>
          <option value="AS">American Samoa</option>
          <option value="GU">Guam</option>
          <option value="MP">Northern Mariana Islands</option>
          <option value="PR">Puerto Rico</option>
          <option value="UM">United States Minor Outlying Islands</option>
          <option value="VI">Virgin Islands</option>
        </select>
      <!--  <input type="text" name="state" id="state" value="" placeholder="State"/>-->
      </div>
      <!-- Zipcode -->
      <div class="6u$ 12u$(xsmall)">
        <input type="text" name="zipcode" id="zipcode" value="" placeholder="ZipCode" required/>
      </div>
      <!-- country -->
      <div class="6u$ 12u$(xsmall)">
  <select id="country" name="country">
       <option value="na">Country</option>
       <option value="US">United States</option>
       <option value="UK">United Kingdom</option>
       <option value="PRC">China</option>
       <option value="Virgin Islands (Brit)">Virgin Islands (Brit)</option>
       <option value="Virgin Islands (USA)">Virgin Islands (USA)</option>
    </select>
         <!--<input type="text" name="country" id="country" value="" placeholder="Country" required/>-->
      </div>
      <!-- Username -->
      <div class="6u$ 12u$(xsmall)">
        <input type="text" name="username" id="username" value="" placeholder="New Username" required/>
      </div>
      <!-- password -->
      <div class="6u$ 12u$(xsmall)">
        <input type="password" name="password" id="password" value="" placeholder="New Password" required/>
      </div>
      <div class="12u$">
        <ul class="actions">
          <li><input type="submit" value="Create Account" /></li>
          <li><input type="reset" value="Reset" class="alt" /></li>
        </ul>
      </div>
    </div>
  </form>
