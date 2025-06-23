package ax7;

import org.springframework.stereotype.Component;

@Component("sms")
public class TextMessage implements Message {
	
	public TextMessage() {
		System.out.println("Text Message constructor");
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("SMS sent to, " + to + " as: " + msg);
	}

}
