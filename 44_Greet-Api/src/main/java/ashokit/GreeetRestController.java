package ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeetRestController {
	@Autowired
	private WelcomeApiClient apiClient;

	@GetMapping("/greet")
	public String GreetMsg() {
		String welcomeApi = apiClient.invokeWelcomeApi();
		String greetmsg = "Happy Ugadhi To Everyone";
		return greetmsg.concat(welcomeApi);

	}
}
