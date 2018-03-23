package day6;

/**
 * 
 * @author Administrator
 *
 */
public class Work4Ops {
	
	public int calculation(int n1,int n2, String operator) {
		switch(operator) {
		case "+": return add(n1, n2) ;
		case "-": return subtract(n1, n2) ;
		case "*": return multiply(n1, n2) ;
		case "/": return divide(n1, n2) ;
		default : return -1;
		}
	}
	
	private int add(int n1,int n2) {
		return n1+n2;
	}
	
	private int subtract (int n1,int n2) {
		return n1-n2;
	}
	private int multiply (int n1,int n2) {
		return n1*n2;
	}
	private int divide(int n1,int n2) {
		return n1/n2;
	}

}
