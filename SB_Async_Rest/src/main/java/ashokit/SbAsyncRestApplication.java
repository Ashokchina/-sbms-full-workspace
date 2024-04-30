package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbAsyncRestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbAsyncRestApplication.class, args);
	QuoteService bean = context.getBean(QuoteService.class);
	bean.getQuoteV2();

	
	}

}
