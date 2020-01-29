package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Category;

public class ReadCategory {
	private Connection connection;
	private ResultSet results;
	
	public ReadCategory(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		//set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("An error occurred while connecting MySQL database");
			e.printStackTrace();
		}	
	}
	
	public void doRead() {
		String query = "select * from category";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results=ps.executeQuery();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable() {
		String table ="";
		table += "<table border=3>";
		
		try {
			while(this.results.next()) {
				Category cat = new Category();
				cat.setCategoryID((this.results.getInt("categoryid")));
				cat.setCategoryname(this.results.getString("categoryname"));
				cat.setDescription((this.results.getString("description")));
				
				table +="<tr>";
				table +="<td>";
				table +=    cat.getCategoryID();
				table +="</td>";
				table +="<td>";
				table +=	cat.getCategoryname();
				table +="</td>";
				table +="<td>";
				table +=	cat.getDescription();
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
	
}
