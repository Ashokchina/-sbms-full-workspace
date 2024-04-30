package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CallingStoredProcedureApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(CallingStoredProcedureApplication.class, args);

		StoredProcedureCallingClass bean = context.getBean(StoredProcedureCallingClass.class);
		// bean.callSP();
		bean.method2();

	}

}
