package com.method2.controller;

public class StudentController {
	
	public StudentController () {}
	
	private String name;
	private int grade;
	private int kor;
	private int math;
	private int eng;
	
	public void insertStudent(String name, int grade, int kor, int math, int eng) {
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public void studentInfo() {
		System.out.println("�̸�: "+name);
		System.out.println("�г�: "+grade);
		System.out.println("����: "+kor);
		System.out.println("����: "+math);
		System.out.println("����: "+eng);
	}
	

}
