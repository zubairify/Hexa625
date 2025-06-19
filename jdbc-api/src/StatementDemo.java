import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		
		String sql = "insert into person values ('Jack', 19, 'Jaipur')";
		
		try {
			// Requesting JdbcFactory for connection object
			Connection conn = JdbcFactory.getConnection();
			// Creating statement to perform insert query with hardcoded/fixed values
			Statement stmt = conn.createStatement();
			// Executing DML operation
			stmt.executeUpdate(sql);
			System.out.println("Record inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
