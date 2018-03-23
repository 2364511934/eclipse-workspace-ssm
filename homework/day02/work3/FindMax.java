/**
* 要求：三个整数，求最大数。
* 知识点：分支语句
* @author:yn
* @version 1.0.0 2017-12-13
*/

import java.util.Scanner;
public class  FindMax
{
	public static void main(String[] args) 
	{
		int num1=0, num2=0, num3=0, max=0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		max = num1;

		if (max < num2)
		{
			max = num2;	
		}

		if (max < num3)
		{
			max = num3;
		}

		System.out.println("三个数字："+ num1 + " " + num2 + " " + num3 + " 最大的数为 " + max );
	}
}
