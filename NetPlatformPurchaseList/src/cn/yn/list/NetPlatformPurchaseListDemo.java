package cn.yn.list;

import java.util.Scanner;

public class NetPlatformPurchaseListDemo {

	public static void outputMenu(String[] item)
	{
		for(int i=0; i<item.length; i++)
		{
			System.out.println(item[i]);
		}
	}
	public static void main(String[] args) {
		String[] memu = {"0.��Ч����","1.���Ӳ�Ʒ","2.�鼮", "3.�Ҿ�", "4.�˳���һ��"};
		String[] book = {"0.��Ч����", "1.�������", "2.��ѧ��", "3.������","4.�˳���һ��"};
		String[] furniture= {"0.��Ч����", "1.�������", "2.��ѧ��", "3.������","4.�˳���һ��"};
		String[] electronicProduct= {"0.��Ч����", "1.�ֻ�", "2.IPAD", "3.�ƶ���Դ","4.�˳���һ��"};
		String[] computerBook= {"0.��Ч����","1.����ϵͳ","2.���ݽṹ", "3.���ģʽ", "4.�˳���һ��"};
		String[] literatureBook= {"0.��Ч����","1.���ڵ���","2.�������", "3.������", "4.�˳���һ��"};
		String[] Romance= {"0.��Ч����","1.��һ�����ܽӴ�","2.鿼���", "3.���Ǻ�", "4.�˳���һ��"};

		String [][][] menuTop = new String[5][][];
		String [][] memuSecond = new String[5][];
		String [] memuThird = new String[5];
		
		while(true)
		{
			boolean exit = false;
			if (exit)
			{
				break;
			}
			// ��ӡ�˵���
			outputMenu(memu);
			
			Scanner scancer = new Scanner(System.in);
			int number = scancer.nextInt();
			switch(number)
			{
			case 0:
			default: System.out.println("������������������:");break;
			case 1:
			// ���Ӳ�Ʒ 
			outputMenu(electronicProduct);
			break;
			// �鼮
			case 2:
				outputMenu(book);
				break;
			case 3:
			case 4:exit = true; break;
			}
		}
		

	}

}
