package com.springjpa.demo.entity;

public class Student {
	
	private int id;
	private int roll;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Student(int id, int roll) {
		super();
		this.id = id;
		this.roll = roll;
	}
	

}
