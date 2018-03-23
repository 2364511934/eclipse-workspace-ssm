import java.text.DecimalFormat;

import javax.sound.midi.Soundbank;

public class Break {

	public static void main(String[] args) {
		double sum = 20.43534343;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(sum));

		label: for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				if (i == 4 && j == 7) {
					System.out.println("i==4 && j==7");
					continue label;
				}
				System.out.println("i:" + i + " j:" + j);
			}
		}
		
		int[] n1, n2, n3;
		n1 = new int[4];
		n2 = new int[5];
		n3 = new int[6];
		
		int m1[], m2, m3;
		m1 = new int[5];
		m2 = 56;
		m3 = 45;
		
		System.out.println(m2);
		System.out.println(m3);
		
		int[] arr3 = new int[] {10, 30, 456};
		System.out.println(arr3);
		System.out.println(arr3.length);
		
		float[] arr4 = new float[] {10.0F, 30.77F, 456.88F};
		System.out.println(arr4);
		System.out.println(arr4.length);
	
		for(int i:arr3) {
			System.out.println(i);
		}
		
	}

}
