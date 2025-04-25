package com.hwidong.array;

import java.util.Arrays;

public class OneDimensionArray {

	public static void main(String[] args) {
		int A[] = new int[10];
		int B[] = {1, 2, 3, 4, 5};
		
		int C[];
		
		C = new int[10];
		
		int []D = new int[5];
		
		B[2] = 15;
		
		// for문에서 array사용하는 Syntax 1
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
		
		// for문에서 array사용하는 Syntax 2
		for (int x : B) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(B)); 
	}

}
