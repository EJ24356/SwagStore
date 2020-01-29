package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Address;

public class AddAddress {
public Connection connection;
	
	public AddAddress(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAdd(Address addy){
		String query = "insert into address (AddressID, AddressType, Street, City, State, ZipCode, Country, CustomerID) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
				
			ps.setInt(1, addy.getAddressID());
			ps.setString(2, addy.getAddytype());
			ps.setString(3, addy.getStreet());
			ps.setString(4, addy.getCity());
			ps.setString(5, addy.getState());
			ps.setString(6, addy.getZipcode());
			ps.setString(7, addy.getCountry());
			ps.setInt(8, addy.getCustomer().getCustomerid());
	
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
