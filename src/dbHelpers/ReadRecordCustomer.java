/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;

/**
 * @author Eldell
 *
 */
public class ReadRecordCustomer{
	
	private Connection connection;
	private ResultSet results;
	
	private Customer customer = new Customer();
	private int customerid;
	
	public ReadRecordCustomer(String dbName, String uname, String pwd, int customerid){
		
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
		String query = "select * from customer where customerid = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.customerid);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			customer.setCustomerid(this.results.getInt("CustomerID"));
			customer.setName(this.results.getString("Name"));
			customer.setPhonenumber(this.results.getString("PhoneNumber"));
			customer.setEmail(this.results.getString("Email"));
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	

}

