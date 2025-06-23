package com.zubair.test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zubair.dao.PaymentDao;
import com.zubair.entity.Payment;

public class TestPaymentDao {
	private static PaymentDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new PaymentDao();
	}
	
	@Test
	public void testSave() {
		Payment p = new Payment("PhonePay", LocalDate.of(2025, 05, 12), 150);
		assertTrue(dao.save(p, 123));
	}
}
