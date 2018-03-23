package homework.homework3.for2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   for(int i = 1; i <= 5; i++){
			   for(int j = 1; j <= 5-i; j++){
				   System.out.print(" ");
			   }
			   for(int k = 1; k <= 2*i-1; k++){
				   if(k == 1 || k == 2*i-1){
					   System.out.print("*");
				   }else{
					   System.out.print(" ");
				   }
			   }
			   System.out.println();
		   }
		   for(int i = 1; i <= 4; i++){
			   for(int j = 1; j <= i; j++){
				   System.out.print(" ");
			   }
			   for(int k = 1; k <= 9-2*i; k++){
				   
				   if(k == 1 || k == 9-2*i){
					   System.out.print("*");
				   }else{
					   System.out.print(" ");
				   }
			   }
			   System.out.println();
		   }
	}

}
