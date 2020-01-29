package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.AddAddress;
import dbHelpers.AddCustomer;
import dbHelpers.RegistrationHelper;
import model.Account;
import model.Address;
import model.Customer;
import utilities.PasswordService;
/**
 * Servlet implementation class Register
 */
@WebServlet(description = "controls the addition of new accounts", urlPatterns = { "/register" })
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session; 
	private String url;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Customer
     String name = request.getParameter("name");
     int customerid = new Customer().randomCustomerID();
     String phonenumber = request.getParameter("phonenumber");
     String email = request.getParameter("email");
     Customer customer = new Customer(customerid, name, phonenumber, email);
     //Address
     int addressid = new Address().randomaddressid();
     String address = "Billing Address";
     String street = request.getParameter("street");
     String state = request.getParameter("state");
     String city = request.getParameter("city");
     String zipcode = request.getParameter("zipcode");
     String country = request.getParameter("country");
     Address addy = new Address(addressid,address,street,city,state,zipcode,country,customer);
     //Account
     String uname = request.getParameter("username");
     String pwd = request.getParameter("password");
     //encrypt the password to check against what's stored in DB
   		PasswordService pws = new PasswordService();
   		String encryptedPass = pws.encrypt(pwd);
     Account newaccount = new Account(uname,pwd,customer);
     
		
	/*Create a user helper class to make database calls, and call authenticate 
	 * user method for account
    */
			RegistrationHelper rh = new RegistrationHelper();
			rh.addUser(uname, encryptedPass, customerid);
     
  // set up addQuery objects for address and customer
	    AddAddress ad = new AddAddress("swagstore","Yishai","Greatestever!19");
	    AddCustomer cust = new AddCustomer("swagstore","Yishai","Greatestever!19");
	    
	 // pass the objects to addQueries to add to the database
   
	    cust.doAdd(customer);
		ad.doAdd(addy);
	    
	  //set attributes  
	    request.setAttribute("name", customer.getName());
	    request.setAttribute("email", customer.getEmail());
	    request.setAttribute("phonenumber", customer.getPhonenumber());
	    request.setAttribute("street", addy.getStreet());
        request.setAttribute("city", addy.getCity());
        request.setAttribute("state", addy.getState());
        request.setAttribute("zipcode", addy.getZipcode());
        request.setAttribute("country", addy.getCountry());
        request.setAttribute("username", newaccount.getUname());
        request.setAttribute("password", newaccount.getPwd());

     // pass execution control to the New Account Info jsp
	    url = "/newaccountinfo.jsp";
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	    
	}//doPost
	
	/**
	 * Logs the user out
	 */
	public void logout() {
		session.invalidate();
	}

}
