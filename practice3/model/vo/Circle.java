package com.kh.example.practice3.model.vo;

public class Circle {
	
	private double PI = 3.14;
	private int radius = 1;
	
	public void setradius(int radius) {
		this.radius = radius;
	}
	
	public int getradius() {
		return radius;
	}
	
	public void incrementRadius() {
		radius += 1;
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 둘레: "+radius*2*PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 넓이: "+radius*radius*PI);
	}

}
