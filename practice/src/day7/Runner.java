package day7;

public class Runner {
	
	public Runner() {
		
	}
	public void startGame() {
		System.out.println("--------------------��ӭ������Ϸ����-----------------");
		System.out.println("**************************************************");
		System.out.println("*******************��ȭ��ʼ**************************");
		System.out.println("**************************************************");
		Game game = new Game();
		game.gameStart();
		game.CalResult();
		game.ShowResult();
	}
}
