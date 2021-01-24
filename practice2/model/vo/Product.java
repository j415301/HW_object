package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName = "립스틱";
	private int price = 13000;
	private String brand = "클리오";
	
	public Product() {}
	
	public void information() {
		System.out.println(pName+" "+price+" "+brand);
	}
	
}
