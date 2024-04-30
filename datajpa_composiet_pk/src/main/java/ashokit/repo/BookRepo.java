package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.Entity.Book;
import ashokit.Entity.Bookpk;

public interface BookRepo extends JpaRepository<Book, Bookpk> {

}
