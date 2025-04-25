package com.hwidong.exception;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		try {
			
//		int a=10, b=2, c;
//			int a = 10, b = 0, c;
			
//			c = a/b;
			
			int a, b, c;			
						
			Scanner scanner = new Scanner(System.in);			
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			
			c = a / b;
			
			
			System.out.println(c);
			
		} catch(ArithmeticException err) {
			System.out.println(err);
			System.out.println(err.getMessage());
			System.out.println("Denominator cannot be 0, try again");
		}
		
		System.out.println("Bye");
	}

}
