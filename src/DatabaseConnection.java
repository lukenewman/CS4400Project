import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static void main(String args[]) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://academicmysql.cc.gatech.edu/cs4400_58",
					"cs4400_58", "cB02pSbP");
			if (!con.isClosed())
				System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}
}
