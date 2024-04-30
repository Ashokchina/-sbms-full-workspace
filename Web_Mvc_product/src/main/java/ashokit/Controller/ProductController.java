package ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ashokit.Entity.Product;
import ashokit.Service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService bservice;

	@GetMapping("/")
	public String Viewpage(Model model) {
		model.addAttribute("listproducts", bservice.getAllProduct());

		return "Index";

	}
@GetMapping("/shownewproduct")
	public String shownewProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "showproduct";
		
	}
public String saveProduct(@ModelAttribute("product")Product product) {
	bservice.saveProduct(product);
	return "redirect:/";
	
}
}
