package day11;


class BookLibrary{
	
	static class Book{
		private String name;
		private String author;
		private double price;
		public Book(String name, String author, double price) {
			super();
			this.name = name;
			this.author = author;
			this.price = price;
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
		
	}
	
	public void show() {
		Book book = new Book("name", "author", 111.0);
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
	}
}

public class StaticOuterDemo {

	public static void main(String[] args) {
		BookLibrary bookLibrary  = new BookLibrary();
		bookLibrary.show();
		
		BookLibrary.Book book = new BookLibrary.Book("name", "author", 3434.00);
		System.out.println(book.getName());

	}

}
