package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
