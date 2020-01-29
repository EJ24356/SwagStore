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

import dbHelpers.AddOrder;
import dbHelpers.DeductProduct;
import model.Order;
import model.User;
import model.Address;
import model.Cart;

/**
 * Servlet implementation class ViewPurchaseServlet
 */
@WebServlet(description = "When the user purchases an item, this servlet controls how it is added to the DB", 
	urlPatterns = { "/purchase" })
public class ViewPurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewPurchaseServlet() {
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
		Order order = new Order();
		//basically add the objects from the sessions for the Order dbHelper
		
		User user = (User) session.getAttribute("user");
		Address addy = (Address) session.getAttribute("address");
		
		order.setCustomerID(user.getCustomerid());
		order.setShippingaddressID(addy.getAddressID());
		
		//for the DB
		AddOrder ao = new AddOrder("swagstore","Yishai","Greatestever!19");
	    ao.doAdd(order); //record the purchase
	    
	    order.setOrderID(ao.getOrder().getOrderID());
		
		user.setCart((Cart)session.getAttribute("cart"));
		
		
		
        Cart cart = (Cart) session.getAttribute("cart");
     
        String table = "";
        double finalprice = 0.00;
    	DecimalFormat numform = new DecimalFormat("###,###.##");
    	table += "<table border=3>";
    	table += "<tr>";
		table += "<td>";
		table += "Product Name";
		table += "</td>";
		table += "<td>";
		table += "Qty";
		table += "</td>";
		table += "<td>";
		table += "Price";
		table += "</td>";
		table += "</tr>";
    	
    	for(int i = 0; i < cart.getProds().size(); i++) {
    		table +="<tr>";
    		table +="<td>";
    		table += cart.getProds().get(i).getName();
    		table += "</td>";
    		table +="<td>";
    		table += cart.getQtynum().get(i);
    		table += "</td>";
    		table +="<td>";
    		table += numform.format(cart.getProds().get(i).getPrice()*cart.getQtynum().get(i));
    		table += "</td>";
    		table += "</tr>";
    		finalprice += cart.getProds().get(i).getPrice()*cart.getQtynum().get(i);
    		DeductProduct dp = new DeductProduct("swagstore","Yishai","Greatestever!19");
    		dp.doDeduct(cart.getProds().get(i).getQuaninstock()-cart.getQtynum().get(i), 
    				cart.getProds().get(i).getProductID());
    		//quantity in stock - number of items user wanted, the productID
    	}
    	numform.format(finalprice);
    	table += "</table>";
    	
    	session.setAttribute("table", table);
    	session.setAttribute("user", user);
    	session.setAttribute("addy", addy);   
    	session.setAttribute("order", order);
    	
    
    	
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/vieworder.jsp");
		dispatcher.forward(request, response);
	    
	}//doPost

}//ViewPurchaseServlet
