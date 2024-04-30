package ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ashokit.entity.Product;
import ashokit.service.ProductService;

@RestController

public class ProductController {
	@Autowired
	private ProductService pSerice;

	@GetMapping("/get")
	public List<Product> getAllProduct() {
		return pSerice.getAllProducts();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {

		return pSerice.getProductById(id);

	}

	@PostMapping("/post")
	public Product saveProduct(@RequestBody Product product) {
		return pSerice.saveProduct(product);

	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		pSerice.deleteProduct(id);
	}

}
