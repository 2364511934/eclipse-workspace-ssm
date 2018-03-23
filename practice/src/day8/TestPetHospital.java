

package day8;
class Pet{
	String name;
	public Pet(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("吃东西");
	}
}
class Dog extends Pet{
	public Dog(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("吃骨头");
		System.out.println(this);
		System.out.println(this.getClass().getName());
	}
	public void run() {
		System.out.println("小狗跑了");
	}
}
class Cat extends Pet{
	public Cat(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("吃鱼");
		System.out.println(this);
		System.out.println(this.getClass().getName());
	}
	public void play() {
		System.out.println("小猫跑了");
	}
}
class PetHospital{
	// Pet pet = wangwang; Pet 父 -  Dog 子 向上类型转换
	//看病  // Pet pet = wangwang; ->new Dog();
	public void treatmentPet(Pet pet) {
		System.out.println("给："+pet.name+"看病");
		pet.eat();
	/*	pet.run();
		pet.play();*/
	}
}
public class TestPetHospital {
	public static void main(String[] args) {
		PetHospital hos = new PetHospital();//医院
		Dog wangwang = new Dog("旺旺");
		Cat xiaohua = new Cat("小花");
		hos.treatmentPet(wangwang);//给 Dog类型看病
		hos.treatmentPet(xiaohua);
		
		wangwang.eat();
		xiaohua.eat();
	}

}
