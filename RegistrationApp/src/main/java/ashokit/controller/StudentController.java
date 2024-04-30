package ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ashokit.entity.Student;
import ashokit.service.CourceService;
import ashokit.service.StudentService;
import ashokit.service.TimingService;
@Controller
public class StudentController {
	
@Autowired	
 private CourceService cService;
@Autowired
 private TimingService tService;
@Autowired
private StudentService sserice;
 @GetMapping("/")
 public String showRegistrationForm(Model model) {
	 model.addAttribute("student", new Student());
	 model.addAttribute("courses", cService.getAllCourses());
	 model.addAttribute("timings", tService.getAllTimings());
	 return "registration";
 }
 @PostMapping("/registration")
 public String registerStudent(@ModelAttribute("student")Student student,Model model ) {
	 boolean status = sserice.saveStudent(student);
	    if(status) {
	    	model.addAttribute("success","Registration successfull..!");
	    }else {
	    	model.addAttribute("failed","Registration Failed..");
	    }
	 
	 return "registration";
	 
 }
}
