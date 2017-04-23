import java.sql.*;

public class DatabaseConnection {
	Connection connection;
	private static DatabaseConnection instance = null;
	
	private DatabaseConnection() {
		connection = null;
		setupConnection();
	}
	
	public static DatabaseConnection sharedConnection()  {
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
		ResultSet rs = null;

		try {
		    stmt = connection.createStatement();
		    rs = stmt.executeQuery(sqlQuery);

		    // or alternatively, if you don't know ahead of time that
		    // the query will be a SELECT...

//		    if (stmt.execute("SELECT foo FROM bar")) {
//		        rs = stmt.getResultSet();
//		    }

		    // Now do something with the ResultSet ....
		    ResultSetMetaData rsmd = rs.getMetaData();
		    int columnsNumber = rsmd.getColumnCount();
		    while (rs.next()) {
		        for (int i = 1; i <= columnsNumber; i++) {
		            if (i > 1) System.out.print(",  ");
		            String columnValue = rs.getString(i);
		            System.out.print(columnValue + " " + rsmd.getColumnName(i));
		        }
		        System.out.println("");
		    }
		    
		    return rs;
		}
		catch (SQLException ex){
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    return null;
		}
		finally {
		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException sqlEx) { } // ignore

		        rs = null;
		    }

		    if (stmt != null) {
		        try {
		            stmt.close();
		        } catch (SQLException sqlEx) { } // ignore

		        stmt = null;
		    }
		}
	}
}
