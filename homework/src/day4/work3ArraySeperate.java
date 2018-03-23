package day4;

public class work3ArraySeperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[] {1,2,3,4,5,6};
		int[] arr2=new int[3];
		int[] arr3=new int[3];
		
		for(int n:arr1){
			System.out.print(n+ " ");
		}
		System.out.println();
		
		for(int i=0; i<arr1.length; i++) {
			if (0 == i%2) {
				arr2[i/2] = arr1[i];
			}
			else {
				arr3[i/2] = arr1[i];
			}
		}
		for(int n:arr2){
			System.out.print(n+ " ");
		}
		System.out.println();
		for(int n:arr3){
			System.out.print(n+ " ");
		}
		System.out.println();
	}

}
