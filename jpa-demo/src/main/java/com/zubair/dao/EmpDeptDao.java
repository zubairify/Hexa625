package com.zubair.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zubair.entity.Department;
import com.zubair.entity.Employee;

public class EmpDeptDao {
	private EntityManagerFactory factory;
	
	public EmpDeptDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public boolean saveDept(Department d) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(d);
		txn.commit();
		return true;
	}
	
	public boolean saveEmp(Employee e, int deptNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Department d = em.find(Department.class, deptNo);
		e.setDept(d);
		em.persist(e);
		txn.commit();
		return true;
	}
	
	public boolean delDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			Department d = em.find(Department.class, deptNo);
			em.remove(d);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		}
	}
	
	public Employee findEmp(int empNo) {
		EntityManager em = factory.createEntityManager();
		Employee e = em.find(Employee.class, empNo);
		return e;
	}
	
	public Department findDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Department.class, deptNo);
	}
}

