package ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ashokit.NoUserFoundException;

@RestController
public class UserRestController {
	@GetMapping("/user/{uid}")
public String getNameById(@PathVariable("uid")Integer uid) {
	if(uid<=100) {
		return "Ashok";
	}
	else {
		throw new NoUserFoundException("Invalid Id");
	}
}
}
