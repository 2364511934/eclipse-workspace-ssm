package day11_2zonghe2;

class ClassRoom{
	private int lenth, width;
	
	public ClassRoom(int lenth, int width) {
		this.lenth = lenth;
		this.width = width;
	}
	
	class Desk{
		private int legs, height;
		
		public Desk(int legs, int height) {
			this.legs = legs;
			this.height = height;
		}
		
		public void show() {
			System.out.println("��������:" + legs + "\t�߶�:" + height);
		}
	}
	
	public void show() {
		System.out.println("��ʦ����:" + lenth + "\t���" + width);
		new Desk(4, 33).show();
	}
}

public class Work6 {

	public static void main(String[] args) {
		ClassRoom classRoom = new ClassRoom(12, 4353);
		classRoom.show();
		ClassRoom.Desk desk = classRoom.new Desk(23, 45);
		desk.show();

	}

}
