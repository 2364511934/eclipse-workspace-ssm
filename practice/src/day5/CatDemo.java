package day5;

public class CatDemo {

	public static void main(String[] args) {
		Cat	persianCat = new Cat();
		Cat	russianBlueCat = new Cat();
		
		persianCat.name="����";
		persianCat.variety="��˹è";
		persianCat.run();
		persianCat.play();
		System.out.println(persianCat.talk());
		
		russianBlueCat.name="����";
		russianBlueCat.variety="����˹��è";
		russianBlueCat.run();
		russianBlueCat.play();
		System.out.println(russianBlueCat.talk());
		

	}

}
