/**
* 任务三：写一个程序，由用户输入一个整数，
* 判断这个数是否是素数（素数：只能被1和本身整除的数）；
*/

import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数: ");
		int number = input.nextInt();
		boolean isPrime = true;
		for(int i=2; i<number; i++)
		{
			if (number%i == 0)
			{
				isPrime = false;
				break;
			}
		}

		if (isPrime)
		{
			System.out.println("素数");
		}
		else
		{
			System.out.println("不是素数");
		}

		
	}
}
