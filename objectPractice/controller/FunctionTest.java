package com.kh.objectPractice.controller;

import java.util.Scanner;

public class FunctionTest {
	
	public FunctionTest() {};//�⺻������
	
	//1
	public String vocaplus(String voca1, String voca2) {
		String result = voca1 + voca2;
		return result;
//		return voca1 + vaca2;
	}
	//*�Ű����� = parameter
	//2
	public int numplus(int num1, int num2) {
		int result = 0;
		if(num1>num2) {
			System.out.println("����� �� �����ϴ�.");
		} else {
			result = num1+num2;
		}
//		for (int i=num1 ; i<num2 ; i++) {
//			result += i;
//		} else {
//			System.out.println("����� �� �����ϴ�.");
//		}
		return result;
	}
	
	//3
	public boolean english (char eng) {
		boolean result = false;
		if (eng>='A' && eng<='Z' || eng>='a' && eng<='z') {//char���� ��Һ� ����(�ڱ�鳢�� �˾Ƽ� �ڵ�����ȯ �Ǽ� ��)
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
	
	//�α��� ó�� �޼ҵ� �����ϱ�
	//id, pw�� ��ġ�ϸ� �α��� ����, �ƴϸ� ����
	public boolean login (String id, String pw) {
		if (id.length()<4 || pw.length()<4) {
			return false;//������ �ѹ� ������ �޼ҵ� ��ü�� ����� ���� ���� �ڵ� �������� ����
		}//but if�� false�� ���� �ڵ� ���� (why? if���� return �� �����ϱ�~~)
		System.out.println("����Ǵ�?");
		return id.equals("user01") && pw.equals("1234");
	}
	
}
