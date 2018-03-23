package day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparable<Dog>{
	private String name;
	private String type;
	private int age;
	
	
	
	public Dog(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(Dog o) {
		
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
	
	
}



public class DogDemo {

	public static void main(String[] args) {
		Dog dog1 = new Dog("美美", "拉普拉多", 1);
		Dog dog2 = new Dog("亮亮", "金毛", 2);
		Dog dog3 = new Dog("欢欢", "松狮", 3);
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog3);
		dogList.add(dog2);
		dogList.add(dog1);
		
		dogList.sort(null);
		dogList.forEach(System.out::println);
		
		/*dogList.sort(new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				
				return o2.getAge()-o1.getAge();
			}
			
		});*/
		
		dogList.sort((o1, o2)-> {return o2.getAge()-o1.getAge();});
			

		
		
		System.out.println("*****************************");
		dogList.forEach(System.out::println);
		dogList.remove(dog1);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		dogList.forEach(System.out::println);
		
		

	}

}
