package com.zubair.bank;

public class Savings extends Accounts {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
	}

	@Override
	public double withdraw(double amount) throws BalanceException {
		if(amount > (balance - MIN_SAVINGS_BAL))
			throw new BalanceException("Insufficient balance!");
		
		balance -= amount;	
		return balance;
	}
}
