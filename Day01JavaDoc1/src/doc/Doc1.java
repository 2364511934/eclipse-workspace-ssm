package doc;

import java.math.BigDecimal;

public class Doc1 {
	public static  void main(String[] args) {
		BigDecimal number1 = new BigDecimal("0.1");
		BigDecimal number2 = new BigDecimal("0.2");
		
		System.out.println(number1.add(number2));
		System.out.println(5.0/0);
		System.out.println(-5.0/0);
		System.out.println(0.0/0.0);
		//System.out.println(0/0);
		
		short n = 5;
		n += 5;
		System.out.println("n:" + n);
	}
}
