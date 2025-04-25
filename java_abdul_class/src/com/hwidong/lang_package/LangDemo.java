package com.hwidong.lang_package;

class MyObject {
	
}

public class LangDemo {
	public static void main(String[] args) {
//		Object o1 = new Object();
//		Object o2 = new Object();
//		Object o2 = o1;
		
//		System.out.println(o1.equals(o2));
		
//		System.out.println(o1.hashCode());
		
		
		// 모든 objects들은 Object를 상속함. method를보면 Object가 갖고 잇는 메서드들을 갖고 있는걸 확인할 수 있음
		MyObject o1 = new MyObject();
		o1.toString();
		o1.hashCode();
		
	}
}
