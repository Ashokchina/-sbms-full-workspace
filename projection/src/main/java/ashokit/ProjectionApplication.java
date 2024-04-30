package ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectionApplication.class, args);
	 EmployeeService service = context.getBean(EmployeeService.class);
	List<Object[]> salaries = service.getEmployeeNamesAndSalaries(1200.00);
	System.out.println(salaries);
	}

}
