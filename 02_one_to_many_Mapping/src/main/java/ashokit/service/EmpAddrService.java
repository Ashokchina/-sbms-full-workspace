package ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Address;
import ashokit.entity.Employee;
import ashokit.repo.AddressRepo;
import ashokit.repo.EmployeeRepo;

@Service
public class EmpAddrService {
	@Autowired
	private EmployeeRepo empRepo;
	@Autowired
	private AddressRepo adderRepo;
	
	public String saveEmpWithAddr() {
		
		Address address1 = new Address();
		
		address1.setCity("Hyd");
		address1.setState("TG");
		address1.setType("perment");
		
		Address address2 = new Address();
		
		address2.setCity("Vizag");
		address2.setState("Ap");
		address2.setType("present");
		
		Employee e1 = new Employee();
		e1.setEname("Ashok");
		e1.setSalary(1000.00);
		
		address1.setEmployee(e1);
		address2.setEmployee(e1);
		List<Address> addrlist = Arrays.asList(address1,address2);
		e1.setAadr(addrlist);
		empRepo.save(e1);
		
		return "Record Saved";
		
	}
	public void getAddr() {
		adderRepo.findById(1);
	}
	public void getDelete() {
		adderRepo.deleteById(1);
}
}