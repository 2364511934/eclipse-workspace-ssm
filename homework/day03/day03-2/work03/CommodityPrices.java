/**
*
* �������������ܽ�����������
*/
import java.util.Scanner;
public class CommodityPrices 
{
	public static void main(String[] args) 
	{
		double total = 0.0;
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
				case "1": System.out.print("T��      ��245"); total+=245.0; break;
				case "2": System.out.print("����Ь   ��570"); total+=570.0;break;
				case "3": System.out.print("������   ��380"); total+=380.0;break;
				default:  System.out.print("��Ч����!!!"); break;
			}
			System.out.print("\n�Ƿ����(y/n)");
			Commodity = input.next();
		}
			
		System.out.println("�ܽ��Ϊ: " + total);
		
	}
}

