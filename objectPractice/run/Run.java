package com.kh.objectPractice.run;

import java.util.Scanner;

import com.kh.objectPractice.controller.FunctionTest;

public class Run {
	
	public static void main(String[] args) {
		
		//1
		FunctionTest c = new FunctionTest();
		String result = c.vocaplus("�ڵ�","ȭ����");
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
			System.out.println("������ �³׿�");
		} else {
			System.out.println("������ �ƴϳ׿�");
		}
		
		System.out.println();
		
		
		//4
//		boolean result4 = c.samevoca("����","����");
//		System.out.println(result4);
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		String str = sc.nextLine();
		System.out.print("���� �Է�: ");
		String str2 = sc.nextLine();
		System.out.println(c.samevoca(str, str2)? "����" : "�ٸ���");
		
		
		System.out.println();
		
		
		//�α��� ó�� �޼ҵ� �����ϱ�
		//id, pw�� ��ġ�ϸ� �α��� ����, �ƴϸ� ����
		System.out.print("���̵�: ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pw = sc.nextLine();
		System.out.println(c.login(id, pw)? "�α��� ����" : "�α��� ����");
	}
}
