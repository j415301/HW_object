package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	{
		pName = "����ƽ";
		price = 13000;
		brand = "Ŭ����";
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
