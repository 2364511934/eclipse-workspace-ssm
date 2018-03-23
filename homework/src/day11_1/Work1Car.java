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
			System.out.println("��ɫ: " + color + "\t������Ŀ: " + numbers);
		}
		
	}
	public void showCarInfo() {
		new Wheel("��ɫ", 8).show();
		System.out.println("����λ:" + getSeats());
	}
}

public class Work1Car {

	public static void main(String[] args) {
		Car car = new Car(4);
		car.showCarInfo();
		Car.Wheel  wheel = car.new Wheel("��ɫ", 8);
		wheel.show();

	}

}
