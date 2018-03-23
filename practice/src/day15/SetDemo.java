package day15;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Random  random= new Random ();
		int value = 0;
		while(true) {
			//value = (random.nextInt(30)+1);
			value = (int)(Math.random()*(30-1+1)+1);
			set.add(value);
			if(set.size() == 7) {
				break;
			}
		}
		
		set.forEach((s)->System.out.print(s+" "));
		//set.forEach(System.out::println);

	}

}
