/**
* 要求：判断平年和闰年。
* 闰年：能被4整除但不能被100整除或者能被400整除。
* 知识点：条件运算符。
* @author:yn
* @version:1.0.0 2017-12-13
*/
import java.util.Scanner;
public class  FlatLeapYear
{
	public static void main(String[] args) 
	{
		int year = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份:");
		year = input.nextInt();
		boolean leapYear = false;
		leapYear = year %4 == 0 && year %100 !=0 || year % 400 == 0 ? true:false;
		System.out.println(year+"是" + (leapYear ? "闰年" : "平年"));
	}
}
