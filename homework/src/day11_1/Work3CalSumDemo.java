package day11_1;

interface Commond{
	int process(int[] target);
}

class ProcessArray{
	int process(int[] target, Commond commond) {
		return commond.process(target);
	}
}
public class Work3CalSumDemo {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		ProcessArray processArray = new ProcessArray();
		sum = processArray.process(arr, new Commond() {
			@Override
			public int process(int[] target) {
				int sum = 0;
				for(int a : arr) {
					sum+=a;
				}
				return sum;
			}
			
		});
		
		System.out.println("数组总和: " + sum);
		
		sum = processArray.process(arr, (arr1)-> {
				int sum1 = 0;
				for(int a : arr1) {
					sum1+=a;
				}
				return sum1;
		});
	System.out.println("数组总和: " + sum);
	}
}
