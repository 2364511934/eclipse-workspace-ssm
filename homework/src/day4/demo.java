package day4;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int count =0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					if(i!=j && i!=k && j !=k) {
						System.out.print(arr[i]);
						System.out.print(arr[j]);
						System.out.print(arr[k]);
						System.out.println();
						count++;
					}	
				}
				
			}
		}
		System.out.println(count);
		
	}

}
