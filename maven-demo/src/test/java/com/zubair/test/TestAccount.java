package com.zubair.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.zubair.pojo.Account;
import com.zubair.pojo.BalanceException;

public class TestAccount {
	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt = new Account(1000);
	}
	
	@Disabled
	@Test
	public void testDeposit() {
		assertEquals(2000, acnt.deposit(1000));
	}
	
	@Test
	public void testNegativeDeposit() {
		assertThrows(NumberFormatException.class, () -> acnt.deposit(-100));
	}
	
	@Test
	public void testWithdraw() throws BalanceException {
		assertEquals(500, acnt.withdraw(500));
	}
	
	@Test
	public void testNegativeWithdraw() {
		assertThrows(NumberFormatException.class, () -> acnt.withdraw(-200));
	}
	
	@Test
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class, () -> acnt.withdraw(2000));
	}
}




