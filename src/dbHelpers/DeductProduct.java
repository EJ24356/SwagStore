package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Eldel
 *
 */
public class DeductProduct {
	private Connection connection;
	
	public DeductProduct(String dbName, String uname, String pwd) {
		
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				this.connection = DriverManager.getConnection(url, uname, pwd);
			} catch (InstantiationException | IllegalAccessException | 
					ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}
	
	public void doDeduct(int quaninstock,int productid) {
		// set up a String to hold our query
		String query = "update products set quantityInStock=? where productid=?";
		// create a preparedstatement using our query string
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			// fill in the preparedstatement
			ps.setInt(1, quaninstock);
			ps.setInt(2, productid);
			
			//execute the query
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
