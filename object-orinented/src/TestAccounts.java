
public class TestAccounts {

	public static void main(String[] args) {
		
		Bank c1 = new Current("Jammy");
		
		c1.summary();
		
		c1.withdraw(3000);
		c1.withdraw(6000);
		
		c1.summary();
		
		c1.deposit(2000);
		c1.deposit(5000);
		
		c1.summary();
	}
}
