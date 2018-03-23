package day8;

import javax.sound.midi.Track;

class Car {
	public void driving() {
		System.out.println("汽车在行驶中...");
	}

	public void brake() {
		System.out.println("汽车正在刹车...");
	}
}

class Truck extends Car {
	
	@Override
	public void driving() {
		System.out.println("货车在行驶中...");
	}
	@Override
	public void brake() {
		System.out.println("货车在刹车...");
	}
	public void pullGoods() {
		System.out.println("正在拉货呢");
	}
	public void discharge() {
		System.out.println("正在卸货呢");
	}
}

class Bus extends Car {
	
	@Override
	public void driving() {
		System.out.println("妈的人好多啊,公交车在行驶，请勿与司机大哥说话...");
	}

	@Override
	public void brake() {
		System.out.println("坐稳扶好，公家车正在刹车中 ");
	}

	public void reportStation () {
		System.out.println("西直门站到了");
	}
	
	public void stopsStation () {
		System.out.println("请下车, 不要斜穿猛跑");
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
