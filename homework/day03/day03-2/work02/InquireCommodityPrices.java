/**
* ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ�� ��
*/
import java.util.Scanner;
public class InquireCommodityPrices 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String Commodity="";
		
		System.out.println("*********��Ʒ*****************");
		System.out.println("   1.T�� 2.����Ь 3.������   ");
		System.out.println("******************************");
		while(!Commodity.equals("n"))
		{
			System.out.print("��������Ʒ���");
			Commodity = input.next();
			switch(Commodity)
			{
				case "1": System.out.print("T��      ��245"); break;
				case "2": System.out.print("����Ь   ��570"); break;
				case "3": System.out.print("������   ��380"); break;
				default:  System.out.print("��Ч����!!!"); break;
			}
			System.out.print("\n�Ƿ����(y/n)");
			Commodity = input.next();
		}

		
		
	}
}
