

package day8;
class Pet{
	String name;
	public Pet(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("�Զ���");
	}
}
class Dog extends Pet{
	public Dog(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("�Թ�ͷ");
		System.out.println(this);
		System.out.println(this.getClass().getName());
	}
	public void run() {
		System.out.println("С������");
	}
}
class Cat extends Pet{
	public Cat(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("����");
		System.out.println(this);
		System.out.println(this.getClass().getName());
	}
	public void play() {
		System.out.println("Сè����");
	}
}
class PetHospital{
	// Pet pet = wangwang; Pet �� -  Dog �� ��������ת��
	//����  // Pet pet = wangwang; ->new Dog();
	public void treatmentPet(Pet pet) {
		System.out.println("����"+pet.name+"����");
		pet.eat();
	/*	pet.run();
		pet.play();*/
	}
}
public class TestPetHospital {
	public static void main(String[] args) {
		PetHospital hos = new PetHospital();//ҽԺ
		Dog wangwang = new Dog("����");
		Cat xiaohua = new Cat("С��");
		hos.treatmentPet(wangwang);//�� Dog���Ϳ���
		hos.treatmentPet(xiaohua);
		
		wangwang.eat();
		xiaohua.eat();
	}

}
