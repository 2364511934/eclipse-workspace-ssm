package day11.instance;
class Cat{//�ⲿ��
	private double weight;
	public Cat(double weight) {
		this.weight = weight;
	}
	
	class CatBody{//�ڲ���
		private String color;
		public CatBody(String color) {
			this.color = color;
		}
		public void show() {
			//�ڲ��� ����ֱ�ӷ����ⲿ��ĳ�Ա  Cat.this.weight 
			//�ڲ����� ������ һ���ⲿ�����  Cat.this
			System.out.println("��ɫ��"+color+","+weight);
			System.out.println("��ɫ��"+color+","+ Cat.this.weight);
		}
	}
	public void display() {
		System.out.println("������"+weight);
		//��ɫ  �ⲿ��  ����  �ڲ���ĳ�Ա  �ö������
		CatBody body = new CatBody("��ɫ");
		body.show();
	}
}
public class TestInner1 {
	public static void main(String[] args) {
	/*	Cat cat = new Cat(33.3);
		cat.display();
		//���� �� �ⲿ�� ������ ���� �ڲ���������� �ⲿ������
		Cat.CatBody body = cat.new CatBody("��ɫ");
		body.show();
		
		Cat.CatBody body1 = cat.new CatBody("ggg");
		body1.show();*/
		
		Cat cat = new Cat(33.3);
		cat.display();
		
		Cat.CatBody  body = cat.new CatBody("��ɫ");
		body.show();
		
		
	}

}
