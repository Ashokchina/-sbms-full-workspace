package ashokit.Entity;

public class Book {
	private Integer bookid;
	private String bookname;
	private Double bookprice;

	public Book() {

	}

	public Book(Integer bookid, String bookname, Double bookprice) {

		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
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

	public Double getBookprice() {
		return bookprice;
	}

	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

}
