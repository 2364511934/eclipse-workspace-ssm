/**
* Ҫ���������������������
* ֪ʶ�㣺��֧���
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
		System.out.println("��������������:");
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

		System.out.println("�������֣�"+ num1 + " " + num2 + " " + num3 + " ������Ϊ " + max );
	}
}
