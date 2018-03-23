/**
* 任务二：  计算出输出结果。 
* 1+1/2!+1/3!+ …… 1/20!
* 使用double参考结果： 1.7182818284590455
* 提示：2！ 阶乘是 1*2 ；3！是1*2*3；4！是1*2*3*4
*
*/
public class  CalSum
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 0;
		int sumTemp = 1;
		double sumTotal= 0.0;
		for(i=1; i<=20; i++)
		{
			sumTemp = 1;
			for(j=1; j<=i; j++)
			{
				sumTemp *=j;
			}
			sumTotal +=((double)(1.0/sumTemp));
		}
		System.out.println("sumTotal:"+sumTotal);
	}
}
