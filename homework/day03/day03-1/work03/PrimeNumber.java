/**
* ��������дһ���������û�����һ��������
* �ж�������Ƿ���������������ֻ�ܱ�1�ͱ���������������
*/

import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����: ");
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
			System.out.println("����");
		}
		else
		{
			System.out.println("��������");
		}

		
	}
}
