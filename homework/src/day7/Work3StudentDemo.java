package day7;

public class Work3StudentDemo {

	public static void main(String[] args) {
		Work3Student  a = new Work3Student("a");
		Work3Student  b = new Work3Student("b");
		Work3Student  c = new Work3Student("c");
		/*
		 * (2)	��дMain���main������ʵ����3��ѧ������a,b,c ��a��1��ˮ����2�Σ�b��1��ˮ��
		 *      ���꣬�ֽ�һ�Σ�c��1�Σ���7�Σ�����ÿ���˲�����Ҫ��ѯһ�Ρ��۲��ӡ�����ע���ܽᡣ
		 */
		a.receiveWater();
		System.out.println("��ˮ����ˮ��ʣ:" + Work3Student.getDrinkingFountains());
		a.drink();
		System.out.println(a.getName() +":��ʣ:" + a.getWater());
		a.drink();
		System.out.println(a.getName() +":��ʣ:" + a.getWater());
		b.receiveWater();
		System.out.println("��ˮ����ˮ��ʣ:" + Work3Student.getDrinkingFountains());
		while(b.drink()>0) {
			System.out.println(b.getName() +":��ʣ:" + b.getWater());
		}
		b.receiveWater();
		System.out.println("��ˮ����ˮ��ʣ:" + Work3Student.getDrinkingFountains());
		c.receiveWater();
		System.out.println("��ˮ����ˮ��ʣ:" + Work3Student.getDrinkingFountains());
		for(int i=0; i<7; i++) {
			c.drink();
			System.out.println(c.getName() +":��ʣ:" + c.getWater());
		}
		System.out.println("��ˮ����ˮ��ʣ:" + Work3Student.getDrinkingFountains());
	}

}
