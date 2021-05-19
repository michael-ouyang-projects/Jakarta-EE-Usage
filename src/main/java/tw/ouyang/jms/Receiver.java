package tw.ouyang.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "mailbox")
	public void receiveEmail(Email email) {
		System.out.println("Received <" + email + ">");
	}
	
	@JmsListener(destination = "messagebox")
	public void receiveMessage(String message) {
		System.out.println("Received: " + message);
	}

}
