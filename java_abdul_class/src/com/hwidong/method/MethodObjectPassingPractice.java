package com.hwidong.method;

import java.util.Arrays;

public class MethodObjectPassingPractice {
	
	static void change(int X[], int index, int value) {
		X[index] = value;
	}
	
	static void change2(int x, int value) {
		x = value;
	}
	
	static void change3(String x, String value) {
		x = value;
	}
	
	public static void main(String[] args) {
		
		// primitive value를 넘겨주는 경우
		int x = 10;
		change2(x, 20);
		System.out.println(x);	// 10이 출력 됨
		
		// String의 경우
		String y = "Hello";
		change3(y, "World!");
		
		System.out.println(y);	// Hello 가 출력됨
		
		// object를 argument로 내려보내주는 경우
		int A[] = {2, 4, 6, 8, 10};
		System.out.println(Arrays.toString(A));	// [2, 4, 6, 8, 10]이 출력됨
		
		change(A, 2, 20);
		System.out.println(Arrays.toString((A)));	// [2, 4, 20, 8, 10]이 출력됨		
		
	}
	
}
