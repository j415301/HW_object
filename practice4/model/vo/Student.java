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
		name = "������";
		height = 165.5;
		gender = '��';
	}
	
	public Student() {}
	
	public void setgrade(int grade) {
		this.grade = grade;
	}
	
	public int getgrade() {
		return grade;
	}
	
	public void information() {
		System.out.println("�г�: "+grade);
		System.out.println("��: "+classroom);
		System.out.println("�̸�: "+name);
		System.out.println("Ű: "+height);
		System.out.println("����: "+gender);
	}

}
