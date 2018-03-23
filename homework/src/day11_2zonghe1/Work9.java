package day11_2zonghe1;

public class Work9 {

	public static int findTimes(int num) {
		int count = 0;
		int [] arr = new int[] {1, 3, 4, 3, 6};
		for(int a: arr) {
			if(num == a) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(findTimes(3));

	}

}
