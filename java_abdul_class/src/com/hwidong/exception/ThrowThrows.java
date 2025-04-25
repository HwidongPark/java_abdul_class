package com.hwidong.exception;

class NegativeDimensionException extends Exception {
	@Override
	public String toString() {
		return "Area cannot be negative";
	}	
}

public class ThrowThrows {		 
	
	// 넓이를 구하는 메서드. 넓이가 음수일 수는 없음
	public static int area(int l, int b) throws NegativeDimensionException {
		if (l < 0 || b < 0) {
			throw new NegativeDimensionException();
		}
		return l * b;
	}
	
	public static void meth1() throws NegativeDimensionException {
		System.out.println("Area is " + area(-10, 5));
	}
	
	public static void main(String[] args) {
		try {			
			meth1();
		} catch(NegativeDimensionException err) {
			System.out.println(err);
		}
	}
}
