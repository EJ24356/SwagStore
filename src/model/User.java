package model;
/**
 * Java representation of the User table in the database
 * @author Eldel
 *
 */
public class User {

	private int id;
	private String username;
	private String password;
	private int customerid;
	private Cart cart;
	
	/**
	 * Constructor
	 * @param id  the unique user ID
	 * @param username  the unique user's username
	 * @param password	the password associated with the account
	 */
	public User(String username, String password, int customerid) {
		this.username = username;
		this.password = password;
		this.customerid = customerid;
	}

	/**
	 * Return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set a new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set a new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Return the user's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set a new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the customerid
	 */
	public int getCustomerid() {
		return customerid;
	}

	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
}
