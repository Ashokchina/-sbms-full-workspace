package ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	public WelcomeController() {
		System.out.println("WelcomeController() constructor");
	}
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
		ModelAndView mvc = new ModelAndView();
		
		mvc.addObject("msg","Welcome to Ammerpet");
		mvc.setViewName("index");
		return mvc;

	}
	@GetMapping("/User")
	public ModelAndView GetUser() {
		ModelAndView mvc1 = new ModelAndView();
		mvc1.addObject("msg1", "Good Morning...!! ");
		mvc1.setViewName("index");
		return mvc1;
		
	}
}
