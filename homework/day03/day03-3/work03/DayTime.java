/**
*
* ����һ��ʱ�䣨������,��6-10��֮�䣬
* ���������á�,��11-13��֮�䣬���������á�,
* ��14-18��֮�䣬���������á�,��������������Ϣʱ�䡱(����if)
* 
*/
import java.util.Scanner;
public class DayTime
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ʱ������:");
		int time = input.nextInt();

		if (time >=6 && time <= 10)
		{
			System.out.println("�����");
		}
		else if (time >=11 && time <= 13)
		{
			System.out.println("�����");
		}
		else if (time >=141 && time <= 18)
		{
			System.out.println("�����");
		}
		else
		{
			System.out.println("����ʱ��");
		}
	}
}

