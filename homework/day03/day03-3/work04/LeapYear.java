/**
*
* ѡ���⣺
*���������գ������������һ���еĵڼ��죬�ж�ƽ�������������
*ʹ��֪ʶ�㣺switch��ѭ����

*/
import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) 
	{
		double total = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.print("��������:");
		int year = input.nextInt();
		System.out.print("��������:");
		int month = input.nextInt();
		System.out.print("��������:");
		int day = input.nextInt();
		int days = 0;
		boolean leap = false;
		// �ж��Ƿ�������
		if (0 == year%400 || (0 == (year%4) && (0 != (year%100))))
		{
			leap = true;
		}
		else
		{
			leap = false;
		}

		for (int i=1; i<month; i++ )
		{
			switch(i)
			{
				case 1:case 3:case 5:case 7:case 8:case 10:case 12: days+=31;break;
				case 4:case 6:case 9:case 11: days+=30;break;
				case 2:days+= (leap ? 29 : 28); break;
			}
		}
		
		days+=day;
		
			
		System.out.println(year + "��" + month +"��" + day + "����һ���еĵ�"+ days + "��");
		
	}
}

