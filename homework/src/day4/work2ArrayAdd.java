package day4;

/**
 * 任务二： 两个5个数的数组，两个数组对应的元素相加后输出； 
 * 例如： 
 * 1,2,3,4,5 数组1 
 * 2,3,4,5,6 数组2 
 * 加后：3,5,7,9,11
 * 
 * @author Administrator
 *
 */
public class work2ArrayAdd {

	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3,4,5};
		int[] arr2=new int[] {2,3,4,5,6};
		int[] arr3=new int[5];
		
		for(int n:arr1){
			System.out.print(n+ " ");
		}
		System.out.println();
		for(int n:arr2){
			System.out.print(n+ " ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=arr1[i] + arr2[2];
		}
		for(int n:arr3){
			System.out.print(n+ " ");
		}
		System.out.println();
	}

}
