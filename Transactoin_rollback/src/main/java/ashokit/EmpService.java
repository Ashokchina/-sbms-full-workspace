package ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpService {
	@Autowired
	private EmpRepo erepo;
	@Autowired
	private EmpaddrRepo arepo;
	@Transactional(rollbackFor = Exception.class)
public void save() {
	Employee emp = new Employee();
emp.setEmpname("dfgh");
emp.setEmpsalary(40000.00);
Employee Entity = erepo.save(emp);
erepo.save(emp);
Empaddr addr = new Empaddr();
addr.setCity("Hyd");
addr.setState("TG");
addr.setCountry("IN");
addr.setEmpid(Entity.getEmpid());
arepo.save(addr);
}
}
