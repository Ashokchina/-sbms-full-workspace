package ashokit.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpoyeeController {
	@Autowired
	private EmployeeRepo erepo;

	@GetMapping("/emp")
	public Iterable<Employee> getAllEmp() {
		return erepo.findAll();

	}

	@PostMapping("/emps")
	public String saveEmp(@RequestBody Employee employee) {

		erepo.save(employee);
		return "Employee Saved";
	}

}
