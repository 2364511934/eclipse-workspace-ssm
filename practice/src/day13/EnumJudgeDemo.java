package day13;

import java.util.Scanner;

enum Sex{
	MAIL,FEMAIL,男,女;
}

public class EnumJudgeDemo {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("请输入性别:");
		String str = scanner.next();
		Sex sex  = Sex.valueOf(str);
		
		switch(sex) {
		case 男:
		case MAIL: System.out.println("男"); break;
		case 女:
		case FEMAIL: System.out.println("女"); break;
		default:System.out.println("不难不女"); break;
		}
		
		for(Sex s : Sex.values()) {
			System.out.println(s.ordinal());
			System.out.println(s.name());
			
		}
		

	}

}
