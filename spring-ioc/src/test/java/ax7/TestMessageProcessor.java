package ax7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageProcessor {

	@Test
	public void testProcess() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");
		
		mp.process("sms", "9820ZUBAIR", "Howdy");
		mp.process("email", "zubairify", "Bonjour");
//		mp.process("wap", "@zubair", "Aloha");
	}
}
