package com.zubair.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zubair.dao.StudentDao;
import com.zubair.entity.Student;

public class TestStudentDao {
	private static StudentDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new StudentDao();
	}
	
	@Test
	public void testSave() {
		Student s = new Student(123, "Frank", "IT", 19);
		assertTrue(dao.save(s));
	}
	
	@Test
	public void testFind() {
		Student s = dao.find(123);
		assertNotNull(s);
		System.out.println(s);
	}
}
