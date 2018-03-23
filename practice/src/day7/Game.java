package day7;

import java.util.Scanner;

/**
 * ��Ϸ��
 * @author Administrator
 *
 */
public class Game {
	private User user;
	private Computer computer;
	private int numberMatches;
	private int battleTimes;
	private boolean userVictory;
	
	// ��ʼ��Ϸ
	public void gameStart() {
		System.out.println("��ȭ���� 1.���� 2.ʯͷ 3.��");
		user =  new User();
		user.chooseRole();
		computer = new Computer();
		computer.chooseRole();
		System.out.println("���ȭ ��ȭ���� 1.���� 2.ʯͷ 3.��(����Ӧ ����)");
		
		
		System.out.println("Ҫ��ʼ�� (y/n)");
		Scanner scanner = new Scanner(System.in);
		String start = scanner.next();
		if(start.equals("n")) {
			return;
		}
		
		
		String con;
		int userTricks = 0; 
		int computerTricks = 0; 
	
		do {
			System.out.println("�û����ȭ: ");
			userTricks = user.Punches();
			computerTricks = computer.Punches();
			
			System.out.println("(�û�) " + user.getName()+" ��ȭ: "+(userTricks == 1 ? "����" : (userTricks == 2 ? "ʯͷ": "��" )));
			System.out.println("(����) "+computer.getName()+" ��ȭ: "+(userTricks == 1 ? "����" : (userTricks == 2 ? "ʯͷ": "��" )));
			
			
			if(userTricks == 1 && 2 == computerTricks ||
			   userTricks == 2 && 3 == computerTricks ||
			   userTricks == 3 && 2 == computerTricks) {
				// �û��� 
				computer.addScore();
			}
			else if(userTricks == computerTricks)
			{
				// ƽ��
			}
			else
			{
				// ������
				user.addScore();
			}
			
			battleTimes++;
			
			System.out.println("�Ƿ����?(y/n)");
			con = scanner.next();
		}while(con.equals("y"));
		
		
		
	}
	
	// ������
	public void CalResult() {
		userVictory = (user.getScore() > computer.getScore());
	}
	
	// ��ʾ���
	public void ShowResult() {
		System.out.println("һ���Ծ�����:"+ battleTimes);
		System.out.println("�û�Ӯ�� :" + user.getScore() + "��");
		System.out.println("����Ӯ�� :" + computer.getScore() + "��");
		System.out.println("ƽ�� :" + (battleTimes - user.getScore()- computer.getScore()) + "��");
		//System.out.println("�û�"+ (userVictory ? "ʤ��" : "ʧ��"));
	}
	
}
