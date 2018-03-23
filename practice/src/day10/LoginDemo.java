package day10;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("欢迎来到新世界:");
		int tryTimes = 3;
		boolean isSucess = false;

		for (int i = tryTimes-1; i >=0; i--) {
			System.out.print("请输入用户名: ");
			String name = scanner.next();
			System.out.print("请输入密码: ");
			String pwd = scanner.next();

			if (name.equals("yn") && pwd.equals("123456")) {
				isSucess = true;
				break;
			} else {
				System.out.println("输入错误！！ 您还有" + i+ "机会");
				continue;
			}
		}

		if (isSucess)
			System.out.println("登录成功!!!");
		else
			System.out.println("对不起，您" + tryTimes + "均有错误");

	}

}
