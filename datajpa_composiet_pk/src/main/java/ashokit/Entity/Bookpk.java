package ashokit.Entity;

import jakarta.persistence.Embeddable;
@Embeddable
public class Bookpk {
    
	private Integer bookid;
	private String bookname;
	public Bookpk() {
		
	}
	public Bookpk(Integer bookid, String bookname) {
		
		this.bookid = bookid;
		this.bookname = bookname;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "Bookpk [bookid=" + bookid + ", bookname=" + bookname + "]";
	}
	
}
