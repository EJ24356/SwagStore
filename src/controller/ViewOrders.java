package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.ReadRecordAddy;
import dbHelpers.ReadRecordCustomer;
import dbHelpers.ReadRecordOrder;
import model.Address;
import model.Customer;

/**
 * Servlet implementation class ViewOrders
 */
@WebServlet(description = "A servlet to have the user see their previous orders", urlPatterns = { "/vieworders" })
public class ViewOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewOrders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		
		ReadRecordCustomer rc= (ReadRecordCustomer) session.getAttribute("custrec");
		ReadRecordAddy ra = (ReadRecordAddy) session.getAttribute("addyrec");
		ReadRecordOrder ro = (ReadRecordOrder) session.getAttribute("orderrec");
		
		// Use ReadRecords to get the data
		ra.doRead();
		rc.doRead();
		ro.doRead();
		
		Address addy = ra.getaddress();
		Customer customer = rc.getCustomer();
		
		session.setAttribute("userorders", ro.getHTMLTable());
	    session.setAttribute("address", addy);
	    session.setAttribute("customer", customer);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/userorders.jsp");
		dispatcher.forward(request, response);
	}

}
