package ashokit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
 @GetMapping("/welcome")
	public String getmsg(Model model) {
		model.addAttribute("msg", "welcome to US");
		int i=10/0;
		return "index";
	}
 @ExceptionHandler(value = Exception.class)
 public String Errormsg(Model model) {
	 model.addAttribute("errormsg", "Something is went Wrong plz cheak");
	return "Error";
	 
 }
}
