package day5;

import java.util.Arrays;

/**
 * 
 * @author yn
 * ��������demoʵ��
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] array = {3, 1, 2, 3, 7, 3, 4, 1, 3434, 2332, 2345,2332,6565,45454,768887,4545};
		
		// index i ��ָҪ�Ƚϵ�Ԫ��
		for(int i=1; i<array.length; i++)	{
			// ���αȽ�i֮ǰ��Ԫ��
			for(int j=0; j<i; j++)
			{
				int temp = 0;
				// ������� array[j] >array[i] ��
				// ����Ҫ�� array[j] �� array[i] ���� ����[j, i-1]Ԫ�غ���
				if(array[j] >array[i]) {
					// ��ʱ���� array[i]
					temp = array[i];  
					// ��[j, i-1]����ƶ�һλ �����ǵ���
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
