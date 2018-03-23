package day15;

import java.util.ArrayDeque;
import java.util.Queue;

class Person{
	int no;
	String name;
	
	public Person(int no, String name) {
		this.no = no;
		this.name = name;
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
	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + "]";
	}
	
}

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Person> bankQueue = new ArrayDeque<>();
		Queue<Person> bankQueue2 = new ArrayDeque<>();
		//Queue<String> bankQueue = new ArrayQueue<>();
		bankQueue.add(new Person(1,"杨康"));
		bankQueue.add(new Person(2,"郭靖"));
		bankQueue.add(new Person(3,"黄蓉"));
		bankQueue.add(new Person(4,"王五"));
		bankQueue.add(new Person(5,"赵六"));
		
	
		for(; bankQueue.size()>0; ) {
			Person p1 = bankQueue.poll();
			System.out.println(p1.no + ", " + p1.name + "办理完业务");
			bankQueue.forEach(System.out::println);
			/*for(int j=0; j<bankQueue.size(); j++) {
				//p1 = bankQueue.poll();
				//bankQueue2.add(p1);
				//bankQueue2 = bankQueue.poll();
				//System.out.println(p1.no + ", " + p1.name);
				
			}*/
			//bankQueue = bankQueue2 ;
		}
		
		
	}

}
