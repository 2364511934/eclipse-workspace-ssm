package day6;
/**
 * 
 * @author Administrator
 *
 */
public class MathPractice {
	// 反转
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
	
	//是否是偶数
	public boolean isEven(int n) {
		return (n%2 == 0);
	}
	
	// 范围求和
	public int sum(int start, int end) {
		int sum = 0;
		
		for(int i=start; i<=end; i++){
			sum += i;
		}
		return sum;
	}
}
