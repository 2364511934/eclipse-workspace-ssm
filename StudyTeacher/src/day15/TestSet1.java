package day15;

import java.util.HashSet;
import java.util.Set;
/**
 * @author Administrator
 *
 */
class Person{
	private int no;
	private String name;
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
		// TODO Auto-generated method stub
		return no+","+name;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+no;
	}
	@Override
	public boolean equals(Object obj) {
		//this   
		//obj
		int a = 0;
		Person per = (Person)obj;
		return this.no == per.no && this.name.equals(per.name) ? true :false;
	}
	
}
public class TestSet1 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>(); 
		Person guo = new Person(11, "xiaoguo");
		Person huang = new Person(11,"xiaoguo");
		Person yang = new Person(22,"xiaoyang");
		set.add(guo);
		set.add(huang);
		set.add(yang);
		set.forEach(System.out::println);
		
		//Set 
/*		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
//		set.forEach(System.out::println);
		set.add("aa");
		set.forEach(System.out::println);*/

	}

}
