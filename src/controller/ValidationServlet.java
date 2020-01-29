package controller;

import utilities.Validator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */

	@WebServlet("/validate")
	
	public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get input and validate
		String msg = "";
		String url = "/register";
		// username <= 8 characters
		String userName = request.getParameter("username");
		if (!Validator.isName(userName)){
			msg += "The name has not been entered.<br />";
			url = "/registration.jsp";
		} else if (!Validator.isShortName(userName)){
			msg += "The name should be no greater than 8 characters.<br />";
			url = "/registration.jsp";
		} else {
		    request.setAttribute("username", userName);
		}
		
		// email
		String email = request.getParameter("email");
		if (!Validator.isEmail(email)){
			msg += "The email is not entered correctly.<br />";
			url = "/registration.jsp";
		} else {
		    request.setAttribute("email", email);
		}
	
		// phone
		String phone = request.getParameter("phonenumber");
		if (!Validator.isPhone(phone)){
			msg += "The phone is not entered correctly.<br />";
			url = "/registration.jsp";
		} else {
		    request.setAttribute("phone", phone);
		}
		
		
		request.setAttribute("msg", msg);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
