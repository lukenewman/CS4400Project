import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
	Connection connection;
	private static DatabaseConnection instance = null;

	private DatabaseConnection() {
		connection = null;
		setupConnection();
	}

	public static DatabaseConnection sharedConnection() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}

	public void setupConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_58", "cs4400_58", "cB02pSbP");
			if (!connection.isClosed())
				System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
		}
	}

	public ResultSet executeQuery(String sqlQuery) {
		Statement stmt = null;

		try {
			stmt = connection.createStatement();
			return stmt.executeQuery(sqlQuery);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return null;
		}
	}

	public List<User> getUsers() {
		ResultSet rs = this.executeQuery("SELECT * FROM User");
		
		List<User> users = new ArrayList<User>();
		try {
			while (rs.next()) {
				User newUser = new User();
				newUser.setUsername(rs.getString("Username"));
				newUser.setEmailAddress(rs.getString("Email_Address"));
				newUser.setPassword(rs.getString("Password"));
				newUser.setUserType(rs.getString("User_Type"));
				users.add(newUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}
}
