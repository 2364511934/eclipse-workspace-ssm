package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Penguin{
	private String name;
	
	public Penguin(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Penguin [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Work1 {

	public static void main(String[] args) {
		List<Penguin> penguinList = new ArrayList<>();
		Penguin penguin1 = new Penguin("企鹅1");
		Penguin penguin2 = new Penguin("企鹅2");
		Penguin penguin3 = new Penguin("企鹅3");
		Penguin penguin4 = new Penguin("企鹅4");
		penguinList.add(penguin1);
		penguinList.add(penguin2);
		penguinList.add(penguin3);
		penguinList.add(0, penguin4);
		
		System.out.println("企鹅数量:" + penguinList.size());
		
		System.out.println("使用get(i) 方式输出.....");
		for(int i =0; i<penguinList.size(); i++) {
			System.out.println(penguinList.get(i));
		}
		System.out.println("使用增强for 方式输出.....");
		for(Penguin p :penguinList) {
			System.out.println(p);
		}
		
		System.out.println("System.out::println 方式输出.....");
		penguinList.forEach(System.out::println);
		
		penguinList.remove(2);
		
		System.out.println("System.out::println 方式输出.....");
		penguinList.forEach(System.out::println);
		
		Iterator<Penguin> it = penguinList.iterator();
		
		System.out.println("Iterator<Penguin> 方式输出.....");
		while(it.hasNext()) {
			Penguin p = it.next();
			System.out.println(p);
		}
		
		ListIterator<Penguin> itList = penguinList.listIterator();
		
		System.out.println("ListIterator<Penguin> 方式输出.....");
		while(itList.hasNext()) {
			Penguin p = itList.next();
			System.out.println(p);
		}

	}

}
