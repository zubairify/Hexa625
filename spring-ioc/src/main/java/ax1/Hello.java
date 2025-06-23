package ax1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import ax7.Message;

@Component("hi")
public class Hello {
	private String message;
	
	@Autowired
	@Qualifier("sms")
	private Message text;
	
	public Hello() {
		System.out.println("Default constructor");
	}

	public Hello(String message) {
		this.message = message;
		System.out.println("Parameterised constructor");
	}

	public String getMessage() {
		return message;
	}

	@Value("Aloha Spring!")
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter method");
	}
}
