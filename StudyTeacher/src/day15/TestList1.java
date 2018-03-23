package day15;

import java.util.LinkedList;
import java.util.List;
class Dog implements Comparable<Dog>{
	private String name;
	private String type;
	private int age;
	public int getAge() {
		return age;
	}
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"\t"+type+"\t"+age;
	}
	@Override
	public int compareTo(Dog o) {
		return this.age - o.age ;
	}	
}
public class TestList1 {
	public static void main(String[] args) {
		// 用List集合存储多条狗狗信息
		List<Dog> dogs = new LinkedList<>();
		Dog wangwang = new Dog("旺旺", "金毛");
		Dog wangcai = new Dog("旺财","拉布拉多");
		Dog meimei = new Dog("美美", "吉娃娃");
		dogs.add(wangwang);
		dogs.add(wangcai);
		dogs.add(meimei);
		//遍历
		//遍历
		//遍历
		dogs.sort(null);
		dogs.sort(null);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		//降序
		dogs.sort((d1,d2)->d2.getAge()-d1.getAge());
		dogs.sort((d1,d2)->d2.getAge()-d1.getAge());
		dogs.forEach(System.out::println);
		//删除
		dogs.remove(meimei);
		dogs.sort(null);
		dogs.sort(null);
		//个数
		System.out.println(dogs.size());
		System.out.println(dogs.size());
		System.out.println(dogs.size());
	}

}
