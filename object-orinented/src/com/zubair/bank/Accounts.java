package com.zubair.bank;

public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int generator = INIT_ACNT_NO;
	
	public Accounts() {
	}

	public Accounts(String holder, double balance) {
		this.acntNo = generator ++;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}
	
	// BL Methods
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public abstract double withdraw(double amount) throws BalanceException;
}
