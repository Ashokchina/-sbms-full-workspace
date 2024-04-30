package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ashokit.entity.Book;
@RepositoryRestResource(path = "book")
public interface BookRepositiry  extends JpaRepository<Book, Integer> {

}
