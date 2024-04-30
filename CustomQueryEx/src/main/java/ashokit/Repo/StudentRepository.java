package ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ashokit.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("INSERT INTO Student(firstName, lastName) VALUES (:firstName, :lastName)")
	void insertStudent(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
