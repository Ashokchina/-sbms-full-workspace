package ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsgController {
	@GetMapping("/")
	public String Msg() {
		
		return "Happy Birth Day";
		
	}

}
