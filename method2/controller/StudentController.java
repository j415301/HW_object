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
		System.out.println("이름: "+name);
		System.out.println("학년: "+grade);
		System.out.println("국어: "+kor);
		System.out.println("수학: "+math);
		System.out.println("영어: "+eng);
	}
	

}
