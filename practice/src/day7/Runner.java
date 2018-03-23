package day7;

public class Runner {
	
	public Runner() {
		
	}
	public void startGame() {
		System.out.println("--------------------欢迎进入游戏世界-----------------");
		System.out.println("**************************************************");
		System.out.println("*******************猜拳开始**************************");
		System.out.println("**************************************************");
		Game game = new Game();
		game.gameStart();
		game.CalResult();
		game.ShowResult();
	}
}
