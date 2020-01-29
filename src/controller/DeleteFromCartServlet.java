package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cart;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet(description = "Delete a record for a particular product", urlPatterns = { "/delete" })
public class DeleteFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFromCartServlet() {
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
		session=request.getSession();
		//get the prodid
		int prodid = Integer.parseInt(request.getParameter("productID"));
		int index = 0; //index of the product[within the ArrayList]
		boolean loop = true;
		Cart cart = (Cart) session.getAttribute("cart");
		 do{
			if(cart.getProds().get(index).getProductID()==prodid) {
				cart.deleteprod(index);
				loop = false;
			}
			else
				index++;
		}while (index < cart.getProds().size() && loop==true);
		
		 session.setAttribute("cart", cart);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewcart");
		dispatcher.forward(request, response);
		
		
	}

}
