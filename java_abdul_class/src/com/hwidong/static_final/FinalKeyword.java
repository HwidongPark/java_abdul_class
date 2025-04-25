package com.hwidong.static_final;

public class FinalKeyword {
	final float PI;
	
	FinalKeyword() {
		PI = 3.1415f;
	}
	
	public static void main(String[] args) {
		FinalKeyword test = new FinalKeyword();
		System.out.println(test.PI);
	}
}

