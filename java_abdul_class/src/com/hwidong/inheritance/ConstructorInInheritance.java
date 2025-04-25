package com.hwidong.inheritance;

public class ConstructorInInheritance {

	public static void main(String[] args) {
		
//		Parent p = new Parent();		
		
		// 출력 결과
		// Parent Constructor
		// Child Constructor
		//-> Child class의 Object를 만들 때 Parent class constructor가 먼저 호출된 다음, Child class의 constructor가 호출됨
//		Child c = new Child();
		
		// 출력 결과
		// Parent Construcor
		// Child Constructor
		// GrandChild Constructor
		//-> 역시나 부모의 constructor부터 호출된 후, 그 다음 자식 class의 constructor가 호출됨
		GrandChild gc = new GrandChild();
	}
}

class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent {
	public Child() {	
		System.out.println("Child Constructor");
	}
}

class GrandChild extends Child {
	public GrandChild() {
		
		System.out.println("GrandChild Constructor");
	}
}
