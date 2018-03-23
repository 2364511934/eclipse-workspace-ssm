package day6;

public class ReverseNumber {

	// 将一个数字反转后输出
	public static int reverseNumber(int n) {
		int sum = 0;
		while(n>0) {
			// 每次sum值*10 
			sum = sum*10 + n%10;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 123456789;
		n = reverseNumber(n);
		System.out.println(n);

	}

}
