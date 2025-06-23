package ax7;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailMessage implements Message {
	
	public EmailMessage() {
		System.out.println("Email Message constructor");
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("Email sent to, " + to + " as: " + msg);
	}

}
