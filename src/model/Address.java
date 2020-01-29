/**
 * A User's Address
 */

package model;

import java.util.Random;

public class Address {
	
private int addressID;
private int customerID;
private String addytype;
private String street;
private String city;
private String state;
private String zipcode;
private String country;
private Customer customer;


/**
 * @param addressID
 * @param addytype
 * @param street
 * @param zipcode
 * @param country
 */


public Address(int addressID, String addytype, String street, String city,
		String state, String zipcode, String country, Customer customer) {
	this.addressID = addressID;
	this.addytype = addytype;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.country = country;
	this.customer = customer;
}



/**
 * 
 */

public Address() {}


public int randomaddressid() {
	return new Random().nextInt(4000)+4000;
}


/**
 * @return the addressID
 */
public int getAddressID() {
	return addressID;
}
/**
 * @param addressID the addressID to set
 */
public void setAddressID(int addressID) {
	this.addressID = addressID;
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
 * @return the addytype
 */
public String getAddytype() {
	return addytype;
}
/**
 * @param addytype the addytype to set
 */
public void setAddytype(String addytype) {
	this.addytype = addytype;
}
/**
 * @return the street
 */
public String getStreet() {
	return street;
}
/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}



/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}



/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}

/**
 * @return the zipcode
 */
public String getZipcode() {
	return zipcode;
}
/**
 * @param zipcode the zipcode to set
 */
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
/**
 * @return the customer
 */
public Customer getCustomer() {
	return customer;
}



/**
 * @param customer the customer to set
 */
public void setCustomer(Customer customer) {
	this.customer = customer;
}



@Override
public String toString() {
	return "Address [addressID=" + addressID + ", addytype=" + addytype + ", street=" + street + ", zipcode=" + zipcode
			+ ", country=" + country + "]";
}



}
