package day6;

public class ReverseNumber {

	// ��һ�����ַ�ת�����
	public static int reverseNumber(int n) {
		int sum = 0;
		while(n>0) {
			// ÿ��sumֵ*10 
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
