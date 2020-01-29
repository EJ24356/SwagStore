/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Order;

/**
 * @author Eldell
 *
 */
public class ReadRecordOrder{
	
	private Connection connection;
	private ResultSet results;
	
	private Order order= new Order();
	private int customerid;
	
	public ReadRecordOrder(String dbName, String uname, String pwd, int customerid){
		
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
	
	public void doRead() {
		String query = "select * from orders where customerid = ?";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setInt(1, this.customerid);

			this.results=ps.executeQuery();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable() {
		
		String table ="";
		table += "<table border=3>";
		table +="<tr>";
		table +="<td>";
		table +=    "OrderID";
		table +="</td>";
		table +="<td>";
		table +=    "CustomerID";
		table +="</td>";
		table +="<td>";
		table +=    "OrderDate";
		table +="</td>";
		table +="<td>";
		table +=    "ShippingDate";
		table +="</td>";
		table +="<td>";
		table +=    "ShippingAddressID";
		table +="</td>";
		table +="</tr>";

		try {
			while(this.results.next()) {
				Order order = new Order();
				order.setOrderID((this.results.getInt("orderid")));
				order.setCustomerID((this.results.getInt("customerid")));
				order.setOrderdate(this.results.getDate("orderdate"));
				order.setShippingdate(this.results.getDate("shippingdate"));
				order.setShippingaddressID((this.results.getInt("shippingaddressid")));

				
				table +="<tr>";
				table +="<td>";
				table +=    order.getOrderID();
				table +="</td>";
				table +="<td>";
				table +=	order.getCustomerID();
				table +="</td>";
				table +="<td>";
				table +=	order.getOrderdate();
				table +="</td>";
				table +="<td>";
				table +=	order.getShippingdate();
				table +="</td>";
				table +="<td>";
				table +=	order.getShippingaddressID();
				table +="</td>";
				table +="</tr>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	

}

