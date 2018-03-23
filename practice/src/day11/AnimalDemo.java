package day11;

abstract class Animal{
	public abstract  void breed();
}


// 飞翔功能
@FunctionalInterface
interface Play{
	void ply();
}

class Goose extends Animal{
	public void breed() {
		System.out.println("大雁繁殖");
	}
	
	public void gooseFly(Play play) {
		play.ply();
	}

}

class Duck extends Animal{
	public void breed() {
		System.out.println("鸭子繁殖");
	}
	
	public void swim() {
		System.out.println("鸭子能游泳");
	}
}

@FunctionalInterface
interface Say{
	void speak();
}

class TangDuck extends Duck{
	public void TangSpeak(Say say) {
		say.speak();
	}
}


/**
 * @author Administrator
 *
 */
public class AnimalDemo {

	public static void main(String[] args) {
		Goose goose = new Goose();
		goose.gooseFly(()->System.out.println("飞翔功能"));
		goose.gooseFly(new Play() {

			@Override
			public void ply() {
				System.out.println(",,,,,,,,,,,,,,,飞了啊啊啊啊啊");
				
			}
			
		});
		
		TangDuck TangDuck = new TangDuck();
		TangDuck.TangSpeak(()->System.out.println("能讲话"));
		TangDuck.TangSpeak(new Say() {

			@Override
			public void speak() {
				System.out.println("讲话................................");
				
			}
			
		});
	}

}
