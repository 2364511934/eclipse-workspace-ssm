/**
* 任务四：能力提升题
* 求和。S = n+nn+nnn+nnnn+……的值。
* 要求控制台输入要加的数n和加的个数 .
* 例如：
*/

import java.util.Scanner;
public class CalNSum
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一数字: ");
		int number = input.nextInt();
		System.out.print("请输入个数: ");
		int count = input.nextInt();
		int temp=0;
		int sum=0;
		

		for(int i=0; i<count; i++)
		{
			temp = (number+temp*10);  
			sum+=temp;
		}
		System.out.println("sum :" + sum);
	}
}
