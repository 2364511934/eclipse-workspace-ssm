package day7;

import java.util.Scanner;

/**
 * 游戏类
 * @author Administrator
 *
 */
public class Game {
	private User user;
	private Computer computer;
	private int numberMatches;
	private int battleTimes;
	private boolean userVictory;
	
	// 开始游戏
	public void gameStart() {
		System.out.println("出拳规则 1.剪刀 2.石头 3.布");
		user =  new User();
		user.chooseRole();
		computer = new Computer();
		computer.chooseRole();
		System.out.println("请出拳 出拳规则 1.剪刀 2.石头 3.布(输相应 数字)");
		
		
		System.out.println("要开始吗？ (y/n)");
		Scanner scanner = new Scanner(System.in);
		String start = scanner.next();
		if(start.equals("n")) {
			return;
		}
		
		
		String con;
		int userTricks = 0; 
		int computerTricks = 0; 
	
		do {
			System.out.println("用户请出拳: ");
			userTricks = user.Punches();
			computerTricks = computer.Punches();
			
			System.out.println("(用户) " + user.getName()+" 出拳: "+(userTricks == 1 ? "剪刀" : (userTricks == 2 ? "石头": "布" )));
			System.out.println("(电脑) "+computer.getName()+" 出拳: "+(userTricks == 1 ? "剪刀" : (userTricks == 2 ? "石头": "布" )));
			
			
			if(userTricks == 1 && 2 == computerTricks ||
			   userTricks == 2 && 3 == computerTricks ||
			   userTricks == 3 && 2 == computerTricks) {
				// 用户输 
				computer.addScore();
			}
			else if(userTricks == computerTricks)
			{
				// 平局
			}
			else
			{
				// 电脑输
				user.addScore();
			}
			
			battleTimes++;
			
			System.out.println("是否继续?(y/n)");
			con = scanner.next();
		}while(con.equals("y"));
		
		
		
	}
	
	// 计算结果
	public void CalResult() {
		userVictory = (user.getScore() > computer.getScore());
	}
	
	// 显示结果
	public void ShowResult() {
		System.out.println("一共对决次数:"+ battleTimes);
		System.out.println("用户赢了 :" + user.getScore() + "次");
		System.out.println("电脑赢了 :" + computer.getScore() + "次");
		System.out.println("平局 :" + (battleTimes - user.getScore()- computer.getScore()) + "次");
		//System.out.println("用户"+ (userVictory ? "胜利" : "失败"));
	}
	
}
