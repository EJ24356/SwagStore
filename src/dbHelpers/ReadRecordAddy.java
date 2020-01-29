/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Address;

/**
 * @author Eldell
 *
 */
public class ReadRecordAddy{
	
	private Connection connection;
	private ResultSet results;
	
	private Address addy = new Address();
	private int customerid;
	
	public ReadRecordAddy(String dbName, String uname, String pwd, int customerid){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.customerid = customerid;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRead(){
		String query = "select * from address where customerid = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.customerid);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			addy.setAddressID(this.results.getInt("AddressID"));
			addy.setAddytype(this.results.getString("AddressType"));
			addy.setStreet(this.results.getString("Street"));
			addy.setCity(this.results.getString("City"));
			addy.setState(this.results.getString("State"));
			addy.setZipcode(this.results.getString("Zipcode"));
			addy.setCountry(this.results.getString("Country"));
			addy.setCustomerID(this.results.getInt("CustomerID"));
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Address getaddress(){
		return this.addy;
	}
	
	

}

