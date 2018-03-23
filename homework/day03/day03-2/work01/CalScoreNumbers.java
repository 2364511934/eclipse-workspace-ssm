/**
*
* 非固定次数循环while 和 do-while
任务一： 计算成绩和人数。 
由用户输入多个学员成绩，当输入-1时结束循环，
输出一共输入多少人，和输入的这些学员的总分数，不能把-1加进去。

*/
import java.util.Scanner;
class CalScoreNumbers
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int score = 0;
		int count = -1;
		int scoreTotal=0;
		
		while(score != -1)
		{
			count++;
			scoreTotal += score;
			System.out.println("请输入学员的成绩: -1 表示退出!");
			score = input.nextInt();
		}
		System.out.println("用户输入"+count+"多个学员, 总成绩:" + scoreTotal);
	}
}
