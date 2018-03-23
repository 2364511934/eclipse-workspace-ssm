import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner superman = new Scanner(System.in);
		int score;
		System.out.print("输入成绩：");
		score = superman.nextInt();//18
		if(score >= 90){
			System.out.println("优秀");
		}else if (score >= 80 ){
			System.out.println("良好");
		}else if (score >= 60 ){
			System.out.println("中等");
		}else{
			System.out.println("差");
		}

		System.out.println("…………分支后的其它代码……………………");

	}

}
