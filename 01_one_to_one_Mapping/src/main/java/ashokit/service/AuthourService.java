package ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Authour;
import ashokit.entity.Book;
import ashokit.repo.AuthourRepo;
import ashokit.repo.BookRepo;

@Service
public class AuthourService {
	@Autowired
	private AuthourRepo arepo;
	@Autowired
	private BookRepo brepo;

	public void saveBookWithAuthour() {
		Book book = new Book();
		book.setBname("Java");
		book.setPrice(100.00);

		Authour authour = new Authour();
		authour.setAname("Ashok");
		authour.setAddress("Warangal");

		authour.setBook(book);
		book.setAuthour(authour);

		arepo.save(authour);

	}

	public void deleteAuthor(int id) {
		arepo.deleteById(id);
	}

	public void getAouthour(int id) {
		arepo.findById(id);
	}

	public void deleteBook(int id) {
		brepo.deleteById(id);
	}

	public void getBook(int id) {
		brepo.findById(id);
	}

}
