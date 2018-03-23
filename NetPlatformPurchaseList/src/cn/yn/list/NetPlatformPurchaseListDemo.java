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
		String[] memu = {"0.无效输入","1.电子产品","2.书籍", "3.家具", "4.退出上一级"};
		String[] book = {"0.无效输入", "1.计算机类", "2.文学类", "3.言情类","4.退出上一级"};
		String[] furniture= {"0.无效输入", "1.计算机类", "2.文学类", "3.言情类","4.退出上一级"};
		String[] electronicProduct= {"0.无效输入", "1.手机", "2.IPAD", "3.移动电源","4.退出上一级"};
		String[] computerBook= {"0.无效输入","1.操作系统","2.数据结构", "3.设计模式", "4.退出上一级"};
		String[] literatureBook= {"0.无效输入","1.国内的书","2.国外的书", "3.近代书", "4.退出上一级"};
		String[] Romance= {"0.无效输入","1.第一次亲密接触","2.榭寄生", "3.蔡智恒", "4.退出上一级"};

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
			// 打印菜单项
			outputMenu(memu);
			
			Scanner scancer = new Scanner(System.in);
			int number = scancer.nextInt();
			switch(number)
			{
			case 0:
			default: System.out.println("输入有误请重新输入:");break;
			case 1:
			// 电子产品 
			outputMenu(electronicProduct);
			break;
			// 书籍
			case 2:
				outputMenu(book);
				break;
			case 3:
			case 4:exit = true; break;
			}
		}
		

	}

}
