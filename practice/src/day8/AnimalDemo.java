package day8;

class Animal{
	public void HeartBeat() {
		System.out.println("putengputeng...");
	}
}

class Wolf extends Animal{
	
	@Override
	public void HeartBeat() {
		super.HeartBeat();
		System.out.println("��ÿ��������10��/s");
	}

	public void run() {
		System.out.println("running");
	}
}

class Bird extends Animal{
	
	@Override
	public void HeartBeat() {
		
		super.HeartBeat();
		System.out.println("��ÿ��������100��/s");
	}

	public void fly() {
		System.out.println("flying");
	}
}


public class AnimalDemo {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.HeartBeat();
		
		Bird bird = new Bird();
		bird.HeartBeat();

	}

}
