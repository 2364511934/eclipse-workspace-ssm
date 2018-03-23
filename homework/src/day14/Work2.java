package day14;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Mouse implements Comparable<Mouse>{
	private String name;
	private String hobby;
	private int age;
	
	
	public Mouse(String name, String hobby, int age) {
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Mouse o) {
		return this.age - o.getAge();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Mouse)obj).getName());
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", hobby=" + hobby + ", age=" + age + "]";
	}
	
}

public class Work2 {

	public static void main(String[] args) {
		Mouse mouse1 = new Mouse("Ã‘Ã‘", "", 2);
		Mouse mouse2 = new Mouse("Ω‹»", "", 1);
		SortedSet<Mouse> setMap = new TreeSet<>();
		setMap.add(mouse1);
		setMap.add(mouse2);
		
		Iterator<Mouse> it =setMap.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		if(!setMap.add(mouse2))
		{
			System.out.println("ÃÌº” ß∞‹");
		}
		
		setMap.remove(mouse2);
		
		it =setMap.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
