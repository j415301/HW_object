package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	
	public static void main() {
		
		Book b2 = new Book("동물 농장","민음사","조지 오웰");
		System.out.println(b2);
		Book b3 = new Book("양들의 침묵","나무의철학","토머스 해리스",13500,10);
		b3.inform();
		
		
		
	}

}
