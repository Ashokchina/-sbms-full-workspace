package ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
