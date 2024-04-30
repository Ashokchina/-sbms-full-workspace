package ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Jpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Jpa01Application.class, args);
	BookRepository bookrepo = context.getBean(BookRepository.class);
	Book b = new Book();
	b.setBookId(101);
	b.setBookName("CoreJava");
	b.setBookPrice(5000.00);
	
	bookrepo.save(b);
	}

}
