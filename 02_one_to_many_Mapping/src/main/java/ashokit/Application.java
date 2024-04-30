package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ashokit.service.EmpAddrService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpAddrService bean = context.getBean(EmpAddrService.class);
		//bean.saveEmpWithAddr();
		//bean.getAddr();
		bean.getDelete();
	}

}
