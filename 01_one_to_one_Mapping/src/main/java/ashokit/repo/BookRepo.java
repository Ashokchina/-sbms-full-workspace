package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
