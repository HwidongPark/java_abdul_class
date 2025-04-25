package com.hwidong.inheritance;

public class MethodOverridingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Super();
		sup.display();
		
		Sub s = new Sub();
		s.display();
		

	}

}

class Super {	
	public void display() {
		System.out.println("Super class display");
	}
}


class Sub extends Super {
	@Override
	public void display() {
		System.out.println("Sub Class Display");
	}
}
