package com.zubair.bank;

public class Current extends Accounts {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public double deposit(double amount) {
		// Logic for deposit
		overdraft += amount;
		if(overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
		}
		return balance;
	}

	@Override
	public double withdraw(double amount) throws BalanceException {
		// Logic for withdraw 
		if(amount > (balance + overdraft))
			throw new BalanceException("Insufficient balance!");
		
		balance -= amount;
		if(balance < MIN_CURRENT_BAL) {
			overdraft += balance;
			balance = MIN_CURRENT_BAL;
		}	
		return balance;
	}
}
