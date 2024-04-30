package ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
private ProductRepo repo;
	
	public void insert() {
		Product p = new Product();
		p.setPid(101);
		p.setPname("punam");
Product save = repo.save(p);
System.out.println("record inserted"+save);
	}
}
