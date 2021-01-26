package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {
	
	public static void main(String[] args) {
		
		Lotto l = new Lotto();
		l.information();
		int[] LL = {1,2,3,4,5,6};
		l.setlotto(LL);
		l.getlotto();
		l.information();
		
	}

}
