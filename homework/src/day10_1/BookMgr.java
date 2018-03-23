package day10_1;

public class BookMgr {
	private Book[] bookArray = new Book[100];
	private int bookNumbers = 0;
	
	
	private int findBook(String no) {
		for(int i=0; i<bookArray.length && i<bookNumbers; i++) {
			if(bookArray[i].getNo().equals(no))
				return i;
		}
		return -1;
	}
	
	private boolean bookExist(String no) {
		if(findBook(no)>=0)
			return true;
		return false;
	}
	
	public boolean addBook(String no, Book book) {
		if(bookExist(no))
			return false;
		bookArray[bookNumbers++] = book;
		return true;
	}
	
	public boolean modifyBook(String no, Book book) {
		int index = -1;
		if((index = findBook(no))>=0) {
			bookArray[index] = book;
		}
		return true;
	}
	
	public boolean deleteBook(String no) {
		if(!bookExist(no))
			return false;
		int index = findBook(no);
		
		for(int i=index; i<bookNumbers-1; i++) {
			bookArray[i] = bookArray[i+1];
		}
		
		bookNumbers --;
		return true;
	}
	
	public Book[] inquireBook(String no) {
		return bookArray;
	}

	public int getBookNumbers() {
		return bookNumbers;
	}

	public void setBookNumbers(int bookNumbers) {
		this.bookNumbers = bookNumbers;
	}
	
}
