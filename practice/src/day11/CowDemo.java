package day11;


class Cow{
	private double height;
	private double weight;
	
	public Cow(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	class CowLeg{
		private String color;
		private double length;
		
		public CowLeg(String color, double length) {
			this.color = color;
			this.length = length;
		}

		public void showCowLeg() {
			System.out.println("颜色: "+ color + "长度:" +length);
			System.out.println(Cow.this.height + Cow.this.weight);
		}
	}
	
	public void showCow() {
		System.out.println("高度：" + height + "重量:" + weight);
		CowLeg leg = new  CowLeg("黄色", 1.2);
		leg.showCowLeg();
		
		
	}
}

public class CowDemo {
	public static void main(String[] args) {
		Cow cow = new Cow(3.9, 3443.9);
		cow.showCow();
		
		//Cow.CowLeg leg = cow.new CowLeg("黄色", 1.3);
	}
}
