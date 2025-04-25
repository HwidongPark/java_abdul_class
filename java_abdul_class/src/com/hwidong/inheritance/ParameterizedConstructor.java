package com.hwidong.inheritance;

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		// 출력 결과
		// Non-Param Parent
		// Non-Param Child
		//-> 즉, 둘 다 non param들이 호출됨
//		Child2 c = new Child2();
		
		// 출력 결과
		// Non-Param of Parent
		// Param of Child 2
//		Child2 c1 = new Child2(2);
		
		// 출력 결과
		// Param of Parent 2
		// Two Param of Child 4
		Child2 c2 = new Child2(2, 4);
		
	}

}


class Parent2 {
	public Parent2() {
		System.out.println("Non-Param of Parent");
	}
	
	public Parent2(int x) {
		System.out.println("Param of Parent " + x);
	}
}


class Child2 extends Parent2 {
	public Child2() {
		System.out.println("Non-Param of Child");		
	}
	
	public Child2(int y) {
		System.out.println("Param of Child " + y);
	}
	
	public Child2(int x, int y) {
		super(x);
		System.out.println("Two Param of Child " + y);
	}
}

