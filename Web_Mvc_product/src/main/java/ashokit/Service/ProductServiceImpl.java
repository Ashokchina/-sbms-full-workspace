package ashokit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.Entity.Product;
import ashokit.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo prepo;

	@Override
	public List<Product> getAllProduct() {

		return prepo.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		this.prepo.save(product);
		
	}

}
