package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Team{
	private String nation;
	private int no;
	public Team(String nation, int no) {
		this.nation = nation;
		this.no = no;
	}
	
	
	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	@Override
	public boolean equals(Object obj) {
		return this.getNo() == ((Team)obj).getNo();
	}
}

public class OlympicGamesDemo {

	public static void main(String[] args) {
		Team t1 = new Team("阿根廷", 1);
		Team t2 = new Team("澳大利亚", 2);
		Team t3 = new Team("塞尔维亚", 3);
		Team t4 = new Team("荷兰", 4);
		Team t5 = new Team("尼日利亚", 5);
		Team t6 = new Team("日本", 6);
		Team t7 = new Team("美国", 7);
		Team t8 = new Team("中国", 8);
		Team t9 = new Team("新西兰", 9);
		Team t10 = new Team("巴西", 10);
		Team t11 = new Team("比利时", 11);
		Team t12 = new Team("韩国", 12);
		Team t13 = new Team("客麦隆", 13);
		Team t14 = new Team("洪都", 14);
		Team t15 = new Team("拉斯", 15);
		Team t16 = new Team("意大利", 16);
		
		List<Team> teamList = new ArrayList<>();
		teamList.add(t1);
		teamList.add(t2);
		teamList.add(t3);
		teamList.add(t4);
		teamList.add(t5);
		teamList.add(t6);
		teamList.add(t7);
		teamList.add(t8);
		teamList.add(t9);
		teamList.add(t10);
		teamList.add(t11);
		teamList.add(t12);
		teamList.add(t13);
		teamList.add(t14);
		teamList.add(t15);
		teamList.add(t16);
		
		
		
	/*	List<Team> team1List = new ArrayList<>();
		List<Team> team2List = new ArrayList<>();
		List<Team> team3List = new ArrayList<>();
		List<Team> team4List = new ArrayList<>();*/
		Random random = new Random();
		for(int i =0 ; i<4; i++) {
			System.out.print("第 "+(i+1)+"对 国家: \n\t");
			for(int j=0; j<4; j++) {
				int index = random.nextInt(teamList.size());
				System.out.print(teamList.get(index).getNation()+"\t");
				
				teamList.remove(index);
			}
			System.out.println();
		}
		
		
		
		

	}

}
