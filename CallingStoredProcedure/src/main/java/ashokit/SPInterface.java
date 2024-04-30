package ashokit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface SPInterface extends JpaRepository<Student, Long> {

	@Procedure("demo1")
	public String callingSP();

}
