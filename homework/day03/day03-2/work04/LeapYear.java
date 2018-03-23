/**
*
* 选做题：
*输入年月日，输出此日期是一年中的第几天，判断平年和闰年的情况。
*使用知识点：switch、循环。

*/
import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) 
	{
		double total = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年:");
		int year = input.nextInt();
		System.out.print("请输入月:");
		int month = input.nextInt();
		System.out.print("请输入日:");
		int day = input.nextInt();
		int days = 0;
		boolean leap = false;
		// 判断是否是瑞年
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
		
			
		System.out.println(year + "年" + month +"月" + day + "日是一年中的第"+ days + "天");
		
	}
}

