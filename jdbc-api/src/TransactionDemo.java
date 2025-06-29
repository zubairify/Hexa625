import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String sql1 = "insert into person values ('Glen', 22, 'Goa')";
		String sql2 = "update person set age=22 where name='Polo'";
		String sql3 = "delete from person where name='Mili'";
		
		Connection conn = null;
		try {
			conn = JdbcFactory.getConnection();
			conn.setAutoCommit(false);	// Setting auto-commit to false
			
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();	// Executing batch of queries 
			conn.commit();	// Committing the changes permanently
			System.out.println("Transaction successfully completed.");
		} catch (SQLException e) {
			System.out.println("Transaction failed due to...");
			System.out.println(e);
			try {
				conn.rollback();	// undo changes on exception
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
