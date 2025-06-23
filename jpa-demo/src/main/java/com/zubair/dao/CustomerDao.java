package com.zubair.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zubair.entity.Customer;

public class CustomerDao {
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = factory.createEntityManager();
		return em;
	}
	
	public boolean save(Customer c) {
		EntityManager em = getEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			em.persist(c);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		}
	}
	
	public Customer find(int custId) {
		EntityManager em = getEntityManager();
		return em.find(Customer.class, custId);
	}
	
	public List<Customer> list() {
		EntityManager em = getEntityManager();
		return em.createQuery("FROM Customer").getResultList();
	}
	
	public boolean delete(int custId) {
		EntityManager em = getEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			Customer c = find(custId);
			em.remove(c);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		}
	}
}





