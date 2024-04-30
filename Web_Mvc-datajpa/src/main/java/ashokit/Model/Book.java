package ashokit.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long bookid;
	@Column(name = "Book_Name")
private String bookname;
	@Column(name = "Book_Price")
private Double bookprice;
	@Column(name = "Book_Author")
private String bookauthor;
public Book() {
	
}
public long getBookid() {
	return bookid;
}
public void setBookid(long bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public Double getBookprice() {
	return bookprice;
}
public void setBookprice(Double bookprice) {
	this.bookprice = bookprice;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + ", bookauthor="
			+ bookauthor + "]";
}

}
