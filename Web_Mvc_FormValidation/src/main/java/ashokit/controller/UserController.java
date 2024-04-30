package ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ashokit.entity.User;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	private JavaMailSender mailsender;

	@GetMapping("/index")
	public String showForm(@ModelAttribute("user") User user) {

		return "User Form";

	}

	@PostMapping("/userForm")
	public String submitForm(@Valid @ModelAttribute User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "User Form";
		}
		sendEmail(user.getEmail());
		model.addAttribute("user", user);
		return "Result";
	}

	private void sendEmail(String to) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject("Registration Succes");
		message.setText("Thank you for registering. Your registration was successful.");
		mailsender.send(message);

	}

}
