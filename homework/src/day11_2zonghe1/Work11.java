package day11_2zonghe1;

public class Work11 {
	public static int output(int[][] int2Array) {
		int sum =0;
		for(int i=0; i<int2Array.length; i++) {
			for(int j = 0; j<int2Array[i].length; j++) {
				if(i == j) {
					sum += int2Array[i][j];
				}
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		int[][] intArray=  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println("对角线之和: " +output(intArray));
	}

}
