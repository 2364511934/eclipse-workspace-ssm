/**
*
* 任务1：控制台输入一个正整数，判断是否能被5整除；(if-else)
*/
import java.util.Scanner;
public class Dive
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数:");
		int number = input.nextInt();
		
		if (number % 5 == 0)
		{
			System.out.println("可以被5整除");
		}
		else
		{
			System.out.println("不可以被5整除");
		}
	}
}

