package day11_2zonghe1;

public class Work8 {

	public static int  encryption(int num) {
		if(num<1000 || num >9999) {
			System.out.println("不是一个四位数");
			return -1;
		}
		
		int[] arr = new int[4];
		int factor = 10*10*10*10;
		for(int i=0; i<arr.length; i++) {
			arr[0] = num / (factor/10);;
			num %=(factor/10);
			factor /=10;
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (arr[i] + 5)%10;
		}
		
		arr[0] = arr[3] + (arr[3] = arr[0])*0;
		arr[1] = arr[2] + (arr[2] = arr[1]*0);
		
		return arr[0]*1000 + arr[1]*100+arr[2]*10 + arr[3];
	}
	public static void main(String[] args) {
		System.out.println(encryption(2333));;

	}

}
