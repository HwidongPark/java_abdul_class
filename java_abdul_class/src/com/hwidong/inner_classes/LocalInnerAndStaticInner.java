package com.hwidong.inner_classes;

public class LocalInnerAndStaticInner {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.display();
	}

}

abstract class My {
	abstract public void show();
}

class Outer2 {
	public void display() {
		class Inner {
			public void show() {
				System.out.println("Hello");
			}
		}
		
		// 1. nested class의 객체를 만들어 inner class 멤버 접근
		Inner i = new Inner();
		i.show();
		
		// 2. inner class 객체 그냥 바로 만들어서 inner class 멤버 접근
		new Inner().show();
		
		// 3. anonymous class 사용
		My m = new My() {
			public void show() {
				System.out.println("Hello.. Implementing as anonymous class");
			};
		};
		
		m.show();
		
		// 4. anonymous class reference없이 바로 사용
		new My() {
			public void show() {
				System.out.println("Hello.. Implementing as anonymous class");

			}
		}.show();
				 
	}	
}

class Outer3 {
	int x = 10;
	static int y = 20;
	
	static class My {
		public void show() {
			// outer class의 static member인 y만 접근 가능
			System.out.println(y);
		}
	}
}


