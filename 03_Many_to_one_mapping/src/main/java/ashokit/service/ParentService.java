package ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Child;
import ashokit.entity.Parent;
import ashokit.repo.ChildRepo;
import ashokit.repo.ParentRepo;

@Service
public class ParentService {
	@Autowired
private ParentRepo parentRepo;
	@Autowired
private ChildRepo childRepo;
	public void saveParentWithChilds() {
		Parent parent = new Parent();
		parent.setPname("Gyama");
		Child child1 = new Child();
		child1.setCname("Ashok");
	
		Child child2 = new Child();
		child2.setCname("Neela");
		
		List<Child> childlist = Arrays.asList(child1,child2);
		parent.setChildren(childlist);
		childRepo.saveAll(childlist);
	}

}
