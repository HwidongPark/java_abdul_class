package com.hwidong.loops;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n\n");
		int test[] = {1, 2, 3, 4, 5};
		for (int element : test) {
			System.out.println(element);
		}
	}

}
