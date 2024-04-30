package ashokit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
@ControllerAdvice
public class ProductController {
	public String Errormsg(Model model) {
		 model.addAttribute("errormsg", "Something is went Wrong plz cheak");
		return "Error";
	}
}
