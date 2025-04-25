package com.hwidong.lamda;

import com.hwidong.string_and_printing.PrintUsingSystemOutPrintln;

// interface가 단 하나의 메서드만 갖고 있다면 이건 Functional Interface라고 불린다.
@FunctionalInterface
interface MyLamda {
	
	// interface에서 모든 method는 default로 public abstract
	void display();
	
	// FunctionalInterface라는 annotation이 있으므로 메서드 2개 정의하면 빨간줄 그어짐
//	void show();
}

interface MyLamda2 {
	
	// interface에서 모든 method는 default로 public abstract
	void display(String message);
	
	// FunctionalInterface라는 annotation이 있으므로 메서드 2개 정의하면 빨간줄 그어짐
//	void show();
}

interface AddInterface {
	int add(int x, int y);
}


class Demo {
	public void method1() {
		MyLamda ml = () -> { System.out.println("Hi"); }; 
	}
}

class My implements MyLamda {
	public void display() {
		System.out.println("Hello World from class implementing interface!");
	}
}


public class LamdaDemo {
	public static void main(String[] args) {
		
		// ### Lamda사용하지 않으면, interface를 구현하는 클래스를 만들고, 그 객체를 만들어서
		// display()라는 메서드를 사용해야 함.
		MyLamda m = new My();
		System.out.println("11111");
		m.display();
		System.out.println("2222");
		
		// ### 익명 클래스 사용해서 display구현하여 생성할 수 있음
		MyLamda mWithAnonymousObject = new MyLamda() {
			public void display() {
				System.out.println("Hello World from anonymous class!!");				
			}
		};
		
		mWithAnonymousObject.display();
		
		
		// ### 람다 사용
		// 1. 만약 interface가 단 하나의 메서드만 갖고 있는 FunctionalInterface인 경우 아래와 같이 쓸 수있음
		MyLamda mWithLamdaFunctionalInterface = () -> {
			System.out.println("Hello world from lamda(functional interface)");
		};
		
		mWithLamdaFunctionalInterface.display();
		
		// 파라미터를 갖는 FunctionalInterface의 경우
		MyLamda2 m2WithLamdaFunctionalInterface = (String message) -> {
			System.out.println(message);
		};
		
		m2WithLamdaFunctionalInterface.display("Hello World from functional interface lamda expression with parameter!");
		
		// Lamda expression에서 다른 logic없이 리턴만 있는경우 body를 안써줘도 됨. 그냥 expression만 있으면 그 expression을 리턴함
		AddInterface addInterface = (int x, int y) -> x + y;
		System.out.println("Using add interface.... addInterface.add(1, 2) = " + addInterface.add(1, 2));
		
	}
}
