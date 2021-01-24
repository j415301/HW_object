package com.kh.objectPractice.controller;

import com.kh.objectPractice.run.Member;

public class Client {
	//run
	
	public static void main(String[] args) {
		
		Member m = new Member();		
		m.inserMember("user01", "1234", "신짱구", "134@gmail.com", "서울특별시");
		
	}
}
