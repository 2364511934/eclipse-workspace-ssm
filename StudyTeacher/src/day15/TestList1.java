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
		// ��List���ϴ洢����������Ϣ
		List<Dog> dogs = new LinkedList<>();
		Dog wangwang = new Dog("����", "��ë");
		Dog wangcai = new Dog("����","��������");
		Dog meimei = new Dog("����", "������");
		dogs.add(wangwang);
		dogs.add(wangcai);
		dogs.add(meimei);
		//����
		//����
		//����
		dogs.sort(null);
		dogs.sort(null);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		dogs.forEach(System.out::println);
		//����
		dogs.sort((d1,d2)->d2.getAge()-d1.getAge());
		dogs.sort((d1,d2)->d2.getAge()-d1.getAge());
		dogs.forEach(System.out::println);
		//ɾ��
		dogs.remove(meimei);
		dogs.sort(null);
		dogs.sort(null);
		//����
		System.out.println(dogs.size());
		System.out.println(dogs.size());
		System.out.println(dogs.size());
	}

}
