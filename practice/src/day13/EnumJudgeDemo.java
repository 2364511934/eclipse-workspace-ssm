package day13;

import java.util.Scanner;

enum Sex{
	MAIL,FEMAIL,��,Ů;
}

public class EnumJudgeDemo {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("�������Ա�:");
		String str = scanner.next();
		Sex sex  = Sex.valueOf(str);
		
		switch(sex) {
		case ��:
		case MAIL: System.out.println("��"); break;
		case Ů:
		case FEMAIL: System.out.println("Ů"); break;
		default:System.out.println("���Ѳ�Ů"); break;
		}
		
		for(Sex s : Sex.values()) {
			System.out.println(s.ordinal());
			System.out.println(s.name());
			
		}
		

	}

}
