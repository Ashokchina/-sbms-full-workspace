package ashokit.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ashokit.Entity.Book;

@RestController
public class BookRestController {
	@PostMapping(value = "/boot", produces = "text/plain")
	public String addBook(@RequestBody Book b) {
	    System.out.println(b);
	    return "Book Added";
	}

		
	
	@GetMapping(value = "/book", produces = { "application/xml", "application/json" })

public Book getBook() {
	Book book = new Book(101, "java", 540.00);
	
	return book;
	
}
}
