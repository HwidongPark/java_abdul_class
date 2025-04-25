package com.hwidong.method;

public class MethodPractice {
	
	
	static int max(int x, int y) {	// 여기서 변수로 받는 x, y를 formal parameters라고 부름
		if (x > y) 
			return x;
		 else 
			return y;		
	}
	
	public static void main(String[] args) {
		int a=5, b=3, c;	
		c = max(a, b);	// 여기서 실제로 넣는 값 a, b를 actual parameters라고 부름
		
	}

}
