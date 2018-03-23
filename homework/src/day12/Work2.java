package day12;

class MyException2 extends RuntimeException {
	private String str;

	
	public MyException2(String str) {
		this.str = str;
	}


	@Override
	public String toString() {
		return str+":Ö»ÄÜÊÇºì¡¢»Æ¡¢À¶";
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
		case "ºì":
		case "»Æ":
		case "À¶":this.color = color;
			default: throw new MyException2("Å×³öÒì³£");
		}
	}
	
	
}

public class Work2 {

	public static void main(String[] args) {
		Color color = new Color();
		try {
			color.setColor("ÂÌ");
		}catch(MyException2 my) {
			System.out.println(my.toString());
		}
		

	}

}
