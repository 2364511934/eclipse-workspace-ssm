package day5;

public class CatDemo {

	public static void main(String[] args) {
		Cat	persianCat = new Cat();
		Cat	russianBlueCat = new Cat();
		
		persianCat.name="¹ù¾¸";
		persianCat.variety="²¨Ë¹Ã¨";
		persianCat.run();
		persianCat.play();
		System.out.println(persianCat.talk());
		
		russianBlueCat.name="»ÆÈØ";
		russianBlueCat.variety="¶íÂÞË¹À¶Ã¨";
		russianBlueCat.run();
		russianBlueCat.play();
		System.out.println(russianBlueCat.talk());
		

	}

}
