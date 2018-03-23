package day8;

class Printer{
	private String name;
	public static String brand ="�ϱ���";
	static {
		System.out.println("brand:" + brand);
	}
	public Printer(String name) {
		this.name = name;
		System.out.println("public Printer(String name)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Context() {
		System.out.println("��ͨ:" + name);
	}
	
	public static void staticPrinter() {
		System.out.println("public static void staticPrinter()");
	}
}

class BlackPrinter extends Printer{
	public BlackPrinter(String name) {
		super(name);
		System.out.println("public BlackPrinter(String name)");
	}
	@Override
	public void Context() {
		System.out.println("�ڰ� : "+ getName());
	}
}

class ColorPrinter extends Printer{
	public static String brand2 ="�ϱ���";
	static {
		System.out.println("brand2:" + brand2);
	}
	public ColorPrinter(String name) {
		super(name);
		System.out.println("public ColorPrinter(String name)");
	}
	@Override
	public void Context() {
		System.out.println("��ɫ : "+ getName());
	}
	
	public static void staticPrinter() {
		System.out.println("ColorPrinter :static void staticPrinter()");
		
		Printer.staticPrinter();
	}
		
}


public class PrinterDemo {

	public static void main(String[] args) {
		//Printer printer = new Printer("��ͨ");
		//printer.Context();
		//BlackPrinter blackPrinter = new BlackPrinter("������");
		//blackPrinter.Context();
		ColorPrinter colorPrinter = new ColorPrinter("����");
		colorPrinter.Context();
		
		colorPrinter.staticPrinter();
		
		System.out.println(colorPrinter.getClass().getName());

	}
	


}
