package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ashokit.Service.EmployeeService;

@SpringBootApplication
public class Jpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Jpa2Application.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		service.getEmpQBE();
		service.getEmpsWithSort("eid");
	}

}
