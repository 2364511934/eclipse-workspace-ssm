import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner superman = new Scanner(System.in);
		int score;
		System.out.print("����ɼ���");
		score = superman.nextInt();//18
		if(score >= 90){
			System.out.println("����");
		}else if (score >= 80 ){
			System.out.println("����");
		}else if (score >= 60 ){
			System.out.println("�е�");
		}else{
			System.out.println("��");
		}

		System.out.println("����������֧����������롭��������������");

	}

}
