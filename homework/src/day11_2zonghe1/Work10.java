package day11_2zonghe1;

public class Work10 {

	public static int findMaxAndSwap() {
		int [] arr = new int[] {1, 3, 4, 3, 6};
		int max = arr[0];
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		if(index  != 0) {
			arr[0] = arr[index] + (arr[index] = arr[0])*0;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		

	}

}
