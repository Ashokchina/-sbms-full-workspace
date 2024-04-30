package ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.Entity.Book;
import ashokit.Entity.Bookpk;
import ashokit.repo.BookRepo;
@Service
public class BookService {
	@Autowired
	private BookRepo Brepo;

	public void saveBook() {

		Bookpk pk = new Bookpk(101, "phyton");
		Book b = new Book("Ronaldo", 2000.00, pk);

		Brepo.save(b);
		System.out.println("Record is Saved");
		}

	public void getBookbyid() {
		Bookpk pk = new Bookpk(102, "Python");
		
		Optional<Book> findById = Brepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
	}
