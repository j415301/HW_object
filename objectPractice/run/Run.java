package com.kh.objectPractice.run;

import java.util.Scanner;

import com.kh.objectPractice.controller.FunctionTest;

public class Run {
	
	public static void main(String[] args) {
		
		//1
		FunctionTest c = new FunctionTest();
		String result = c.vocaplus("코딩","화이팅");
		System.out.println(result);
		
		System.out.println();
		
		//2
		int result2 = c.numplus(6, 2);
		System.out.println(result2);
//		System.out.println(c.numplus(6,2));
		
		System.out.println();
		
		//3;
		boolean result3 = c.english('A');
		System.out.println(result3);
		if(c.english('z')) {
			System.out.println("영문자 맞네요");
		} else {
			System.out.println("영문자 아니네요");
		}
		
		System.out.println();
		
		
		//4
//		boolean result4 = c.samevoca("히히","히히");
//		System.out.println(result4);
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력: ");
		String str = sc.nextLine();
		System.out.print("문자 입력: ");
		String str2 = sc.nextLine();
		System.out.println(c.samevoca(str, str2)? "같다" : "다르다");
		
		
		System.out.println();
		
		
		//로그인 처리 메소드 구현하기
		//id, pw가 일치하면 로그인 성공, 아니면 실패
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pw = sc.nextLine();
		System.out.println(c.login(id, pw)? "로그인 성공" : "로그인 실패");
	}
}
