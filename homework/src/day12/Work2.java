package day12;

class MyException2 extends RuntimeException {
	private String str;

	
	public MyException2(String str) {
		this.str = str;
	}


	@Override
	public String toString() {
		return str+":ֻ���Ǻ졢�ơ���";
	}
	
	
}

class Color{
	private String color;

	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		switch(color) {
		case "��":
		case "��":
		case "��":this.color = color;
			default: throw new MyException2("�׳��쳣");
		}
	}
	
	
}

public class Work2 {

	public static void main(String[] args) {
		Color color = new Color();
		try {
			color.setColor("��");
		}catch(MyException2 my) {
			System.out.println(my.toString());
		}
		

	}

}
