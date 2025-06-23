package com.zubair.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zubair.dao.EmpDeptDao;
import com.zubair.entity.Department;
import com.zubair.entity.Employee;

public class TestEmpDeptDao {
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testSaveDept() {
		Department d = new Department(10, "Sales");
		assertTrue(dao.saveDept(d));
	}
	
	@Test
	public void testSaveEmp() {
		Employee e = new Employee("Paul", 2200);
		assertTrue(dao.saveEmp(e, 10));
	}
	
	@Test
	public void testDelDept() {
		assertTrue(dao.delDept(10));
	}
	
	@Test
	public void testFindEmp() {
		Employee e = dao.findEmp(5);
		assertNotNull(e);
		System.out.println(e.getEmpName());
		Department d = e.getDept();
		System.out.println(d.getDeptName());
	}
	
	@Test
	public void testFindDept() {
		Department d = dao.findDept(10);
		assertNotNull(d);
		System.out.println(d.getDeptName());
		List<Employee> emps = d.getEmps();
		System.out.println(emps.size());
	}
}
