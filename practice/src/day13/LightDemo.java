package day13;


enum Light{
	RED,BLUE,YELLOW;
	public Light switchLight(Light light) {
		Light newLight = Light.valueOf("BLUE") ;
		switch(light) {
		case RED: newLight = Light.valueOf("BLUE"); break;
		case BLUE: newLight = Light.valueOf("YELLOW"); break;
		case YELLOW: newLight = Light.valueOf("RED"); break;
		}
		return newLight;
	}
}



public class LightDemo {

	public static void main(String[] args) {
		Light l =  Light.valueOf("BLUE");
		Light newLight = Light.valueOf("BLUE");;
		
		newLight = l.switchLight(l);
		System.out.println(newLight);
		newLight = newLight.switchLight(newLight);
		System.out.println(newLight);
		newLight = newLight.switchLight(newLight);
		System.out.println(newLight);

	}

}
