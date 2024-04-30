package ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesgController {
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome To Office";
		return msg;

	}

	@GetMapping("/greet")
	public String getGreetMsg(@RequestParam("name") String name) {
		String msg = name + "Welcome to waragal";
		return msg;

	}
	@GetMapping("/action/{name}")
	public ResponseEntity<String>getMsg(@PathVariable("name")String name){
		String msg = name+" Welcome To RestApi...!";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	@GetMapping("/view")
	public ResponseEntity<Void> noDomain() {
		System.out.println("no domain() is called...!");
		return new ResponseEntity<>(HttpStatus.NO_CONTENT );
	}
}
