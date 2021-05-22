package tw.ouyang.websocket;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("/login-websocket")
	public String login(@RequestParam String username, HttpSession session) {
		session.setAttribute("username", username);
		return "chat.html";
	}

}
