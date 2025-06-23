package ex1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void testMessage() {
		// Creating IoC Container by reading configuration from Project classpath.
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx.xml");
		
//		Hello h = (Hello) appCtx.getBean("hi");
		
//		Hello h = appCtx.getBean(Hello.class, "hi");
		
		Hello h = appCtx.getBean(Hello.class);
		
		System.out.println("Message: " + h.getMessage());
	}
}
