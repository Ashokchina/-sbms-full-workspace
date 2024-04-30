package ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Course;
import ashokit.repository.CourseRepository;
@Service
public class CourseServiceImpl  implements CourceService{
	@Autowired
private CourseRepository courseRepo;

@Override
public List<Course> getAllCourses() {
	// TODO Auto-generated method stub
	return courseRepo.findAll();
}


}
