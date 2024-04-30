package ashokit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyAppRunner  implements CommandLineRunner{


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cmd");
	}

}
