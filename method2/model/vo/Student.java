package com.method2.model.vo;

import com.method2.controller.StudentController;

public class Student {
	
	public static void main(String[] args) {
		
		StudentController s = new StudentController();
		s.insertStudent("��¯��", 1, 50, 60, 63);
		s.studentInfo();
		
	}

}
