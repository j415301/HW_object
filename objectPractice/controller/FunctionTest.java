package com.kh.objectPractice.controller;

import java.util.Scanner;

public class FunctionTest {
	
	public FunctionTest() {};//기본생성자
	
	//1
	public String vocaplus(String voca1, String voca2) {
		String result = voca1 + voca2;
		return result;
//		return voca1 + vaca2;
	}
	//*매개변수 = parameter
	//2
	public int numplus(int num1, int num2) {
		int result = 0;
		if(num1>num2) {
			System.out.println("계산할 수 없습니다.");
		} else {
			result = num1+num2;
		}
//		for (int i=num1 ; i<num2 ; i++) {
//			result += i;
//		} else {
//			System.out.println("계산할 수 없습니다.");
//		}
		return result;
	}
	
	//3
	public boolean english (char eng) {
		boolean result = false;
		if (eng>='A' && eng<='Z' || eng>='a' && eng<='z') {//char끼리 대소비교 가능(자기들끼리 알아서 자동형변환 되서 함)
			result = true;
		}
		return result;
	}
	
	//4
//	public boolean samevoca (String voca3, String voca4) {
//		boolean result = false;
//		if (voca3.equals(voca4)) {
//			result = true;
//		}
//		return result;
//	}
	public boolean samevoca (String str, String str2) {
		return str.equals(str2);
	}
	
	//로그인 처리 메소드 구현하기
	//id, pw가 일치하면 로그인 성공, 아니면 실패
	public boolean login (String id, String pw) {
		if (id.length()<4 || pw.length()<4) {
			return false;//리턴을 한번 만나면 메소드 자체가 종료됨 따라서 하위 코드 실행하지 않음
		}//but if가 false면 하위 코드 실행 (why? if문의 return 안 만나니까~~)
		System.out.println("실행되니?");
		return id.equals("user01") && pw.equals("1234");
	}
	
}
