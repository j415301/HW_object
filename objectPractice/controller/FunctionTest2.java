package com.kh.objectPractice.controller;

public class FunctionTest2 {
	
	public FunctionTest2() {}
	
	//1
	public String sumstr(String str1, String str2) {
		String result = str1 + str2;
		return result;
	}
	
	//2
	public int sumnum(int num1, int num2) {
		if (num1>num2) {
			System.out.println("계산할 수 없습니다");
			return 0;
		}
		return num1+num2;
	}
	
	//3
	public boolean checkalphabet (char c) {
		if (c>='A' && c<='Z' || c>='a' && c<='z') {
			return true;
		}
		return false;
	}
	
	//4
	public boolean samestr (String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}
}
