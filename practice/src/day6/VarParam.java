package day6;

import java.util.Arrays;

public class VarParam {

	public static void varParam(int ...a) {
		System.out.println(a.length);
		for(int i =0; i<a.length; i++) {
			a[i] = 11;
		}
		System.err.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5, 6};
		
		varParam(array);
		System.err.println(Arrays.toString(array));
		
		varParam(1, 2, 3, 4, 4, 5, 6);
		
		/*varParam(new int[] {9,8,8,7,6,5,4,3,2});
		varParam();
		varParam(1);
		varParam(1, 2, 3, 4, 4, 5, 6);*/

	}

}
