package day5;

import java.util.Arrays;

/**
 * 
 * @author yn
 * 二分查找又称折半查找，优点是比较次数少，查找速度快，平均性能好，占用系统内存较少；
 * 其缺点是要求待查表为有序表，且插入删除困难。
 * 因此，折半查找方法适用于不经常变动而查找频繁的有序列表。
 * 首先，假设表中元素是按升序排列，将表中间位置记录的关键字与查找关键字比较，
 * 如果两者相等，则查找成功；否则利用中间位置记录将表分成前、后两个子表，
 * 如果中间位置记录的关键字大于查找关键字，则进一步查找前一子表，
 * 否则进一步查找后一子表。重复以上过程，直到找到满足条件的记录，
 * 使查找成功，或直到子表不存在为止，此时查找不成功
 *
 */

public class BisectionSearchAlgorithm {

	// 二分查找 方法抽象
	public static boolean BisectionSearch(int[] array, int key) {
		int start = 0;
		int end = array.length-1;
		int middle = (start + end)/2;
		boolean find = false;
		while(start <= end)
		{
			if(key > array[middle]) {
				start=middle+1;
				middle = (start + end)/2;
			}else if(key < array[middle])
			{
				end=middle-1;
				middle = (start + end)/2;
			}
			else
			{
				find = true;
				break;
			}
		}
		
		return find;
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		boolean find = false;
		// 先排序
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
		for(int ele:array)
		{
			find = BisectionSearch(array, ele);
			System.out.println("元素:" + (ele) + (find ? " 找到":" 未找到"));
		}
	}

}
