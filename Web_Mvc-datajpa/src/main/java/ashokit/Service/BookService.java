package ashokit.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ashokit.Model.Book;

public interface BookService  {
	List<Book> getAllBook();
	void SaveBook(Book Book);
	Book getBookById(long bookid);
	void deleteBookById(long bookid);
}
