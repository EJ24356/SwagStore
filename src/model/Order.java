package model;
import java.sql.Date;
import java.time.LocalDate;

public class Order {
	private int orderID;
	private int customerID;
	private LocalDate orderdate;
	private LocalDate shippingdate;
	private int shippingaddressID;
	
	public Order() {
		//create current date
		orderdate = LocalDate.now();
		//Increment by 3 days (for 3 days shipping)
		shippingdate = LocalDate.now().plusDays(3);
	}
	public Order(int customerID, int shippingaddressID) {
		this.customerID = customerID;
		this.shippingaddressID = shippingaddressID;
	}//Order

	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the orderdate
	 */
	public LocalDate getOrderdate() {
		return orderdate;
	}

	/**
	 * @param orderdate the orderdate to set
	 */
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	/**
	 * @return the shippingdate
	 */
	public LocalDate getShippingdate() {
		return shippingdate;
	}

	/**
	 * @param shippingdate the shippingdate to set
	 */
	public void setShippingdate(LocalDate shippingdate) {
		this.shippingdate = shippingdate;
	}

	/**
	 * @return the shippingaddressID
	 */
	public int getShippingaddressID() {
		return shippingaddressID;
	}

	/**
	 * @param shippingaddressID the shippingaddressID to set
	 */
	public void setShippingaddressID(int shippingaddressID) {
		this.shippingaddressID = shippingaddressID;
	}
	public void setOrderdate(Date date) {
		this.orderdate = date.toLocalDate();	
	}
	public void setShippingdate(Date date) {
		this.shippingdate = date.toLocalDate();
	}
	
}//Order
