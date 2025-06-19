import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	private List<String> cart;
	
	@BeforeAll
	public static void setup() {
		System.out.println("Setup before all test cases");
	}
	
	@AfterAll
	public static void teardown() {
		System.out.println("Teardown after all test cases");
	}
	
	@BeforeEach
	public void setupEach() {
		cart = new ArrayList<>();
//		cart.add("Random");
		System.out.println("Setup before each test case");
	}
	
	@AfterEach
	public void teardownEach() {
		cart = null;
		System.out.println("Teardown after each test case");
	}
	
	@Disabled
	@Test
	public void testEmptyCart() {
		System.out.println("Testing empty cart");
		assertTrue(cart.isEmpty());
	}
	
	@Disabled
	@Test
	public void testOneItem() {
		cart.add("Item1");
		System.out.println("Testing cart with 1 item");
		assertEquals(1, cart.size());
	}
	
	@Test
	public void testTwoItem() {
		cart.add("Item1");
		cart.add("Item2");
		System.out.println("Testing cart with 2 item");
		assertEquals(2, cart.size());
	}
}





