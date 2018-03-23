package day11_2zonghe2;


interface Eat{
	void eat(Food f);
}

abstract class Animal implements Eat{
	public abstract void eat(Food f);
}

class Dog extends Animal{
	public void eat(Food f) {
		
	}
}

class Cat extends Animal{
	public void eat(Food f) {
		
	}
}


abstract class Food{
	
}

class Fish extends Food{
	String fish;
}


class Bone extends Food{
	String bode;
}


class Feeder{
	public void feed(Food food,  Eat eat) {
		eat.eat(food);
	}
}




public class Work8 {

	public static void main(String[] args) {
		Eat dog = new Dog();
		Food fish = new Fish();
		Feeder feeder = new Feeder();
		feeder.feed(fish, dog);
	}

}
