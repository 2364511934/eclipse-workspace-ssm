/**
*
* 任务2：输入一个0-6的整数，0表示星期日，
* 输出相应的星期几，输入错误则提示‘输入有误’。(switch)
*/
import java.util.Scanner;
public class Day
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数:");
		int day = input.nextInt();
		
		switch(day){
			case 0:System.out.println("星期日");break;
			case 1:System.out.println("星期一");break;
			case 2:System.out.println("星期二");break;
			case 3:System.out.println("星期三");break;
			case 4:System.out.println("星期四");break;
			case 5:System.out.println("星期五");break;
			case 6:System.out.println("星期六");break;
			default: System.out.println("输入有误");break;
		}
	}
}

