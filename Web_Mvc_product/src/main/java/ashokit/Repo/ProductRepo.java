package ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
