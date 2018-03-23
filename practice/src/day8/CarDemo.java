package day8;

class Engin{
	
	public Engin() {
		System.out.println("public Engin()");
	}
	public void start() {
		System.out.println("����");
	}
	public void stop() {
		System.out.println("ֹͣ");
	}
}

class Wheel{
	int capacity = 200;
	public void inflate() {
		System.out.println("����");
	}
}

class Window{
	public void roolUp() {
		System.out.println("���𳵴�");
	}
	public void roolDown() {
		System.out.println("���³���");
	}
}

class Door{
	public Window window = new Window();
	
	public void open() {
		System.out.println("��");
	}
	public void close() {
		System.out.println("��");
	}
}


class Car {
	public Engin engin = new Engin();
	public Wheel[] wheelArray= new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel() };
	public Door[] door=new Door[] {new Door(), new Door()};
	
	public void run() {
		System.out.println("����������");
	}
	
}


public class CarDemo {

	public static void main(String[] args) {
		Car car = new Car();
		car.engin.start();
		car.door[0].window.roolUp();
		car.door[1].window.roolUp();
		
		car.wheelArray[0].inflate();
		car.wheelArray[1].inflate();
		car.wheelArray[2].inflate();
		car.wheelArray[3].inflate();
		car.run();
		car.engin.stop();
	}

}
