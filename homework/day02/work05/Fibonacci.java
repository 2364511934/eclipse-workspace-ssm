/**
* Ҫ��ʵ��쳲���������
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
		System.out.println("������쳲�����������(��1��ʼ):");
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

		System.out.println("����:"+index + "����" + sum);
	}
}
