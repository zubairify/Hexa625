package com.zubair.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zubair.dao.CustomerDao;
import com.zubair.entity.Customer;
import com.zubair.entity.Payment;

public class TestCustomerDao {
	private CustomerDao dao;
	
	@BeforeEach
	public void init() {
		dao = new CustomerDao();
	}
	
	@Test
	public void testSave() {
		Customer c = new Customer(234, "Mike", "98773943");
		assertTrue(dao.save(c));
	}
	
	@Test
	public void testFind() {
		Customer c = dao.find(123);
		assertNotNull(c);
		System.out.println(c.getCustName());
		Set<Payment> payments = c.getPayments();
		payments.forEach(System.out::println);
	}
	
	@Test
	public void testList() {
		List<Customer> list = dao.list();
		assertEquals(1, list.size());
	}
}
