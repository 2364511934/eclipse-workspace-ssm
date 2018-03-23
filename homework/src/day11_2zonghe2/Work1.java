package day11_2zonghe2;


class TestString{
	public int testNumbers(int num) {
		String str = Integer.toString(num, 10);
		return str.length();
	}
	
	public void  printReverseString(int num) {
		StringBuffer strbuf = new StringBuffer(Integer.toString(num, 10));
		strbuf.reverse();
		System.out.println(strbuf.toString());
	}
}

public class Work1 {

	public static void main(String[] args) {
		int num  = 12345678;
		TestString testString = new TestString();
		System.out.println(testString.testNumbers(num));
		testString.printReverseString(num);

	}

}
