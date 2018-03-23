package day5;

/**
 *@author Administrator
 */
import java.util.Scanner;

/**
 * 测试成绩类demo
 * @author Administrator
 *
 */
public class ScoreDemo {

	public static void main(String[] args) {
		Scanner superman = new Scanner(System.in);
		Score score = new Score();
		System.out.println("输入javase 的成绩:");
		score.javase = superman.nextInt();
		System.out.println("输入c 的成绩:");
		score.c = superman.nextInt();
		System.out.println("输入db 的成绩:");
		score.db = superman.nextInt();
		
		System.out.println("总分:"+score.sum());
		System.out.println("平均分:"+score.average());
		
		superman.close();
		
	}

}
