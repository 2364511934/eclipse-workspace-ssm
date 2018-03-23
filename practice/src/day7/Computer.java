package day7;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜拳游戏计算机类
 * @author Administrator
 *
 */
public class Computer {
	private String name;
	private int score;
	
	public Computer() {
		
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
		Random Random = new Random();
		int role = Random.nextInt(3)+1;
		switch(role) {
		case 1: name ="吸血鬼";break;
		case 2: name="狼人";break;
		case 3: name="变形金刚";break;
		}
		System.out.println("电脑选择的角色是:" + name);
	}
	
	public int Punches() {
		int tricks = 0;
		Random Random = new Random();
		tricks = Random.nextInt(3)+1;
		return tricks;
	}
}
