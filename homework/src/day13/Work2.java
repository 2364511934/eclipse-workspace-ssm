package day13;

import java.util.Scanner;

enum Season{
	SPRING,SUMBER,AUTUMN, WINTER, ��,��,��,��;
}

public class Work2 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner (System.in);
		System.out.print("�����봺���ﶬ:  ");
		String seasonString = scanner.next();
		Season s = Season.valueOf("SPRING");;
		try {
			s = Season.valueOf(seasonString);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
		
		switch(s) {
		case ��:
		case SPRING: System.out.println("��ů����"); break;
		case ��:
		case SUMBER: System.out.println("��������");break;
		case ��:
		case AUTUMN: System.out.println("�����ˬ");break;
		case ��:
		case WINTER: System.out.println("����ѩƮ");break;
		}

	}

}
