package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {34, 2, 45, 343, 1, 56565, 222};
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					arr[j+1]=arr[j]+(arr[j]=arr[j+1])*0;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
