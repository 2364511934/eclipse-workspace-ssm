package day7;

import java.util.Scanner;

/**
 * 猜拳游戏用户类
 * @author Administrator
 *
 */
public class User {
	private String name;
	private int score;
	
	public User() {
		
	}

	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void addScore() {
		this.score++;
	}
	
	public void chooseRole() {
		System.out.println("请为自己选择角色 1.吸血鬼 2.狼人 3.变形金刚");
		Scanner scanner = new Scanner(System.in);
		int role = scanner.nextInt();
		switch(role) {
		case 1: name ="吸血鬼";break;
		case 2: name="狼人";break;
		case 3: name="变形金刚";break;
		default: name="变形金刚";break;
		}	
		System.out.println("用户选择的角色是:" + name);
	}
	
	public int Punches() {
		int tricks = 0;
		Scanner scanner = new Scanner(System.in);
		tricks = scanner.nextInt();
		return tricks;
	}
}
