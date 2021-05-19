package tw.ouyang.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping("/send-email")
	public String sendEmail() {
		jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello"));
		return "Send email successfully!";
	}

	@GetMapping("/send/{message}")
	public String sendMessage(@PathVariable String message) {
		jmsTemplate.convertAndSend("messagebox", message);
		return "Send message successfully!";
	}

}
