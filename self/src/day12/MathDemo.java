package day12;

public class MathDemo {

	public static void main(String[] args) {
		// 2017-12-20 ������ʼ�
		// ����ȡ���� 224.0
		System.out.println(Math.ceil(223.77));
		// ����ȡ���� 223
		System.out.println(Math.floor(223.77));
		// ���������� 223
		System.out.println(Math.round(223.37));
		// ���������� 224
		System.out.println(Math.round(223.57));
		// ָ����ʽ 2^3.1 8.574187700290345
		System.out.println(Math.pow(2, 3.1));
		// ���С�� 0~1 ֮������С�� 0.3318025612038309 [0.0, 1.0) ������ 1.0
		System.out.println(Math.random());
		// ���� 20 ~30 ֮�������� [20 ~30] [(int)(Math.random()*(���ֵ-��Сֵ+1)+��Сֵ)
		System.out.println((int)(Math.random()*(30-20+1)+20));


	}

}
