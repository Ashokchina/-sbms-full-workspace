package ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ashokit.Model.Book;
import ashokit.Service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bservice;

	@GetMapping("/")
	public String viewHomePage(Model model) {
	    model.addAttribute("listBooks", bservice.getAllBook());
	    return "index";
	}


	

	@GetMapping("/shownewBookForm")
	public String shownewBookForm(Model model) {
		Book book = new Book();

		model.addAttribute("book", book);
		return "new_book";

	}

	@PostMapping("/saveBook")
	public String SaveBook(@ModelAttribute("book") Book bok) {
		bservice.SaveBook(bok);
		return "redirect:/";

	}
	@GetMapping("/ShowFormForUpdate/{bookid}")
	public String ShowFormForUpdate(@PathVariable(value = "bookid") long bookid, Model model ) {
		Book book = bservice.getBookById(bookid);
		model.addAttribute("book", book);
		return "new_bookform";
	}
	@GetMapping("/DeleteBookById/{bookid}")
	public String deleteById(@PathVariable(value = "bookid")long bookid,Model model) {
		this.bservice.deleteBookById(bookid);
		return "redirect:/";
	}

}
