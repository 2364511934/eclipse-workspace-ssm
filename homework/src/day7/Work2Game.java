package day7;

import java.util.Random;
import java.util.Scanner;

public class Work2Game {
	private Work2Person[] group;
	private int numbers = 5;

	public Work2Game() {
		group = new Work2Person[5];
		group[0] = new Work2Person("����");
		group[1] = new Work2Person("����");
		group[2] = new Work2Person("����");
		group[3] = new Work2Person("����");
		group[4] = new Work2Person("����");
	}
	// ��ʼ��Ϸ
	public void startGame() {
		Random random = new Random();
		int n = 0;
		Scanner intput = new Scanner(System.in);
		
		System.out.println("�Ƿ�齱 (y/n)");
		String lottery = intput.next();
		
		while(lottery.equals("y")) {
			n = random.nextInt(5);
			System.out.println(group[n].getName() + "�н���");
			System.out.println("�Ƿ�齱 (y/n)");
			lottery = intput.next();
		}
		
		System.out.println("��Ϸ����!!!");
		intput.close();
	}
	
}
