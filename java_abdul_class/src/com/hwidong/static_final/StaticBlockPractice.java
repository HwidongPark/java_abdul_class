package com.hwidong.static_final;

class Test2 {
	static {
		// 얘가 1번째로 실행됨
		System.out.println("Block 1");		
	}
	
	static {
		System.out.println("Block 2");
	}
}

public class StaticBlockPractice {
	
	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		
		System.out.println("Main");
		
		Test2 t2 = new Test2();
	}
	
}
