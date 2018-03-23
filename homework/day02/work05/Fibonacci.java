/**
* 要求：实现斐波那契序列
* @author : yn
* @version :1.0.0 2017-12-13
*/
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args) 
	{
		int index = 1;
		int sum = 0;
		int lastSum = 0;
		int lastLastSum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入斐波那契数索引(从1开始):");
		index = input.nextInt();

		sum = 0;
		lastSum = 1;
		lastLastSum = 0;

		for(int i=2; i<=index; i++)
		{
			sum = lastSum + lastLastSum;
			lastLastSum = lastSum;
			lastSum = sum;
			
		}

		System.out.println("索引:"+index + "等于" + sum);
	}
}
