package day4;

/**
 * ����һ�� һ��5���������飬��ת�������Ԫ�أ� ���磺 33,1,4,67,8 ��ת�� 8,67,4,1,33
 *
 * @author Administrator
 *
 */

public class work1ArrayReverse {

	public static void main(String[] args) {
		int[] array = new int[] { 33, 1, 4, 67, 8 };
		for (int n : array) {
			System.out.print(n + ",");
		}
		System.out.println();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + ",");
		}
	}

}
