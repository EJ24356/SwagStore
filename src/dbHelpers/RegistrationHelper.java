package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class is used to insert, retrieve, and update users in the user table.
 */
public class RegistrationHelper {
	
	/**
	 * Prepared SQL statement (combats: SQL Injections)
	 */
	private PreparedStatement addUserStatement;
	private Connection conn;
	
	/**
	 * Constructor which makes a connection
	 */
	public RegistrationHelper() {
		try {
			//Set up connection
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/swagstore", "Yishai", 
					"Greatestever!19");
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
	
	/**
	 * Authenticates a user in the database.
	 * @param username  The username for the user.
	 * @param password  The password for the user.
	 * @return A user object if successful, null if unsuccessful.
	 */
	public void addUser(String username, String password, int customerID) {
		try {
			//Create the preparedstatement(s)
			addUserStatement = conn.prepareStatement("INSERT INTO `swagstore`.`account` "
					+ "(`username`, `password`, `customerID`) "
					+ "VALUES (?, ?, ?);");
			//Add parameters to the ?'s in the preparedstatement and execute
			addUserStatement.setString(1, username);
			addUserStatement.setString(2, password);
			addUserStatement.setInt(3, customerID);
			addUserStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}

	}
}
