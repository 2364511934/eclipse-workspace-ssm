/**
*
* ����2������һ��0-6��������0��ʾ�����գ�
* �����Ӧ�����ڼ��������������ʾ���������󡯡�(switch)
*/
import java.util.Scanner;
public class Day
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������:");
		int day = input.nextInt();
		
		switch(day){
			case 0:System.out.println("������");break;
			case 1:System.out.println("����һ");break;
			case 2:System.out.println("���ڶ�");break;
			case 3:System.out.println("������");break;
			case 4:System.out.println("������");break;
			case 5:System.out.println("������");break;
			case 6:System.out.println("������");break;
			default: System.out.println("��������");break;
		}
	}
}

