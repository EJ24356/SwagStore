package model;

import java.util.Random;

public class Customer {
private int customerid;
private String name;
private String phonenumber;
private String email;


/**
 * @param customerid
 * @param name
 * @param phonenumber
 * @param email
 */
public Customer(int customerid, String name, String phonenumber, String email) {
	this.customerid = customerid;
	this.name = name;
	this.phonenumber = phonenumber;
	this.email = email;
}

public int randomCustomerID() {
	return new Random().nextInt(1000)+1;
}
/**
 * 
 */
public Customer() {
	// TODO Auto-generated constructor stub
	this.customerid = 9999;
	this.name = "Craig Piercy";
	this.phonenumber = "706-542-4630";
	this.email = "craig.piercy@gmail.com";
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
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the phonenumber
 */
public String getPhonenumber() {
	return phonenumber;
}
/**
 * @param phonenumber the phonenumber to set
 */
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", name=" + name + ", phonenumber=" + phonenumber + ", email=" + email
			+ "]";
}

}
