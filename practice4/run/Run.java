package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
	
	public static void main(String[] agrs) {
		
		Student s = new Student();
		s.information();
		s.setgrade(6);
		s.getgrade();
		s.information();
		
	}

}
