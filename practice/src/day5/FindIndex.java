package day5;

/**
 * 
 * @author Administrator
 *
 */
public class FindIndex {

	public static void main(String[] args) {
	
		int[] arr= {3, 45, 56, 56,566};
		int index = -1;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]  == 56)
			{
				index = i;
				break;
			}
		}
		
		if (-1 == index)
		{
			System.out.println("not find");
		}
		else
		{
			System.out.println("Êý¾Ý :" + arr[index]);
		}
		
		int [][] score= new int[][] {{1, 2, 3},{4,5,6},{7,8,9}};
		int sum = 0;
		for(int[] a : score)
		{
			for(int b:a)
			{
				sum+=b;
			}
		}
		System.out.println(sum);
		
	}

}
