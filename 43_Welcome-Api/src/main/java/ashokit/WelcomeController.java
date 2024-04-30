package ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg ="Welcome to AshokIT";
		return msg;
	}

}
