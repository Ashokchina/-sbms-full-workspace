package ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	@GetMapping("/user")
public String user() {
	return "<h1>Welcome To User</h1>";
}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome To Admin</h1>";
	}
	public String welcome() {
		return "<h1>Welcome :)</h1>";
		
	}
}
