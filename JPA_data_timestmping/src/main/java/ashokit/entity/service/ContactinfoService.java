package ashokit.entity.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ashokit.entity.ContactusEntity;
import ashokit.entity.repo.ContactRepo;

@Service
public class ContactinfoService {
	private ContactRepo cRepo;

	public ContactinfoService(ContactRepo cRepo) {

		this.cRepo = cRepo;
	}
public String SaveContactDtls(Integer id) {
	ContactusEntity entity = cRepo.getReferenceById(id);
	
	if(entity==null) {
		ContactusEntity enti = new ContactusEntity();
		enti.setCname("Ranjan");
		enti.setCphno("8383883");
		enti.setCemail("r@gmail.com");
		cRepo.save(enti);
		return "User Saved";
	}else {	
		entity.setCphno("93933939");
		cRepo.save(entity);
		return "User Updated";
	}
	


	}
}
