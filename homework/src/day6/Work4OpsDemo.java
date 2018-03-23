package day6;

public class Work4OpsDemo {

	public static void main(String[] args) {
		Work4Ops work4Ops = new Work4Ops();
		int n1 =200, n2 =30;
		System.out.println(work4Ops.calculation(n1, n2, "+"));
		System.out.println(work4Ops.calculation(n1, n2, "-"));
		System.out.println(work4Ops.calculation(n1, n2, "*"));
		System.out.println(work4Ops.calculation(n1, n2, "/"));

	}

}
