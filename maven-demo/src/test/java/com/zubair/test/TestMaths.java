package com.zubair.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zubair.pojo.Maths;

public class TestMaths {
	private static Maths m = new Maths();
	
	@Test
	public void testDiv() {
		assertTrue(m.div(10, 5) == 2);
	}
	
	@Test
	public void testAdd() {
		assertTrue(m.add(4, 6) == 10);
	}
	
	@Test
	public void testZeroDiv() {
		assertThrows(ArithmeticException.class, () -> m.div(10, 0));
	}
}


