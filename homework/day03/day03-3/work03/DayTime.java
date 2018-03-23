/**
*
* 输入一个时间（整数）,在6-10点之间，
* 输出“上午好”,在11-13点之间，输出“中午好”,
* 在14-18点之间，输出“下午好”,其他情况输出“休息时间”(多重if)
* 
*/
import java.util.Scanner;
public class DayTime
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个时间整数:");
		int time = input.nextInt();

		if (time >=6 && time <= 10)
		{
			System.out.println("上午好");
		}
		else if (time >=11 && time <= 13)
		{
			System.out.println("中午好");
		}
		else if (time >=141 && time <= 18)
		{
			System.out.println("下午好");
		}
		else
		{
			System.out.println("其他时间");
		}
	}
}

