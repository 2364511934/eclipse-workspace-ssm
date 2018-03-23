import java.math.BigInteger;

public class BigInter {

	public static void main(String[] args) {
		int i = 1;
		BigInteger sum = new BigInteger("1");
		while(i<100) {
			sum = sum.multiply(BigInteger.valueOf(i));
			i++;
		}
		System.out.println(sum);

	}

}
