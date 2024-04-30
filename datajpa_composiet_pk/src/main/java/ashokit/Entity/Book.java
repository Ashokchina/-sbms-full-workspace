package ashokit.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Book {
	private String authorname;
	private Double bookprice;
	@EmbeddedId
	private Bookpk bookpk;
	public Book(String authorname, Double bookprice, Bookpk pk) {
		
		this.authorname = authorname;
		this.bookprice = bookprice;
		this.bookpk = pk;
	}
	public Book() {
		
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
	public Bookpk getBookpk() {
		return bookpk;
	}
	public void setBookpk(Bookpk bookpk) {
		this.bookpk = bookpk;
	}
	@Override
	public String toString() {
		return "Book [authorname=" + authorname + ", bookprice=" + bookprice + ", bookpk=" + bookpk + "]";
	}
	

}