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



	// ����һ�������
	private int createRadome(int from, int to) {
		Random random = new Random();
		return random.nextInt(30)+1;
	}
	
	// ����7������� 
	private int createSevenRandom() {
		while(true) {
			int num = createRadome(1, 30);
			int i=0;
			for(; i<randomNumber.length && randomNumber[i] != 0 ; i++) {
				// ���ظ�
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
	
	// ƥ���ַ�����
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
		System.out.println("������һ������:");
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
		case 7: System.out.println("һ�Ƚ�"); break;
		case 6: System.out.println("���Ƚ�"); break;
		case 5: System.out.println("���Ƚ�"); break;
		default:System.out.println("û�н�"); break;
		}
		
		

	}

}
