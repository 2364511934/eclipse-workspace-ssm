package day7;

import java.util.Random;
import java.util.Scanner;

/**
 * ��ȭ��Ϸ�������
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
		case 1: name ="��Ѫ��";break;
		case 2: name="����";break;
		case 3: name="���ν��";break;
		}
		System.out.println("����ѡ��Ľ�ɫ��:" + name);
	}
	
	public int Punches() {
		int tricks = 0;
		Random Random = new Random();
		tricks = Random.nextInt(3)+1;
		return tricks;
	}
}
