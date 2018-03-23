package com.ghgj.yn.reflect;

public class Student {
	private int sid;
	private String sname;
	private int age;
	private double score;
	
	public Student() {
	}
	public Student(int sid, String sname, int age, double score) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.score = score;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", score=" + score + "]";
	}
	
}
