package com.hwidong.method;

public class VariableArgumentPractice {

	static void show(int... A) {
		for (int x : A) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args) {
		
		show(5, 4, 3);
		System.out.println("\n");
		
		show(1, 2, 3, 4 ,10, 9, 8);
		System.out.println("\n");
		
		// 이렇게 배열을 넣어도 마치 JavaScript의 spread처럼 잘 입력 됨
		show(new int[] {5, 4, 3, 2, 1});

	}

}
