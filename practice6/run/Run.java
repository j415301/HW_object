package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	
	public static void main() {
		
		Book b2 = new Book("���� ����","������","���� ����");
		System.out.println(b2);
		Book b3 = new Book("����� ħ��","������ö��","��ӽ� �ظ���",13500,10);
		b3.inform();
		
		
		
	}

}
