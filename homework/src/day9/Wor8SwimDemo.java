package day9;

interface Swim{
	String name = "游泳接口";  // 默认是final static 
	void swim();
}

class Fish implements Swim{
	
	@Override
	public void swim() {
		System.out.println("鱼在游泳...");
		System.out.println(name);
	}
}



class Person implements Swim{
	@Override
	public void swim() {
		System.out.println("人在游泳...");
		
	}
}

class Submarine implements Swim{
	@Override
	public void swim() {
		System.out.println("潜水艇在游泳...");
		
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
