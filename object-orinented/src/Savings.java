
public class Savings extends Accounts {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
	}

	@Override
	public double withdraw(double amount) {
		if(amount < (balance - MIN_SAVINGS_BAL))
			balance -= amount;
		else
			System.out.println("Insufficient balance!");
		return balance;
	}
}
