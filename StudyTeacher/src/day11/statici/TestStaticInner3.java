package day11.statici;
class Outer{
	Outer(){
		System.out.println("outer");
	}
	int n = 55;
	public void show() {}
	class Inner{//实例内部类
		Inner(){
			System.out.println("Inner_base");
		}
	}
	static class InnerStatic{//静态内部类
		
	}
}
//顶级类  继承 实例成员内部类
class Demo1 extends Outer.Inner{
	Demo1(Outer o){
		o.super();//外部类对象.调用 父内部类构造
		System.out.println("Demo1_sub");
	}
}
//
class Demo2 extends Outer.InnerStatic{
	
}
public class TestStaticInner3 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Demo1 demo1 = new Demo1(o);
		Demo2 d2 = new Demo2();
	}

}
