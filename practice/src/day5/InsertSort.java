package day5;

import java.util.Arrays;

/**
 * 
 * @author yn
 * 插入排序demo实现
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] array = {3, 1, 2, 3, 7, 3, 4, 1, 3434, 2332, 2345,2332,6565,45454,768887,4545};
		
		// index i 是指要比较的元素
		for(int i=1; i<array.length; i++)	{
			// 依次比较i之前的元素
			for(int j=0; j<i; j++)
			{
				int temp = 0;
				// 如果发现 array[j] >array[i] ，
				// 则需要将 array[j] 与 array[i] 互换 并将[j, i-1]元素后移
				if(array[j] >array[i]) {
					// 暂时保存 array[i]
					temp = array[i];  
					// 将[j, i-1]向后移动一位 必须是倒序
					for(int k=i-1; k>=j; k--) {
						array[k+1] = array[k];
					}
					array[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
