package day11_2zonghe2;

interface Vehicle{
	void start();
	void stop();
}

class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("���г�  ��ʼ");
		
	}

	@Override
	public void stop() {
		System.out.println("���г�  ����");
		
	}
	
}

class Bus implements Vehicle{

	@Override
	public void start() {
		System.out.println(" ���ҳ�  ��ʼ");
		
	}

	@Override
	public void stop() {
		System.out.println("������  ����");
		
	}

}

public class Work4 {

	public static void main(String[] args) {
		Vehicle bus = new Bus ();
		Vehicle bike = new Bike ();
		bus.start();
		bus.start();
		bike.start();
		bike.stop();

	}

}
