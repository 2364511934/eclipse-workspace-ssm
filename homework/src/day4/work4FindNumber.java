package day4;

import java.util.Random;

import javax.sql.rowset.spi.SyncFactoryException;

/**
 * 任务四： 能力提升
 * 将一个1-100之间的数不重复的存在一个长度为【98】的数组里，
 * 找到没有存入的数字。
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
					break; // 可以继续了
				}
			}
			
			
		}
		
	}

}
