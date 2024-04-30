package ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Course;
import ashokit.repo.CourseRepo;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public String saveCourse(Course course) {
        // If course ID is null, it's a new course, so save it
        if (course.getCid() == null) {
            Course savedCourse = courseRepo.save(course);
            // You may want to handle the saved course object if needed
        } else {
            // If course ID is not null, it means it's an existing course, so update it
            // You may want to add additional logic here if needed
            Course updatedCourse = courseRepo.save(course);
            // You may want to handle the updated course object if needed
        }
		return "CourseSaved";
    }

    public List<Course> getCourse() {
        return courseRepo.findAll();
    }
}
