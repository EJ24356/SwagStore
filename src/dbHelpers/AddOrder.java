package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import model.Order;

public class AddOrder {
public Connection connection;
public ResultSet results;
public Order order = new Order();
	
	public AddOrder(String dbName, String uname, String pwd){
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
	
	public void doAdd(Order order){
		String query = "insert into orders (CustomerID, OrderDate, ShippingDate, ShippingAddressID) "
				+ "values (?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
				
			ps.setInt(1, order.getCustomerID());
			ps.setDate(2, Date.valueOf(order.getOrderdate()));
			ps.setDate(3, Date.valueOf(order.getShippingdate()));
			ps.setInt(4, order.getShippingaddressID());
			
	
			ps.executeUpdate();		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//doAdd
	
	public Order getOrder() {
		return this.order;
	}
	

}
