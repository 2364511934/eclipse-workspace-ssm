package day4;

import java.util.Random;

import javax.sql.rowset.spi.SyncFactoryException;

/**
 * �����ģ� ��������
 * ��һ��1-100֮��������ظ��Ĵ���һ������Ϊ��98���������
 * �ҵ�û�д�������֡�
 *
 * @author Administrator
 *
 */

public class work4FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] array = new int[98];
		int n = 0;
		boolean find = false;
		for(int i=0; i<array.length; ) {
			while(true)
			{
				n = random.nextInt(101);
				if(0 == n) n = 1;
				for(int j=0; j<=i; i++) {
					if(n ==array[i]) {
						find = true;
						System.out.println();
						break;
					}
				}
				
				if(find){
					continue;
				}
				else{
					array[++i] = n;
					break; // ���Լ�����
				}
			}
			
			
		}
		
	}

}
