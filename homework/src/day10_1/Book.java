package day10_1;

import java.util.Date;

public class Book {
	private String no;
	private String name;
	private double price;
	private String author;
	private Date date;
	
	public Book(String no, String name, double price, String author, Date date) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.author = author;
		this.date = date;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
