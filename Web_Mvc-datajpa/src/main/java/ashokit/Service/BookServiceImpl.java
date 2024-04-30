package ashokit.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.Model.Book;
import ashokit.repositiry.BookRepositry;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepositry brepo;

	@Override
	public List<Book> getAllBook() {

		return brepo.findAll();
	}

	@Override
	public void SaveBook(Book book) {
		this.brepo.save(book);

	}

	@Override
	public Book getBookById(long bookid) {
		Optional<Book> findById = brepo.findById(bookid);
		Book book = null;
		if (findById.isPresent()) {
			book = findById.get();
		} else {
			throw new RuntimeException("Book is not found for this id" + bookid);
		}

		return book;
	}

	@Override
	public void deleteBookById(long bookid) {
		this.brepo.deleteById(bookid);
		
	}

}
