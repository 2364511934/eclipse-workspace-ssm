/**
* 任务一：输出1-100之间的奇数和 
*/

public class  OddSum
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i=1; i<=100; i++)
		{
			if(i%2 == 1)
			{
				sum+=i;
			}
		}
		System.out.println("sum: " + sum);
	}
}
