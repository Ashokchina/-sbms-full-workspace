package ashokit;

import java.io.FileInputStream;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepo repo;

	public UserService(UserRepo repo) {

		this.repo = repo;
	}
	public void insertImg() {
		Demo dm = new Demo();
		dm.setId(2);
		dm.setName("nikil");
		try {
			FileInputStream fs = new FileInputStream("passphoto.jpg");
			dm.setImage(fs.readAllBytes());
			repo.save(dm);
			fs.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
