/**
* 要求：三个整数，升序排序。
* 知识点：分支语句
* @author : yn
* @version : 1.0.0 2017-12-13
*/
import java.util.Scanner;
public class  SortInt
{
	public static void main(String[] args) 
	{
		int num1=0, num2=0, num3=0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		// num1 最大
		if (num2 < num1 && num1 > num3)
		{

			if (num2 > num3)
			{
				// num3 < num2 < num1
				System.out.println("排序后:" + num3 + " " + num2 + " " + num1);
			}
			else
			{
				// num2< num3 < num1
				System.out.println("排序后:" + num2 + " " + num3 + " " + num1);
			}
			
		}
		// num2 最大
		else if (num1 < num2 && num2 > num3)
		{
			if (num1 > num3)
			{
				// num3 < num1 < num2
				System.out.println("排序后:" + num3 + " " + num1 + " " + num2);
			}
			else
			{
				// num1 < num3 < num2
				System.out.println("排序后:" + num1 + " " + num3 + " " + num2);
			}
		}
		// num3 最大
		else 
		{
			if (num1 > num2)
			{
				// num2 <  num1 < num3
				System.out.println("排序后:" + num2 + " " + num1 + " " + num3);
			}
			else
			{
				// num1 < num2 <num3
				System.out.println("排序后:" + num1 + " " + num2 + " " + num3);
			}
		}

		
	}
}
