package ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ashokit.service.MsgService;

@RestController
public class MsgRestController {
@Autowired
private MsgService service;
@GetMapping("/welcome")
public String welcomeMsg() {
	service.getClass().getName();
	String welcomemsg = service.welcome();
	return welcomemsg;
}
}
