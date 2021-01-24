package com.kh.objectPractice.run;

public class Member {
	//기능 제공용 클래스
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	
	public void inserMember (String id, String pw, String name, String email, String address) {
		System.out.println(id+" "+pw+" "+name+" "+email+" "+address);
	}
}
