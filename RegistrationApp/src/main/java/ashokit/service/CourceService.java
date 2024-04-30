package ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ashokit.entity.Course;

@Service
public interface CourceService {
List<Course>getAllCourses();
}
