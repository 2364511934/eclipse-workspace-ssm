/**
* Ҫ��������������������
* ֪ʶ�㣺��֧���
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
		System.out.println("��������������:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		// num1 ���
		if (num2 < num1 && num1 > num3)
		{

			if (num2 > num3)
			{
				// num3 < num2 < num1
				System.out.println("�����:" + num3 + " " + num2 + " " + num1);
			}
			else
			{
				// num2< num3 < num1
				System.out.println("�����:" + num2 + " " + num3 + " " + num1);
			}
			
		}
		// num2 ���
		else if (num1 < num2 && num2 > num3)
		{
			if (num1 > num3)
			{
				// num3 < num1 < num2
				System.out.println("�����:" + num3 + " " + num1 + " " + num2);
			}
			else
			{
				// num1 < num3 < num2
				System.out.println("�����:" + num1 + " " + num3 + " " + num2);
			}
		}
		// num3 ���
		else 
		{
			if (num1 > num2)
			{
				// num2 <  num1 < num3
				System.out.println("�����:" + num2 + " " + num1 + " " + num3);
			}
			else
			{
				// num1 < num2 <num3
				System.out.println("�����:" + num1 + " " + num2 + " " + num3);
			}
		}

		
	}
}
