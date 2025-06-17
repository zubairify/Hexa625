package com.zubair.bank;

public final class AccountsFactory {
	
	private AccountsFactory() {
	}

	public static Bank openSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public static Bank openCurrentAccount(String holder) {
		return new Current(holder);
	}
}
