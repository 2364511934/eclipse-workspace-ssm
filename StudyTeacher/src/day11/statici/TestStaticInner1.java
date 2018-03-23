package day11.statici;
class School{
	static class WaterFountain{
		static int water = 56;
		public static void show() {
			System.out.println(water);
		}
		int water1 = 77;
		public void show1() {
			System.out.println(water1);
		}
	}
	public void display() {
		WaterFountain.show();//静态内部类中的静态成员，通过类名访问
		WaterFountain w = new WaterFountain();
		w.show1();//访问 非静态的成员 ，用静态内部类对象 调用
	}
}
public class TestStaticInner1 {

	public static void main(String[] args) {
		/*School s = new School();
		s.display();
		//创建 静态内部类对象 
		School.WaterFountain w = new School.WaterFountain();
		w.show1();//非静态的
		w.show();//静态的
		School.WaterFountain.show();//静态
*/	
		
		School.WaterFountain water = new School.WaterFountain();
		water.show1();
		water.show(); // 或者 School.WaterFountain.show(); // 静态方法
		
		
	}

}
