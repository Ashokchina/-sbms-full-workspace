package ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetController {
	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String greetMsg() {
		String welcomeMsgs = welcomeApiClient.invokeWelcomeMsgs();
		String greetmsg = "Wish You Happy Ugadhi";
		return greetmsg.concat(welcomeMsgs);
	}
}
