package day15;

import java.util.ArrayDeque;
import java.util.Deque;

class Book {
	private int no;
	private String name;
	private double price;

	public Book(int no, String name, double price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
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

	@Override
	public String toString() {
		return "Book [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

}

public class Work15 {

	public static void main(String[] args) {
		Book book1 = new Book(1, "����ѧ", 2323.9);
		Book book2 = new Book(2, "��ѧ", 23.9);
		Book book3 = new Book(3, "��ѧ", 223.9);
		Book book4 = new Book(4, "��ѧ", 923.9);
		Book book5 = new Book(5, "��ѧ", 23.6);
		Deque<Book> dequeQueue = new ArrayDeque<>();

		// ����һ:
		/*
		 * dequeQueue.push(book1); dequeQueue.push(book2); dequeQueue.push(book3);
		 * dequeQueue.push(book4); dequeQueue.push(book5);
		 * 
		 * while(dequeQueue.size()> 0) { System.out.println(dequeQueue.pop()); }
		 */

		// ������:
		/*
		 * dequeQueue.addFirst(book1); dequeQueue.addFirst(book2);
		 * dequeQueue.addFirst(book3); dequeQueue.addFirst(book4);
		 * dequeQueue.addFirst(book5); while(dequeQueue.size()> 0) {
		 * System.out.println(dequeQueue.pollFirst()); }
		 */

		// ������:
		dequeQueue.addLast(book1);
		dequeQueue.addLast(book2);
		dequeQueue.addLast(book3);
		dequeQueue.addLast(book4);
		dequeQueue.addLast(book5);
		while (dequeQueue.size() > 0) {
			System.out.println(dequeQueue.pollLast());
		}

	}

}
