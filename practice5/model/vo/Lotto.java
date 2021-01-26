package com.kh.example.practice5.model.vo;

public class Lotto {
	
	private int[] lotto = new int[6];
	
	{
		for(int i=0 ; i<6 ; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		}
	}
	
	public Lotto() {}
	
	
	public void setlotto (int[] lotto) {
		this.lotto = lotto;
	}
	
	public int[] getlotto() {
		return lotto;
	}
	
	public void information() {
		for(int i=0 ; i<6 ; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
 
}
