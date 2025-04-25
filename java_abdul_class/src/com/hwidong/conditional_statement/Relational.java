package com.hwidong.conditional_statement;

public class Relational {
	public static void main(String[] args) {
		int a = 5, b = 10, c = 15;
		
		System.out.println(a < b && a < c);		
		System.out.println(a < b || a > c);
		
		int n = -5;
		if (n >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
}
