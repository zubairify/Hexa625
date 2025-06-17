import com.zubair.bank.AccountsFactory;
import com.zubair.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		
		Bank s1 = AccountsFactory.openSavingsAccount("Jim");
		s1.summary();
		
		Bank c1 = AccountsFactory.openCurrentAccount("Jack");
		c1.summary();
		
	}
}
