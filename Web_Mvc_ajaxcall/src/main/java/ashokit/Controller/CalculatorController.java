package ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class CalculatorController {
@GetMapping
	 public String showCalculator() {
		return "Calculator";
		 
	 }
@PostMapping("/Calculator")
@ResponseBody
public String calculate(@RequestParam int num1,@RequestParam int num2) {
	int result = num1+num2;
	return "Result ="+result;
	
}
}
