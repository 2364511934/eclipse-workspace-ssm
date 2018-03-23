package day18_zonghe.collection;

import java.util.Scanner;

class OpsJoin {

	// �ַ����Ƿ����ת��Ϊint
	public static boolean strToDouble(String str) {
		char[] chArr = str.toCharArray();
		for (char c : chArr) {
			if (!Character.isDigit(c) && c != '.') {
				return false;
			}
		}
		return true;
	}

	// �ַ����Ƿ����ת��Ϊdouble
	public static boolean strToInt(String str) {
		char[] chArr = str.toCharArray();
		for (char c : chArr) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	// �ַ����Ƿ����ת��ΪString
	public static boolean strToString(String str) {
		return true;
	}

	public int join(int num1, int num2) {
		return num1 + num2;
	}

	public double join(double num1, double num2) {
		return num1 + num2;
	}

	public String join(String num1, String num2) {
		return num1 + num2;
	}
}

public class Work3 {

	public static void main(String[] args) {
		OpsJoin opsJoin = new OpsJoin();
		Scanner scanner = new Scanner(System.in);
		String str1 = null;
		String str2 = null;
		while (true) {
			System.out.println("����������� ���ʲô������:");
			System.out.print("������ ��һ����:");
			str1 = scanner.next();
			System.out.print("������ �ڶ�����:");
			str2 = scanner.next();

			
			try {
				// �ж��Ƿ�������
				if (OpsJoin.strToInt(str1) && OpsJoin.strToInt(str2)) {
					int i = opsJoin.join(Integer.valueOf(str1), Integer.valueOf(str2));
					System.out.println("�����:" + i);
					break;
				}
				// �ж��Ƿ��Ǹ�����
				if (OpsJoin.strToDouble(str1) && OpsJoin.strToDouble(str2)) {
					double d = opsJoin.join(Double.valueOf(str1), Double.valueOf(str2));
					System.out.println("�����:" + d);
					break;
				}

				// �ж��Ƿ����ַ���
				if (OpsJoin.strToString(str1) && OpsJoin.strToString(str2)) {
					String s = opsJoin.join(str1, str2);
					System.out.println("�����:" + s);
					break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}

		scanner.close();

	}

}
