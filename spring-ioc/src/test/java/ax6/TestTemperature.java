package ax6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTemperature {

	@Test
	public void testFtoc() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");
		
		int c = tc.ftoc(102);
		Assertions.assertEquals(38, c);
	}
	
	@Test
	public void testCtof() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");
		
		int f = tc.ctof(36);
		Assertions.assertEquals(96, f);
	}
}
