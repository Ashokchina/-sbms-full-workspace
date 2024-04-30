package ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ashokit.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
