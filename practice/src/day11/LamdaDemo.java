package day11;

@FunctionalInterface
interface InfoArray{
	int[] reverse(int[] arr);
}

class ArrayImpl{
	public void display(int[] arr, InfoArray infoArray ) {
		int[] arrNew = infoArray.reverse(arr);

		for(int a:arrNew) {
			System.out.print(a+",");
		}
		System.out.print("\n");
	}
}

public class LamdaDemo {

	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 5, 3, 4};
		
		ArrayImpl arrayImpl = new ArrayImpl();
		arrayImpl.display(arr, new InfoArray() {
			@Override
			public int[] reverse(int[] arr) {
				int[] arrNew = new int[arr.length];
				for(int i=arr.length-1, j=0; i>=0; i--, j++) {
					arrNew[j] = arr[i];
				}
				return  arrNew;
			}
		});
		
		//  arr1 ������arr ��ͬ ���򱨴�
		arrayImpl.display(arr, (arr1)->{
			int[] arrNew = new int[arr1.length];
			for(int i=arr.length-1, j=0; i>=0; i--, j++) {
				arrNew[j] = arr[i];
			}
			return  arrNew;
		});
	}

}
