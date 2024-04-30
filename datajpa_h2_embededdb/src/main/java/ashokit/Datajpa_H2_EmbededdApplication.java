package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Datajpa_H2_EmbededdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Datajpa_H2_EmbededdApplication.class, args);
		EmployeeRepositry bean = context.getBean(EmployeeRepositry.class);
		 employee employee = new employee();
		 employee.setEid(1);
		 employee.setEname("Balu");
		 employee.setEprice(40000.00);
		 bean.save(employee);
		
	}

}
