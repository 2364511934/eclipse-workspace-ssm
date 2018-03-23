package day11;

abstract class Animal{
	public abstract  void breed();
}


// ���蹦��
@FunctionalInterface
interface Play{
	void ply();
}

class Goose extends Animal{
	public void breed() {
		System.out.println("���㷱ֳ");
	}
	
	public void gooseFly(Play play) {
		play.ply();
	}

}

class Duck extends Animal{
	public void breed() {
		System.out.println("Ѽ�ӷ�ֳ");
	}
	
	public void swim() {
		System.out.println("Ѽ������Ӿ");
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
		goose.gooseFly(()->System.out.println("���蹦��"));
		goose.gooseFly(new Play() {

			@Override
			public void ply() {
				System.out.println(",,,,,,,,,,,,,,,���˰���������");
				
			}
			
		});
		
		TangDuck TangDuck = new TangDuck();
		TangDuck.TangSpeak(()->System.out.println("�ܽ���"));
		TangDuck.TangSpeak(new Say() {

			@Override
			public void speak() {
				System.out.println("����................................");
				
			}
			
		});
	}

}
