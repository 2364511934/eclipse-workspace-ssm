package day13;

import java.util.Arrays;

class MemberInter implements Comparable<MemberInter> {
	private int no;
	private String name;
	private int score;

	public MemberInter(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(MemberInter o) {
		return this.score - o.score;
	}

	@Override
	public String toString() {
		return "MemberInter [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
}


class Member{
	private int no;
	private String name;
	private int score;

	public Member(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	
}

public class Work3 {

	public static void main(String[] args) {
		MemberInter memberInter1 = new MemberInter(1, "小三", 20);
		MemberInter memberInter2 = new MemberInter(3, "小si", 440);
		MemberInter memberInter3 = new MemberInter(54, "小wu", 10);
		MemberInter[] memberInterArr = new MemberInter[] {memberInter1, memberInter2, memberInter3};
	
		Arrays.sort(memberInterArr);
		Arrays.stream(memberInterArr).forEach(System.out::println);
		
		Member member1 = new Member(1, "小三", 20);
		Member member2 = new Member(3, "小si", 440);
		Member member3 = new Member(54, "小wu", 10);
		Member[] memberArr = new Member[] {member1, member2, member3};
	
		Arrays.sort(memberArr, (m1, m2)->{return m1.getScore()-m2.getScore();});
		Arrays.stream(memberArr).forEach(System.out::println);
		
	}

}
