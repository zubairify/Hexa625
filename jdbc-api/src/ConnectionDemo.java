import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/training";
		
		// Registering driver with Driver manger
//		DriverManager.registerDriver(new Driver());
		// OR
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Requesting connection to Driver manager
		Connection conn = DriverManager.getConnection(url, "zubair", "oracle");
		System.out.println("Connected successfully...");
		
	}
}
