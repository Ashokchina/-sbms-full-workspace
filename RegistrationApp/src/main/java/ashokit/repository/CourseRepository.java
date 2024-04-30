package ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
