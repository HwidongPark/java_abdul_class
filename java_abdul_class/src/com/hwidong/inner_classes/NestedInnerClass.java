package com.hwidong.inner_classes;

public class NestedInnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerDisplay();
		
		
		// 외부에서 Inner class의 객체를 만드는 방법
		Outer.Inner oi = new Outer().new Inner();
		System.out.println(oi.y);
				
	}

}

class Outer {
	int x = 10;
	
	// inner class가 필드가 선언된 line보다 더 뒤에 선언됐는데 Inner class의 객체 필드를 만들 수 있음
	Inner i = new Inner();
	
	class Inner {
		int y = 20;
		public void innerDisplay() {
			System.out.println(x + " " + y);
		}
	}
	
	
	// Inner class의 객체를 만들어 inner class의 member에 접근 가능
	public void outerDisplay() {
		Inner i = new Inner();
		i.innerDisplay();
		
		System.out.println(i.y);
	}
}
