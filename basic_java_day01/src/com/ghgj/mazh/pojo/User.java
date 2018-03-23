package com.ghgj.mazh.pojo;

public class User implements Comparable<User>{

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User(String name) {
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(User o) {
		return o.getId() - this.getId();
	}
	
}
