package com.kh.objectPractice.run;

import com.kh.objectPractice.controller.FunctionTest2;

public class Run2 {
	
	public static void main(String[] args) {
		
		FunctionTest2 ft = new FunctionTest2();
		
		//1
		String result = ft.sumstr("코딩", "화이팅");
		System.out.println(result);
		
		//2
		int result2 = ft.sumnum(30, 20);
		System.out.println(result2);
		
		
		//3
		boolean result3 = ft.checkalphabet('d');
		System.out.println(result3);
		
		//4
		boolean result4 = ft.samestr("나는", "달라");
		System.out.println(result4);
	}

}
