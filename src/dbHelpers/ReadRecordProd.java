/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Products;

/**
 * @author Eldell
 *
 */
public class ReadRecordProd {
	
	private Connection connection;
	private ResultSet results;
	
	private Products prod = new Products();
	private int prodid;
	
	public ReadRecordProd(String dbName, String uname, String pwd, int prodid){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.prodid = prodid;
		
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
		String query = "select * from products where productid = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.prodid);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			prod.setCategoryID(this.results.getInt("categoryID"));
			prod.setName(this.results.getString("name"));
			prod.setType(this.results.getString("type"));
			prod.setPrice(this.results.getDouble("standardunitprice"));
			prod.setQuaninstock(this.results.getInt("quantityinstock"));
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Products getProducts(){
		return this.prod;
	}
	
	

}
