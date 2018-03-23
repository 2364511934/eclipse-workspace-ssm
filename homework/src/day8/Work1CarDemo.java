package day8;

import javax.sound.midi.Track;

class Car {
	public void driving() {
		System.out.println("��������ʻ��...");
	}

	public void brake() {
		System.out.println("��������ɲ��...");
	}
}

class Truck extends Car {
	
	@Override
	public void driving() {
		System.out.println("��������ʻ��...");
	}
	@Override
	public void brake() {
		System.out.println("������ɲ��...");
	}
	public void pullGoods() {
		System.out.println("����������");
	}
	public void discharge() {
		System.out.println("����ж����");
	}
}

class Bus extends Car {
	
	@Override
	public void driving() {
		System.out.println("����˺öడ,����������ʻ��������˾�����˵��...");
	}

	@Override
	public void brake() {
		System.out.println("���ȷ��ã����ҳ�����ɲ���� ");
	}

	public void reportStation () {
		System.out.println("��ֱ��վ����");
	}
	
	public void stopsStation () {
		System.out.println("���³�, ��Ҫб������");
	}

}

public class Work1CarDemo {

	public static void main(String[] args) {
		Car car = new Car();
		car.driving();
		car.brake();
		
		Bus bus = new Bus();
		bus.driving();
		bus.brake();
		bus.reportStation();
		bus.stopsStation();
		
		Truck truck = new Truck();
		truck.driving();
		truck.brake();
		truck.pullGoods();
		truck.discharge();
		

	}

}
