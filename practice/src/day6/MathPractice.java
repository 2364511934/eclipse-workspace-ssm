package day6;
/**
 * 
 * @author Administrator
 *
 */
public class MathPractice {
	// ��ת
	public int reverse(int n) {
		int reverseVal = 0;
		int sum =0;
	
		while(n>0)
		{
			reverseVal = (n % 10);
			sum = (sum*10 + reverseVal);
			n /=10;
		}
		return sum;
	}
	
	//�Ƿ���ż��
	public boolean isEven(int n) {
		return (n%2 == 0);
	}
	
	// ��Χ���
	public int sum(int start, int end) {
		int sum = 0;
		
		for(int i=start; i<=end; i++){
			sum += i;
		}
		return sum;
	}
}
