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
		WaterFountain.show();//��̬�ڲ����еľ�̬��Ա��ͨ����������
		WaterFountain w = new WaterFountain();
		w.show1();//���� �Ǿ�̬�ĳ�Ա ���þ�̬�ڲ������ ����
	}
}
public class TestStaticInner1 {

	public static void main(String[] args) {
		/*School s = new School();
		s.display();
		//���� ��̬�ڲ������ 
		School.WaterFountain w = new School.WaterFountain();
		w.show1();//�Ǿ�̬��
		w.show();//��̬��
		School.WaterFountain.show();//��̬
*/	
		
		School.WaterFountain water = new School.WaterFountain();
		water.show1();
		water.show(); // ���� School.WaterFountain.show(); // ��̬����
		
		
	}

}
