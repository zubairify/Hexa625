package ax7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("mp")
public class MessageProcessor {
	
	@Autowired
	private ApplicationContext ctx;

	public MessageProcessor() {
		System.out.println("Message Processor constructor");
	}
	
	public void process(String type, String to, String msg) {
		Message m = (Message) ctx.getBean(type);
		m.send(to, msg);
	}
}
