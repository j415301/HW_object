package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName = "����ƽ";
	private int price = 13000;
	private String brand = "Ŭ����";
	
	public Product() {}
	
	public void information() {
		System.out.println(pName+" "+price+" "+brand);
	}
	
}
