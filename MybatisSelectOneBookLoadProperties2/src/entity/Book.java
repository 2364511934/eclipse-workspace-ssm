package entity;

public class Book {
	private int bid;
	private String bname;
	private String author;
	private String price;
	
	// 默认构造函数必须要有 否则 mybatis 会报错
	public Book() {
	}
	
	public Book(int bid, String bname, String author, String price) {
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	
}
