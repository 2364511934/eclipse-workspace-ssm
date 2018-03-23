package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.prefs.PreferenceChangeEvent;

class Book{
	private String name;
	private String author;
	private double price;
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	
}

class NamePredicate implements Predicate<Book>{

	@Override
	public boolean test(Book t) {
		return t.getName().contains("java");
	}
	
}

public class test2Filter {
	
	public static int filterName(List<Book> list, Predicate<Book> p) {
		int count = 0;
		for(Book b : list) {
			if(p.test(b)) {
				count ++;
			}
		}
		System.out.println("count:" + count);
		return count;
	}
	public static void filterInfo(List<Book> list, Predicate<Book> p) {
		int count = 0;
		for(Book b : list) {
			if(p.test(b)) {
				System.out.println(b);
			}
		}
	}
	
	public static void filterPrice(List<Book> list, Predicate<Book> p) {
		for(Book b : list) {
			if(p.test(b)) {
				System.out.println(b);
			}
		}
		//return count;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("java", "作者1", 10.6);
		Book book2 = new Book("javggg", "作者2", 330.6);
		Book book3 = new Book("javfggga", "作者3", 330.6);
		List<Book> listBook = new ArrayList<>();
		Collections.addAll(listBook, book1, book2, book3);
		NamePredicate  namePredicate  =new NamePredicate();
		filterName(listBook, namePredicate);
		filterName(listBook, (t)->{return t.getName().contains("java");});

		/*filterName(listBook, new Predicate<Book>() {

			@Override
			public boolean test(Book t) {
				return t.getName().contains("java");
			}
			
		});*/
		
		filterInfo(listBook, (t)->t.getName().length()>5);
		filterInfo(listBook, new Predicate<Book>() {

			@Override
			public boolean test(Book t) {
				
				return t.getName().length()>5;
			}
			
		});
		
		filterPrice(listBook, (t)->t.getPrice() > 20.0 && t.getAuthor().length()== 2);
		filterPrice(listBook, new Predicate<Book>() {

			@Override
			public boolean test(Book t) {
				// TODO Auto-generated method stub
				return t.getPrice() > 20.0 && t.getAuthor().length()== 2;
			}
			
		});
		
	}

}
