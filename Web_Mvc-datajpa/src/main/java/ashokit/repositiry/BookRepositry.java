package ashokit.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ashokit.Model.Book;
@Repository
public interface BookRepositry extends JpaRepository<Book, Long> {

}
