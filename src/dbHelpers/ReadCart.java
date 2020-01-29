package dbHelpers;

import model.Cart;
import java.text.DecimalFormat;

public class ReadCart {
    private Cart cart;
    private String table = "";
    private double finalprice = 0.00;
    private DecimalFormat numform;
    
    public ReadCart(Cart shopcart) {
    	this.cart = shopcart;
    	this.numform = new DecimalFormat("###,###.##");
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
    	
    	for(int i = 0; i < this.cart.getProds().size(); i++) {
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
    		table +="<td>";
    		table += "<a href=delete?productID="+cart.getProds().get(i).getProductID()+
					">Delete From Cart</a>";
    		table += "</td>";
    		table += "</tr>";
    		this.finalprice += cart.getProds().get(i).getPrice()*cart.getQtynum().get(i);
    	}
    	numform.format(this.finalprice);
    	table += "</table>";
    	
    }
	
    public String getTable() {
    	return table;
    }

	/**
	 * @param table the table to set
	 */
	public void setTable(String table) {
		this.table = table;
	}

	/**
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/**
	 * @return the finalprice
	 */
	public double getFinalprice() {
		return finalprice;
	}

	/**
	 * @param finalprice the finalprice to set
	 */
	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}

	/**
	 * @return the numform
	 */
	public DecimalFormat getNumform() {
		return numform;
	}

	/**
	 * @param numform the numform to set
	 */
	public void setNumform(DecimalFormat numform) {
		this.numform = numform;
	}
	
}
