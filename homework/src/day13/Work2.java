package day13;

import java.util.Scanner;

enum Season{
	SPRING,SUMBER,AUTUMN, WINTER, ´º,ÏÄ,Çï,¶¬;
}

public class Work2 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner (System.in);
		System.out.print("ÇëÊäÈë´ºÏÄÇï¶¬:  ");
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
		case ´º:
		case SPRING: System.out.println("´ºÅ¯»¨¿ª"); break;
		case ÏÄ:
		case SUMBER: System.out.println("ÏÄÈÕÑ×Ñ×");break;
		case Çï:
		case AUTUMN: System.out.println("Çï¸ßÆøË¬");break;
		case ¶¬:
		case WINTER: System.out.println("¶¬ÈÕÑ©Æ®");break;
		}

	}

}
