package com.hwidong.exception;
import java.io.*;


class LowBalanceException extends Exception {
	@Override
	public String toString() {
		System.out.println("Inside custom exception toString");
		return "Balance should not be less than 5000";
	}
	
	
	@Override
	public String getMessage() {
		System.out.println("Inside custom exception getMessage");
		return "Balance should not be less than 5000";
	}
}


public class ChekcedUncheckedException {
	
	static void fun1() {
		try {			
			// 1. unchecked exception
			//-> 컴파일러에서 알려주지 않음. runtime에서 예외 발생
			// System.out.println(10 / 0);			
		} catch(Exception err) {
			err.printStackTrace(); 
		}
		
		
		// 2. checked exception
//		FileInputStream fi = new FileInputStream("My.txt");
		
		try {
			throw new LowBalanceException();
		} catch(Exception err) {
			System.out.println(err.getMessage());
		}
		

	}
	
	static void fun2() {
		fun1();
	}
	
	static void fun3() {
		fun2();
	}
	
	public static void main(String[] args) {
		fun3();
	}
}
