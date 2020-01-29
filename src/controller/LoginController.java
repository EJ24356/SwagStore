package controller;

import dbHelpers.ReadRecordAddy;
import dbHelpers.ReadRecordCustomer;
import dbHelpers.ReadRecordOrder;
import dbHelpers.UserHelper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Address;
import model.Cart;
import model.Customer;
import model.User;
import utilities.PasswordService;

/**
 * Servlet implementation class LoginController
 * A controller for handling user authentication and login
 */
@WebServlet(description = "A controller for handling user logins", urlPatterns = { "/checkLogin" })
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private HttpSession session; 
	private String url;
	private int loginAttempts;
    private boolean loggedin = false;
    
	/**
	 * Servlet constructor
	 */
	public LoginController() {
		super();
	}

	/**
	 * Process GET requests/responses (logout)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//User has clicked the logout link
		session = request.getSession();
		url = "index.jsp";

		//check to make sure we've clicked link
		if(request.getParameter("logout") !=null){

			//logout and redirect to frontpage
			logout();
			url="index.jsp";
		}
		else if(request.getParameter("check")!=null&&loggedin){
			login(request,response);
			url = "userview.jsp";
		}

		//forward our request along
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * Process POST requests/responses (login)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get our current session
		session = request.getSession();

		//get the number of logins
		if(session.getAttribute("loginAttempts") == null){
			
			loginAttempts = 0;
		}
		
		//exceeded logins
		if(loginAttempts > 2){
			String errorMessage = "Error: Number of Login Attempts Exceeded";
			request.setAttribute("errorMessage", errorMessage);
			url = "index.jsp";
		}else{	//proceed
			//pull the fields from the form
			String username = request.getParameter("uname");
			String password = request.getParameter("pwd");

			//encrypt the password to check against what's stored in DB
			PasswordService pws = new PasswordService();
			String encryptedPass = pws.encrypt(password);
			System.out.println(password);
			System.out.println(encryptedPass);
			
			//create a user helper class to make database calls, and call authenticate user method
			UserHelper uh = new UserHelper();
			User user = uh.authenticateUser(username, encryptedPass);

			//we've found a user that matches the credentials
			if(user != null){
				//invalidate current session, then get new session for our user (combats: session hijacking)
				session.invalidate();
				loggedin = true;
				session=request.getSession(true);
				session.setAttribute("user", user);
				Cart cart = new Cart();//declare a fresh cart
				session.setAttribute("cart", cart);
				
				// create ReadRecord classes
				ReadRecordAddy ra = new ReadRecordAddy("swagstore","Yishai","Greatestever!19",user.getCustomerid());
				ReadRecordCustomer rc = new ReadRecordCustomer("swagstore","Yishai","Greatestever!19",user.getCustomerid());				
				ReadRecordOrder ro = new ReadRecordOrder("swagstore","Yishai","Greatestever!19",user.getCustomerid());
				
				// Use ReadRecords to get the data
				ra.doRead();
				rc.doRead();
				ro.doRead();
				
				//Save the ReadRecords as sessions
				session.setAttribute("custrec",rc);
				session.setAttribute("addyrec",ra);
				session.setAttribute("orderrec",ro);

				Address addy = ra.getaddress();
				Customer customer = rc.getCustomer();
				
				session.setAttribute("userorders", ro.getHTMLTable());
			    session.setAttribute("address", addy);
			    session.setAttribute("customer", customer);
			
				url="userview.jsp";
			}
			// user doesn't exist, redirect to previous page and show error
			else{
				String errorMessage = "Error: Unrecognized Username or Password<br>Login attempts remaining: "+(3-(loginAttempts));
				request.setAttribute("errorMessage", errorMessage);

				//track login attempts (combats: brute force attacks)
				session.setAttribute("loginAttempts", loginAttempts++);
				url = "index.jsp";
			}
		}
		//forward our request along
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * Logs the user out
	 */
	public void logout() {
		loggedin = false;
		session.invalidate();
	}
	
	/**
	 * Check to see if the user is logged in
	 */
	public void login(HttpServletRequest request, HttpServletResponse response) {
		session = request.getSession();
		loggedin = true;
	}
}
