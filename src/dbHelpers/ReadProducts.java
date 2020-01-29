package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Products;

public class ReadProducts {
	private Connection connection;
	private ResultSet results;
	
	public ReadProducts(String dbName, String uname, String pwd) {
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
		String query = "select * from products";
		
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
		table +="<tr>";
		table +="<td>";
		table +=    "ProductID";
		table +="</td>";
		table +="<td>";
		table +=    "ProductName";
		table +="</td>";
		table +="<td>";
		table +=    "ProductType";
		table +="</td>";
		table +="<td>";
		table +=    "Standard Unit Price";
		table +="</td>";
		table +="<td>";
		table +=    "Quantity in Stock";
		table +="</td>";
		table +="<td>";
		table +=    "CategoryID";
		table +="</td>";
		table +="<td>";
		table +=    "Picture";
		table +="</td>";
		table +="</tr>";
		int num = 1;
		try {
			while(this.results.next()) {
				Products prod = new Products();
				prod.setProductID((this.results.getInt("productid")));
				prod.setName(this.results.getString("name"));
				prod.setType((this.results.getString("type")));
				prod.setPrice((this.results.getDouble("standardunitprice")));
				prod.setQuaninstock((this.results.getInt("quantityinstock")));
				prod.setCategoryID((this.results.getInt("categoryid")));
				
				table +="<tr>";
				table +="<td>";
				table +=    prod.getProductID();
				table +="</td>";
				table +="<td>";
				table +=	prod.getName();
				table +="</td>";
				table +="<td>";
				table +=	prod.getType();
				table +="</td>";
				table +="<td>";
				table +=	prod.getPrice();
				table +="</td>";
				table +="<td>";
				table +=	prod.getQuaninstock();
				table +="</td>";
				table +="<td>";
				table +=	prod.getCategoryID();
				table +="</td>";
				table +="<td>";
				table +="<img src=\"images/item"+num+".jpg\" alt=\"item\" width=\"80\">";
				num++;
				table +="</td>";
				table +="<td>";
				table += "<a href=addtocart?productID="+prod.getProductID()+
						">Add To Cart</a>";
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

