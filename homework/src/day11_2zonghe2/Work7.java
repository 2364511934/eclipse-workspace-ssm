package day11_2zonghe2;

abstract class VehicleTool{
	private int PassengerVolume;
	
	public VehicleTool(int passengerVolume) {
		PassengerVolume = passengerVolume;
	}

	public abstract void  transport();
}


class CarTool extends VehicleTool{
	private int wheel;
	
	public CarTool(int passengerVolume, int wheel) {
		super(passengerVolume);
		this.wheel = wheel;
	}
	public void stop() {
		System.out.println("����ɲ��");
	}
	@Override
	public void transport() {
		System.out.println("��������");
	}
	
}

class Truck extends CarTool{
	private int Cargo;
	
	public Truck(int passengerVolume, int wheel, int cargo) {
		super(passengerVolume, wheel);
		Cargo = cargo;
	}

	@Override
	public void stop() {
		System.out.println("����ɲ��");
	}

	@Override
	public void transport() {
		System.out.println("��������");
	}

	public void PullGoods() {
		System.out.println("��������");
	}
	
}


class BusTool extends CarTool{
	private int passengerCabin;
	
	public BusTool(int passengerVolume, int wheel, int passengerCabin) {
		super(passengerVolume, wheel);
		this.passengerCabin = passengerCabin;
	}

	public void announceStops() {
		System.out.println("����������վ");
	}

	@Override
	public void stop() {
		System.out.println("��������ֹͣ");
	}

	@Override
	public void transport() {
		System.out.println("������������");
	}
	
}

interface IFly{
	void fly();
}

class Plane extends VehicleTool {
//class Plane extends VehicleTool implements  IFly{
	private int Wing;

	public Plane(int passengerVolume, int wing) {
		super(passengerVolume);
		Wing = wing;
	}

	public void testFly(IFly ifly) {
		ifly.fly();
	}
	

	@Override
	public void transport() {
		System.out.println("�ɻ�����");
		
	}
	
}

public class Work7 {

	public static void main(String[] args) {
		Plane plane = new Plane(2200, 4);
		plane.testFly(()->System.out.println("�ɻ��ܷ�"));

	}

}
