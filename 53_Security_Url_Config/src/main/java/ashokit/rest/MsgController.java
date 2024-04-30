package ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	@GetMapping("/greet")
	public String getGreet() {

		return "Good Morning...!";

	}

	@GetMapping("/welcome")
	public String welcomeMsg() {

		return "Welcome to Ashok Elagance";

	}

	@GetMapping("/ADMIN")
	public String adminPortal() {
		return "This is a Admin portal";

	}
}
