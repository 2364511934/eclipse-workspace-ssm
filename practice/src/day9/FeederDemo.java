package day9;

class Food{
	public void showFood() {
		System.out.println(" ≥ŒÔ");
	}
}

class Bone extends Food{

	@Override
	public void showFood() {
		System.out.println("π«Õ∑");
	}
}

class Fish extends Food{

	@Override
	public void showFood() {
		System.out.println("”„");
	}
}

class Animal{
	public void eat(Food food) {
		System.out.print("≥‘ :"); 
		food.showFood();
	}
}

class Dog extends Animal {

	@Override
	public void eat(Food food) {
		System.out.print("π∑≥‘ :"); 
		food.showFood();
	}
}

class Cat extends Animal{

	@Override
	public void eat(Food food) {
		System.out.print("√®≥‘ :"); 
		food.showFood();
	}
}

class Feeder{
	public void feed(Animal animal, Food food) {
		animal.eat(food);
	}	
}

public class FeederDemo {

	public static void main(String[] args) {
		Feeder feeder = new Feeder();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bone bone =new Bone();
		Fish fish = new Fish();
		
		feeder.feed(cat, fish);
		feeder.feed(dog, bone);
	}

}
