package day5;

import java.util.Arrays;

/**
 * 
 * @author yn
 * ���ֲ����ֳ��۰���ң��ŵ��ǱȽϴ����٣������ٶȿ죬ƽ�����ܺã�ռ��ϵͳ�ڴ���٣�
 * ��ȱ����Ҫ������Ϊ������Ҳ���ɾ�����ѡ�
 * ��ˣ��۰���ҷ��������ڲ������䶯������Ƶ���������б�
 * ���ȣ��������Ԫ���ǰ��������У������м�λ�ü�¼�Ĺؼ�������ҹؼ��ֱȽϣ�
 * ���������ȣ�����ҳɹ������������м�λ�ü�¼����ֳ�ǰ���������ӱ�
 * ����м�λ�ü�¼�Ĺؼ��ִ��ڲ��ҹؼ��֣����һ������ǰһ�ӱ�
 * �����һ�����Һ�һ�ӱ��ظ����Ϲ��̣�ֱ���ҵ����������ļ�¼��
 * ʹ���ҳɹ�����ֱ���ӱ�����Ϊֹ����ʱ���Ҳ��ɹ�
 *
 */

public class BisectionSearchAlgorithm {

	// ���ֲ��� ��������
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
		// ������
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
		for(int ele:array)
		{
			find = BisectionSearch(array, ele);
			System.out.println("Ԫ��:" + (ele) + (find ? " �ҵ�":" δ�ҵ�"));
		}
	}

}
