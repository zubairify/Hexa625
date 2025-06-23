package ax1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void testMessage() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		
//		Hello h = (Hello) appCtx.getBean("hi");
		
//		Hello h = appCtx.getBean("hi", Hello.class);
		
		Hello h = appCtx.getBean(Hello.class);
		
		System.out.println("Message: " + h.getMessage());
	}
}
