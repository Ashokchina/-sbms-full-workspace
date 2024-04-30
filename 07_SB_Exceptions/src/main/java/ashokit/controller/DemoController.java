package ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
	@GetMapping("/demo")
public String getMsg() {
		int i = 10/0;
	String s = "Welcome to demo";
	
	return s;
	
}
}
