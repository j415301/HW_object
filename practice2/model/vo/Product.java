package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	{
		pName = "립스틱";
		price = 13000;
		brand = "클리오";
	}
	
	public Product() {}
	
	public void setpName(int price) {
		this.price = price;
	}
	
	public int getprice() {
		return price;
	}
	
	public void information() {
		System.out.println(pName+" "+price+" "+brand);
	}
	
}
