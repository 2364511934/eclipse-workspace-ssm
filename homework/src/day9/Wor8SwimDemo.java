package day9;

interface Swim{
	String name = "��Ӿ�ӿ�";  // Ĭ����final static 
	void swim();
}

class Fish implements Swim{
	
	@Override
	public void swim() {
		System.out.println("������Ӿ...");
		System.out.println(name);
	}
}



class Person implements Swim{
	@Override
	public void swim() {
		System.out.println("������Ӿ...");
		
	}
}

class Submarine implements Swim{
	@Override
	public void swim() {
		System.out.println("Ǳˮͧ����Ӿ...");
		
	}
}



public class Wor8SwimDemo {

	public static void main(String[] args) {
		Submarine submarine = new Submarine();
		submarine.swim();
		Person person  = new Person();
		person.swim();
		Fish fish = new Fish();
		fish.swim();

	}

}
