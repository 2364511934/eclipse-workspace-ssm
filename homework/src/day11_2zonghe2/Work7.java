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
		System.out.println("汽车刹车");
	}
	@Override
	public void transport() {
		System.out.println("汽车运输");
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
		System.out.println("卡车刹车");
	}

	@Override
	public void transport() {
		System.out.println("卡车运输");
	}

	public void PullGoods() {
		System.out.println("卡车拉货");
	}
	
}


class BusTool extends CarTool{
	private int passengerCabin;
	
	public BusTool(int passengerVolume, int wheel, int passengerCabin) {
		super(passengerVolume, wheel);
		this.passengerCabin = passengerCabin;
	}

	public void announceStops() {
		System.out.println("公共汽车报站");
	}

	@Override
	public void stop() {
		System.out.println("公共汽车停止");
	}

	@Override
	public void transport() {
		System.out.println("公共汽车运输");
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
		System.out.println("飞机运输");
		
	}
	
}

public class Work7 {

	public static void main(String[] args) {
		Plane plane = new Plane(2200, 4);
		plane.testFly(()->System.out.println("飞机能飞"));

	}

}
