package day10;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("��ӭ����������:");
		int tryTimes = 3;
		boolean isSucess = false;

		for (int i = tryTimes-1; i >=0; i--) {
			System.out.print("�������û���: ");
			String name = scanner.next();
			System.out.print("����������: ");
			String pwd = scanner.next();

			if (name.equals("yn") && pwd.equals("123456")) {
				isSucess = true;
				break;
			} else {
				System.out.println("������󣡣� ������" + i+ "����");
				continue;
			}
		}

		if (isSucess)
			System.out.println("��¼�ɹ�!!!");
		else
			System.out.println("�Բ�����" + tryTimes + "���д���");

	}

}
