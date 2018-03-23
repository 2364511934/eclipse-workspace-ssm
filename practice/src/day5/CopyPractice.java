package day5;

import java.util.Arrays;
/**
 * 
 * @author Administrator
 *
 */
public class CopyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1, 2, 3, 4, 5,6};
		int[] a2 = new int[a1.length];
		
		
		Arrays.sort(a1);
		
		System.arraycopy(a1, 0, a2, 0, a1.length);
		
		int[] a3 = Arrays.copyOf(a1, 3);
		
		System.out.println(Arrays.toString(a3));
		
		int[][] a4 = {{1, 2}, {2, 3}, {4,5}};
	}

}
