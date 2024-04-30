package ashokit.Service;

import java.lang.reflect.Array;
import java.util.List;

import org.hibernate.mapping.Column;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private EmpRepositary emprepo;

	public EmployeeService(EmpRepositary emprepo) {
		this.emprepo = emprepo;
	}

	public void getEmpQBE() {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Ashok");
		emp.setEsalary(12000.00);
		emp.setEdesg("Tester");
		//emprepo.save(emp);
		Employee emp1 = new Employee();
		emp1.setEid(102);
		emp1.setEname("Ravi");
		emp1.setEsalary(40000.00);
		emp1.setEdesg("Devloper");
		emprepo.saveAll(List.of(emp, emp1));
		Example<Employee> of = Example.of(emp);
		List<Employee> findAll = emprepo.findAll(of);
		findAll.forEach(System.out::println);
	}
	public void getEmpsWithSort( String column) {
		Sort sort = Sort.by(column).reverse();
		List<Employee> findAll = emprepo.findAll(sort);
		findAll.forEach(System.out::println);
	}
	public void getEmpsWithPagination(int pagesize , int pageNo) {
		PageRequest of = PageRequest.of(pageNo -1, pagesize);
		Page<Employee> findAll = emprepo.findAll(of);
		List<Employee> content = findAll.getContent();
		content.forEach(System.out::println);
	}

}
