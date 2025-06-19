import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertFunctions {

	@Test
	public void testAssert() {
		String str1 = "Junit";
		String str2 = "Junit";
		String str3 = "test";
		String str4 = "test";
		String str5 = null;
		
		int num1 = 1;
		int num2 = 2;
		int[] ar1 = {1, 2, 3};
		int[] ar2 = {1, 2, 3};
		
		// Assert methods
//		assertEquals(str1, str2);
//		assertSame(str3, str4);
//		assertNotSame(str1, str2);
//		assertNotNull(str1);
//		assertNull(str5);
//		assertTrue(num1 > num2);
		assertArrayEquals(ar1, ar2);
	}
}


