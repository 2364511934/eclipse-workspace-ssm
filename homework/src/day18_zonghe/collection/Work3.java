package day18_zonghe.collection;

import java.util.Scanner;

class OpsJoin {

	// 字符串是否可以转化为int
	public static boolean strToDouble(String str) {
		char[] chArr = str.toCharArray();
		for (char c : chArr) {
			if (!Character.isDigit(c) && c != '.') {
				return false;
			}
		}
		return true;
	}

	// 字符串是否可以转化为double
	public static boolean strToInt(String str) {
		char[] chArr = str.toCharArray();
		for (char c : chArr) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	// 字符串是否可以转化为String
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
			System.out.println("请输入二个数 随便什么都可以:");
			System.out.print("请输入 第一个数:");
			str1 = scanner.next();
			System.out.print("请输入 第二个数:");
			str2 = scanner.next();

			
			try {
				// 判断是否是整数
				if (OpsJoin.strToInt(str1) && OpsJoin.strToInt(str2)) {
					int i = opsJoin.join(Integer.valueOf(str1), Integer.valueOf(str2));
					System.out.println("结果是:" + i);
					break;
				}
				// 判断是否是浮点数
				if (OpsJoin.strToDouble(str1) && OpsJoin.strToDouble(str2)) {
					double d = opsJoin.join(Double.valueOf(str1), Double.valueOf(str2));
					System.out.println("结果是:" + d);
					break;
				}

				// 判断是否是字符串
				if (OpsJoin.strToString(str1) && OpsJoin.strToString(str2)) {
					String s = opsJoin.join(str1, str2);
					System.out.println("结果是:" + s);
					break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}

		scanner.close();

	}

}
