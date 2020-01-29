package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.ReadProducts;
import model.User;

/**
 * Servlet implementation class ReadProducts
 */
@WebServlet("/browse")
public class ReadProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private User user;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  session = request.getSession(false);
			if(session != null) {
				user = (User) session.getAttribute("user");
			if (user != null)
				doPost(request, response);
			else
				request.getRequestDispatcher("login.jsp").forward(request, response);
		}//ifelse

	}//doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReadProducts rp = new ReadProducts("swagstore","Yishai","Greatestever!19");
		
		// Get the table from the ReadQuery object
		rp.doRead();
		String table = rp.getHTMLTable();
		
		//pass execution control to read.jsp along with the table
		request.setAttribute("table", table);
	
		String url = "/browse.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
