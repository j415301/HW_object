package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 2;
		classroom = 6;
		name = "장혜린";
		height = 165.5;
		gender = '여';
	}
	
	public Student() {}
	
	public void setgrade(int grade) {
		this.grade = grade;
	}
	
	public int getgrade() {
		return grade;
	}
	
	public void information() {
		System.out.println("학년: "+grade);
		System.out.println("반: "+classroom);
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("성별: "+gender);
	}

}
