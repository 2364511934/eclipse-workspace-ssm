import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner superman = new Scanner(System.in);
		int score;
		System.out.print("����ɼ���");
		score = superman.nextInt();// 18

		switch (score) {
		case 90:
			System.out.println("����");
			break;
		case 80:
			System.out.println("����");
			break;
		case 70:
			System.out.println("�е�");
			break;
		default:
			System.out.println("��");
			break;
		}
		
		System.out.println("����������֧����������롭��������������");

	}

}
