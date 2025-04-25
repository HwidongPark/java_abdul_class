package com.hwidong.static_final;

public class StaticMembersPractice {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.show();
		// static member인 x의 값을 t1.x을 통해 바꾸면
		t1.x = 30;
		t1.y = 50;
		
		// t2의 x값도 같이 바뀐다
		//-> static member는 객체가 아닌 class에 속해있는 것이므로
		t2.show();
		

	}

}

class Test {
	static int x = 10;
	int y = 20;
	
	void show() {
		// non static member는 static member에 access할 수 있음
		System.out.println(x);		
	}
	
	static void display() {
		System.out.println(x);
	}
}