import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner superman = new Scanner(System.in);
		int score;
		System.out.print("输入成绩：");
		score = superman.nextInt();// 18

		switch (score) {
		case 90:
			System.out.println("优秀");
			break;
		case 80:
			System.out.println("良好");
			break;
		case 70:
			System.out.println("中等");
			break;
		default:
			System.out.println("差");
			break;
		}
		
		System.out.println("…………分支后的其它代码……………………");

	}

}
