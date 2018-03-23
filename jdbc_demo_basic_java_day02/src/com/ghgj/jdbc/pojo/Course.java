package com.ghgj.jdbc.pojo;

public class Course {

	private int id;
	private String course;
	private String teacher;
	
	@Override
	public String toString() {
		return id + "\t" + course + "\t" + teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Course(int id, String course, String teacher) {
		super();
		this.id = id;
		this.course = course;
		this.teacher = teacher;
	}

	public Course() {
		super();
	}
}
