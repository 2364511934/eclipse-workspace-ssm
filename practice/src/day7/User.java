package day7;

import java.util.Scanner;

/**
 * ��ȭ��Ϸ�û���
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
		System.out.println("��Ϊ�Լ�ѡ���ɫ 1.��Ѫ�� 2.���� 3.���ν��");
		Scanner scanner = new Scanner(System.in);
		int role = scanner.nextInt();
		switch(role) {
		case 1: name ="��Ѫ��";break;
		case 2: name="����";break;
		case 3: name="���ν��";break;
		default: name="���ν��";break;
		}	
		System.out.println("�û�ѡ��Ľ�ɫ��:" + name);
	}
	
	public int Punches() {
		int tricks = 0;
		Scanner scanner = new Scanner(System.in);
		tricks = scanner.nextInt();
		return tricks;
	}
}
