package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public interface Run {
	
	public static void main(String[] args) {
		
		Product p = new Product();
		p.information();
		p.setpName(10000);
		p.information();
		
	}

}