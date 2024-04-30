package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ashokit.entity.service.ContactinfoService;

@SpringBootApplication
public class JpaDataTimestmpingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaDataTimestmpingApplication.class, args);
		ContactinfoService bean = context.getBean(ContactinfoService.class);
		String savedOrNot = bean.SaveContactDtls(2);
		System.out.println(savedOrNot);
		
	}

}
