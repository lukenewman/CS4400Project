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
			connection = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_58", "cs4400_58",
					"cB02pSbP");
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
	
	public boolean executeInsert(String sqlStatement) {
		Statement stmt = null;

		try {
			stmt = connection.createStatement();
			stmt.execute(sqlStatement);
			return true;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
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

	public String login(String username, String password) {
		ResultSet rs = this.executeQuery("SELECT Username,Password,User_type FROM User WHERE Username = '" + username
				+ "' AND Password = '" + password + "'");

		try {
			while (rs.next()) {
				System.out.println("user type: " + rs.getString("User_Type"));
				return rs.getString("User_Type");
			}
			return "ERROR";
		} catch (SQLException e) {
			e.printStackTrace();
			return "ERROR";
		}
	}

	public List<String> getUserTypes() {
		ResultSet rs = this.executeQuery("SELECT DISTINCT User_Type FROM User WHERE User_Type != 'Admin'");
		printResultSet(rs);

		List<String> userTypes = new ArrayList<String>();
		try {
			while (rs.next()) {
				userTypes.add(new String(rs.getString("User_Type")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("user types: " + userTypes);
		return userTypes;
	}

	public boolean registerUser(User newUser) {
		return this.executeInsert("INSERT INTO User Values('" + newUser.getUsername() + "', '"
				+ newUser.getEmailAddress() + "', '" + newUser.getPassword() + "', '" + newUser.getUserType() + "')");
	}

	public void fig_3(String Name, String DateRecorded, String DataValue, String DataType, String Accepted) {
		this.executeQuery("SELECT Name FROM POI");
		this.executeQuery("SELECT * FROM DataType");
		this.executeQuery("INSERT INTO DataPoint VALUES(" + Name +"," + DateRecorded+"," +DataValue+"," + DataType+"," + Accepted +")");
	}

	public void fig_4(String name, String Flag, String DateFlagged, String Zipcode, String City, String State) {
		this.executeQuery("SELECT * FROM City_State");
		this.executeQuery("INSERT INTO POI VALUES( " + name + "," + Flag +"," + DateFlagged +"," + Zipcode +"," + City +"," + State +")");
	}

	public void fig_6(String accepted, String name) {
		this.executeQuery("SELECT * FROM DataPoint WHERE Accepted IS NULL");
		this.executeQuery("UPDATE DataPoint SET Accepted =" + accepted + " WHERE Name = " + name);
	}

	
	public void fig_7(String accepted, String uname) {
		String first = "UPDATE City_Official SET Accepted = " + accepted + " WHERE Username = " + uname;
		this.executeQuery("SELECT * FROM City_Official WHERE Accepted IS NULL");
		this.executeQuery(first);
	}

	public void fig_9(String name, String city, String state, String zip, String flagged, String low, String high) {
		String first = "SELECT * FROM POI WHERE Name = " + name + " AND City = " + city + " AND State = " + state
				+ " AND ZipCode = " + zip + " AND Flagged = " + flagged + " AND DateFlagged BETWEEN " + low + " AND "
				+ high;
		this.executeQuery("SELECT Name FROM POI");
		this.executeQuery("SELECT * FROM City_State");
		this.executeQuery(first);
	}

	public void printResultSet(ResultSet rs) {
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(columnValue + " " + rsmd.getColumnName(i));
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
