/**
*
* ����1������̨����һ�����������ж��Ƿ��ܱ�5������(if-else)
*/
import java.util.Scanner;
public class Dive
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������:");
		int number = input.nextInt();
		
		if (number % 5 == 0)
		{
			System.out.println("���Ա�5����");
		}
		else
		{
			System.out.println("�����Ա�5����");
		}
	}
}

