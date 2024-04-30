package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
