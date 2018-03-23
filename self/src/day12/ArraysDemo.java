package day12;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// 2017-12-18  ������ʼ�
		int[] arr = {1, 10, 4, 5, 6, 7};
		int[] arr1 = new int[] {2, 4, 5, 65, 67, 4};
		// ������arr ���ݴ�ӡ����  // [1, 3, 4, 5, 6, 7]
		System.out.println(Arrays.toString(arr));;
		// ����
		Arrays.sort(arr);
		Arrays.parallelSort(arr);  // ����
		System.out.println(Arrays.toString(arr));;
		// �ҵ���������ֵ ���򷵻� ����
		System.out.println(Arrays.binarySearch(arr, 9));
		// ����Ƚ������е�Ԫ��
		System.out.println(Arrays.equals(arr, arr1));
		// fill ������ͬ���� [10, 10, 10, 10, 10, 10]
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		//���� ����������
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		Arrays.fill(arr, 11);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr2));
		

	}

}
