package controller;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.ReadCart;
import model.Cart;

/**
 * Servlet implementation class ViewCartServlet
 */
@WebServlet(description = "servlet to help user view the cart", urlPatterns = { "/viewcart" })
public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCartServlet() {
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
		Cart cart = (Cart) session.getAttribute("cart");
		ReadCart rc = new ReadCart(cart);
		rc.setNumform(new DecimalFormat("###,###.##"));
		session.setAttribute("table", rc.getTable());
		session.setAttribute("finalprice", 
				rc.getFinalprice());
		session.setAttribute("cart", cart);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/viewcart.jsp");
		dispatcher.forward(request, response);
	}

}
