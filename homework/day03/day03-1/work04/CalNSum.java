/**
* �����ģ�����������
* ��͡�S = n+nn+nnn+nnnn+������ֵ��
* Ҫ�����̨����Ҫ�ӵ���n�ͼӵĸ��� .
* ���磺
*/

import java.util.Scanner;
public class CalNSum
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����: ");
		int number = input.nextInt();
		System.out.print("���������: ");
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
