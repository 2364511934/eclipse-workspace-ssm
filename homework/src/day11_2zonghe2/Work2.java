package day11_2zonghe2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Lottery{
	int [] randomNumber = new int[7];
	
	public Lottery() {
		createSevenRandom();
	}
	
	

	public int[] getRandomNumber() {
		return randomNumber;
	}



	public void setRandomNumber(int[] randomNumber) {
		this.randomNumber = randomNumber;
	}



	// 产生一个随机数
	private int createRadome(int from, int to) {
		Random random = new Random();
		return random.nextInt(30)+1;
	}
	
	// 产生7个随机数 
	private int createSevenRandom() {
		while(true) {
			int num = createRadome(1, 30);
			int i=0;
			for(; i<randomNumber.length && randomNumber[i] != 0 ; i++) {
				// 有重复
				if(num == randomNumber[i]) {
					break;
				}
			}
			
			if(i != randomNumber.length && 0 == randomNumber[i]) {
				randomNumber[i] = num;
				continue;
			}
			
			if(i == randomNumber.length ) {
				break;
			}
		}
		
		return 0;
	}
	
	// 匹配字符个数
	public int matchNumbers(int[] userArray) {
		int count = 0;
		for(int i=0; i<userArray.length; i++) {
			for(int j=0; j<randomNumber.length; j++) {
				if(userArray[i] == randomNumber[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	public void show(int[] userArray) {
		System.out.println(Arrays.toString(userArray));
		
	}
	
}

public class Work2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一组数字:");
		String str = scanner.nextLine();
		String [] strArray = str.split(" ");
		int[] intArray= new int[7];
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		
		Lottery lottery = new Lottery();
		
		lottery.show(intArray);
		lottery.show(lottery.getRandomNumber());
		
		int number = lottery.matchNumbers(intArray);
		switch(number) {
		case 7: System.out.println("一等奖"); break;
		case 6: System.out.println("二等奖"); break;
		case 5: System.out.println("三等奖"); break;
		default:System.out.println("没中奖"); break;
		}
		
		

	}

}
