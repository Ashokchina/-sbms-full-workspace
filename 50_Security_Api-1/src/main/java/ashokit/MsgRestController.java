package ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/wedding")
public String getWelcomeMsg() {
	return"Welcone To My Wedding";
}
}
