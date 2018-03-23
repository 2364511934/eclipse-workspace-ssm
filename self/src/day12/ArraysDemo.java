package day12;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// 2017-12-18  第五天笔记
		int[] arr = {1, 10, 4, 5, 6, 7};
		int[] arr1 = new int[] {2, 4, 5, 65, 67, 4};
		// 将数组arr 内容打印出来  // [1, 3, 4, 5, 6, 7]
		System.out.println(Arrays.toString(arr));;
		// 排序
		Arrays.sort(arr);
		Arrays.parallelSort(arr);  // 排序
		System.out.println(Arrays.toString(arr));;
		// 找到返回索引值 否则返回 负数
		System.out.println(Arrays.binarySearch(arr, 9));
		// 逐个比较数组中的元素
		System.out.println(Arrays.equals(arr, arr1));
		// fill 填入相同的数 [10, 10, 10, 10, 10, 10]
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		//拷贝 创建新数组
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		Arrays.fill(arr, 11);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr2));
		

	}

}
