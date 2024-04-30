package ashokit.Service;

import java.util.List;

import ashokit.Entity.Product;

public interface ProductService {
List<Product>getAllProduct();
void saveProduct(Product product);
}
