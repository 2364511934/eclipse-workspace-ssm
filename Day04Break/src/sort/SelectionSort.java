package sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 34, 2, 45, 343, 1, 56565, 222 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					arr[j] = arr[i] + (arr[i] = arr[j]) * 0;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
