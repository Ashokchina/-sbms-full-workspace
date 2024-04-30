package ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import ashokit.entity.Course;
import ashokit.service.CourseService;
import ashokit.utils.S3Utils;

@Controller
public class CourseController {
	
	@Autowired
	private S3Utils s3Utils;
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/add")
	public String showAddCourseForm(Model model) {
		model.addAttribute("cou", new Course());
		return "index";
	}

	@PostMapping("/add")
	public String addCourse(@ModelAttribute Course course, @RequestParam("imagerUrl") MultipartFile imageFile, Model model){
		String putObject = s3Utils.putObject(imageFile);
		course.setImage(putObject);
		String saveCourse = courseService.saveCourse(course);
		if(saveCourse == null) {
			model.addAttribute("msg", "Course Details Are Successfully Saved");
		}
		else {
			model.addAttribute("errMsg", "Flie Size is Out of Range");
		}
		return "redirect:/add";
	}

	  @GetMapping("/get")
	    public String getAllCourses(Model model) {
	        List<Course> courses = courseService.getCourse(); // Assuming this method exists in CourseService
	        model.addAttribute("courses", courses);
	        return "show";
	    }

}
