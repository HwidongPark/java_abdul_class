package com.hwidong.array;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int A[][] = new int[5][5];
		int B[][] = {{1, 2, 3}, {2, 4, 6}, {3, 5, 7}};
		
		int C[][];
		C = new int[5][5];
		
		int [][]D = new int[5][5];
		int E[][] = new int[5][5];
		
		int[] F,G[];
		F = new int[5];
		G = new int[5][5];
		
		int H[][];
		H = new int[3][];
		
		H[0] = new int[5];
		H[1] = new int[3];
		H[2] = new int[8];
		
		
		// 2차원 배열 for문 돌리는 방법 1
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.println(B[i][j]);
			}
			System.out.println("\n");
		}
		
		
		// 2차원 배열 for문 돌리는 방법 2
		for (int x[] : B) {
			for (int y : x) {
				System.out.println(y);
			}
			System.out.println("\n");
		}
		
		// jagged array for 문
		for (int i = 0; i < H.length; i++) {
			for (int j = 0; j < 
					H[i].length; j++) {
				System.out.print(H[i][j] + " ");
			}
			System.out.println("\n");
		}
		
	}

}
