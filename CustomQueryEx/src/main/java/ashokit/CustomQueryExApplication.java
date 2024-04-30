package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ashokit.Entity.service.StudentService;

@SpringBootApplication
public class CustomQueryExApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomQueryExApplication.class, args);
	StudentService bean = context.getBean(StudentService.class);
	bean.insertStudent("lakavath", "Ashok");
	}

}
