package day7;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner  input = new Scanner(System.in);
		int num = 0;
		int r = random.nextInt(10);
		boolean guess = false;
		int count = 0;
		for(int i=0; i<5; i++, count++) {
			System.err.println("����[1 ~9] ֮�������:");
			num = input.nextInt();
			
			if(num < r) {
				System.out.println("̫С��");
			}else if(num > r) {
				System.out.println("̫����");
			}
			else {
				
				guess = true;
				break;
			}
		}
		if(guess) {
			if(count <=3) {
				System.out.println("��̫������");
			}
			else
			{
				System.out.println("������");
			}
			
		}
		else
		{
			System.out.println("��̫����");
		}
		
	}

}
