package day5;

/**
 *@author Administrator
 */
import java.util.Scanner;

/**
 * ���Գɼ���demo
 * @author Administrator
 *
 */
public class ScoreDemo {

	public static void main(String[] args) {
		Scanner superman = new Scanner(System.in);
		Score score = new Score();
		System.out.println("����javase �ĳɼ�:");
		score.javase = superman.nextInt();
		System.out.println("����c �ĳɼ�:");
		score.c = superman.nextInt();
		System.out.println("����db �ĳɼ�:");
		score.db = superman.nextInt();
		
		System.out.println("�ܷ�:"+score.sum());
		System.out.println("ƽ����:"+score.average());
		
		superman.close();
		
	}

}
