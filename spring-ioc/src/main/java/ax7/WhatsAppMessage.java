package ax7;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wap")
@Lazy
public class WhatsAppMessage implements Message {

	public WhatsAppMessage() {
		System.out.println("WhatsApp Message constructor");
	}
	
	@Override
	public void send(String to, String msg) {
		System.out.println("WhatsApp sent to, " + to + " as: " + msg);
	}

}
