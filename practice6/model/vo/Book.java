package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
//		//String result = title + publisher + author;
//		return;
		System.out.println("�ǳ�?");
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
//		System.out.println("����: "+title);
//		System.out.println("���ǻ�: "+publisher);
//		System.out.println("�۰�: "+author);
//		System.out.println("����: "+price);
//		System.out.println("������: "+discountRate+"%");
	}

}
