package day11_2zonghe1;

public class Work7 {
	public static void printStar() {
		for(int i=0; i<4;i++) {
			for(int j=0; j<7; j++) {
				if(j==6 && (i ==0 || i == 3)) {
					continue;
				}
				if((i == 1 || i== 2) && (j ==2 || j == 3 || j==4 )) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		printStar();

	}

}
