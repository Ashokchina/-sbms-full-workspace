package ashokit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("SELECT emp.ename, emp.salary FROM Employee emp WHERE emp.salary > :minSalary")
    List<Object[]>m1(@Param("minSalary")double minSalary);
}
