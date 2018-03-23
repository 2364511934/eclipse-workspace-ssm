package day7;
//import day6.Base1;


class Dummy{
	Dummy(){
		System.out.println("Dummy()");
	}
}

class Dummy2{
	Dummy2(){
		System.out.println("Dummy2()");
	}
}

class Base {
	final  Dummy dummy = new Dummy();
	 Dummy2 dummy2 = new Dummy2();
	
	
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
	}
	String name;
	public Number show() {
		return null;
	}
}
class Father1 extends Base{
	String addr;
	// Integer 是 Number 的子类 可以允许
	public Integer show() {
		return null;
	}
}

public class Father1Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father1 f1 = new Father1();
		f1.addr = null;
		f1.name = null;
		f1.show();
	}

}
