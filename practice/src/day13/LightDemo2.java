package day13;


enum Light2{
	RED{
		Light2 Switch() {
			 return BLUE;
		 }
	},BLUE{
		Light2 Switch() {
			 return YELLOW;
		 }
	},YELLOW{
		Light2 Switch() {
			 return RED;
		 }
	};
	
	abstract Light2 Switch();
}




public class LightDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
