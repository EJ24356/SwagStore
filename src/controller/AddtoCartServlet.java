package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Products;
import model.Cart;

/**
 * Servlet implementation class UpdateGroceryStoreServlet
 */
@WebServlet(description = "Controller which starts the actual item add to the cart", 
		urlPatterns = { "/add2cart" })
public class AddtoCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HttpSession session;   
    private String message;
    private Cart cart;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtoCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		// get the form data and set up a Product object
		Products product = (Products) session.getAttribute("product");
		
		int itemnumber = Integer.parseInt(request.getParameter("itemnum"));
		
		if (product.getQuaninstock()<itemnumber) 
			message = "Not enough in stock. Select a lower number of items";

		else if (product.getQuaninstock() == 0) 
			message = "Out of stock! Choose a different item";

		else {
			cart = (Cart) session.getAttribute("cart");
			cart.addprod(product);
			cart.addqty(itemnumber);
			session.setAttribute("cart",cart);
		}
		
		session.setAttribute("message", message);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/browse");
		dispatcher.forward(request, response);
		
	}

}
