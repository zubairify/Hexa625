package ax3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStock {

	@Test
	public void testScope() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		
		Stock s1 = appCtx.getBean("stk", Stock.class);
		Stock s2 = appCtx.getBean(Stock.class, "stk");
		
		System.out.println(s1 == s2);
	}
}
