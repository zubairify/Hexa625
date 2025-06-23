package com.zubair.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zubair.entity.Customer;
import com.zubair.entity.Payment;

public class PaymentDao {
	private EntityManagerFactory factory;
	
	public PaymentDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public boolean save(Payment p, int custId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Customer c = em.find(Customer.class, custId);
		p.setCust(c);
		em.persist(p);
		txn.commit();
		return true;
	}
	
}
