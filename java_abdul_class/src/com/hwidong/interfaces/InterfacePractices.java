package com.hwidong.interfaces;

public class InterfacePractices {

	public static void main(String[] args) {

		Test t = new My();
		
		// interface의 final static 필드
		System.out.println(Test.X);

		// interface상속
		System.out.println(Test2.X);
		t.method1();
		t.method2();
		
		// method3의 경우 reference type이 Test라는 interface인데 inteface에 method3이라는 메서드가 없으므로 작동 X	
//		t.method3();
	}

}


interface Test {
	
	// field는 default로 final static이다.
	int X = 10;
		
	public abstract void method1();
	void method2();
	
	public static void method3() {
		System.out.println("Method3 of Test Interface");
	}
}

interface Test2 extends Test {
	void method4();
	default void method5() {
		System.out.println("Default method of interface Test2");
	}
	
	private void method6() {
		System.out.println("Private method can be declared in interface and can be used in its default method.");
	}
}

class My implements Test2 {	
	public void method1() {
		System.out.println("Method1 of class My");
	}
	
	public void method2() {
		System.out.println("Method2 of class My");
	}
	
	public void method3() {
		System.out.println("Method3 of class My");
	}
	
	public void method4() {
		System.out.println("Method4 of class My");
	}
		
}

