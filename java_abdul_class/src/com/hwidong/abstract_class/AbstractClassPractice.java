package com.hwidong.abstract_class;

public class AbstractClassPractice {

	public static void main(String[] args) {
//		Super는 abstract class라 객체 생성 불가
//		Super s = new Super();
//		s.meth1();
		
		Sub sub = new Sub();
		sub.meth1();
		sub.meth2();
	}

}

abstract class Super {
	public Super() {
		System.out.println("Super Constructor");
	}
	
	public void meth1() {
		System.out.println("Method1 of Super");
	}
	
	abstract public void meth2();
}

class Sub extends Super {
	
	public void meth2() {
		System.out.println("Method2 of Sub");
	}
			
}