package day11_2zonghe1;




public class Work1 {

	public static void show() {
		int n1 = 2;
		int n2 = 1;
		int temp = 0;
		for(int i =0; i<10; i++) {
			System.out.println(n1+"/"+n2);
			temp = n1;
			n1 = n1+n2;   
			n2 = temp;   
		}
	}
	
	public static void main(String[] args) {
		show();

	}

}
