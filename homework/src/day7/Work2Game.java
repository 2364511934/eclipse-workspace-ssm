package day7;

import java.util.Random;
import java.util.Scanner;

public class Work2Game {
	private Work2Person[] group;
	private int numbers = 5;

	public Work2Game() {
		group = new Work2Person[5];
		group[0] = new Work2Person("张三");
		group[1] = new Work2Person("李四");
		group[2] = new Work2Person("王五");
		group[3] = new Work2Person("赵六");
		group[4] = new Work2Person("周七");
	}
	// 开始游戏
	public void startGame() {
		Random random = new Random();
		int n = 0;
		Scanner intput = new Scanner(System.in);
		
		System.out.println("是否抽奖 (y/n)");
		String lottery = intput.next();
		
		while(lottery.equals("y")) {
			n = random.nextInt(5);
			System.out.println(group[n].getName() + "中奖了");
			System.out.println("是否抽奖 (y/n)");
			lottery = intput.next();
		}
		
		System.out.println("游戏结束!!!");
		intput.close();
	}
	
}
