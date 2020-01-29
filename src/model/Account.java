package model;

public class Account {
	
	private int accountID;
	private String uname;
	private String pwd;
	private Customer customer;
	
	/**
	 * @return the accountID
	 */
	public int getAccountID() {
		return accountID;
	}


	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	/**
	 * @param accountID
	 * @param customer
	 * @param uname
	 * @param pwd
	 * @param pmtmethod
	 */
	public Account(String uname, String pwd, Customer customer) {
		this.uname = uname;
		this.pwd = pwd;
		this.customer =  customer;
	}
	

	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}


	/**
	 * @param customerID the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
}
