package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ashokit.service.BookService;

@SpringBootApplication
public class DatajpaComposietPkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(DatajpaComposietPkApplication.class, args);
		BookService service = context.getBean(BookService.class);
		
		service.saveBook();
		//service.getBookbyid();
	}

}
