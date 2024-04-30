package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ashokit.Service.EmpService;

@SpringBootApplication
public class AddressProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(AddressProjectApplication.class, args);
		EmpService bean = context.getBean(EmpService.class);
		bean.save();
	}

}
