package ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
private EmployeeRepository emprepo;
	public List<Object[]> getEmployeeNamesAndSalaries(double minSalary) {
        return emprepo.m1(minSalary);
}}
