package day11_1;


class Car{
	private int seats;
	
	public Car(int seats) {
		this.seats = seats;
	}
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	class Wheel{
		private String color;
		private int numbers;
		
		public Wheel(String color, int numbers) {
			this.color = color;
			this.numbers = numbers;
		}
		public void show() {
			System.out.println("颜色: " + color + "\t车轮数目: " + numbers);
		}
		
	}
	public void showCarInfo() {
		new Wheel("黄色", 8).show();
		System.out.println("车座位:" + getSeats());
	}
}

public class Work1Car {

	public static void main(String[] args) {
		Car car = new Car(4);
		car.showCarInfo();
		Car.Wheel  wheel = car.new Wheel("黄色", 8);
		wheel.show();

	}

}
