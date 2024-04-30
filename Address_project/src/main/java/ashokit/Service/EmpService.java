package ashokit.Service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ashokit.Entity.Empaddr;
import ashokit.Entity.Employee;
import ashokit.Entity.EmppAddr;
import ashokit.Repo.EmpaddrRepo;
import ashokit.Repo.EmployeeRepo;
import ashokit.Repo.EmppAddRepo;

@Service
public class EmpService {
	private EmployeeRepo erepo;
	private EmpaddrRepo ecrepo;
	private EmppAddRepo eprepo;

	public EmpService(EmployeeRepo erepo, EmpaddrRepo ecrepo, EmppAddRepo eprepo) {
		this.erepo = erepo;
		this.ecrepo = ecrepo;
		this.eprepo = eprepo;
	}

	@Transactional(rollbackFor = Exception.class)
	public void save() {
		Employee emp = new Employee();
		emp.setEname("John");
		emp.setSalary(2000.00);
		Employee save = erepo.save(emp);

		Empaddr caddr = new Empaddr();
		caddr.setCcity("Hyd");
		caddr.setCstate("TG");
		caddr.setCcountry("IN");
		caddr.setEid(save.getEid());
		Empaddr save2 = ecrepo.save(caddr);

		EmppAddr pAddr = new EmppAddr();
		pAddr.setPecity("WGL");
		pAddr.setPstate("TG");
		pAddr.setPcountry("IN");
		pAddr.setAid(save2.getAid());
		eprepo.save(pAddr);
		
	}
	
	
}
