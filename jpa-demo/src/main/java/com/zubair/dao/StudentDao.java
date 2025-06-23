package com.zubair.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zubair.entity.Student;

public class StudentDao {
	private EntityManagerFactory factory;
	
	public StudentDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public boolean save(Student s) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			em.persist(s);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		} finally {
			em.close();
		}
	}
	
	public Student find(int rollNo) {
		EntityManager em = factory.createEntityManager();
		try {
			return em.find(Student.class, rollNo);
		} finally {
			em.close();
		}
	}
}
