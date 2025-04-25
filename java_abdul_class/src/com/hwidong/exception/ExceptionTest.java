package com.hwidong.exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		
		System.out.printf("%d에서 나눌 정수를 입력해 주세요.\n", num1);
//		try {			
//			int userInputNum = Integer.parseInt(sc.nextLine());
//			System.out.println("결과 = " + (num1 / userInputNum));
//			// 참고: 물론 얘는 나눈 몫만 리턴함..
//		} catch(NumberFormatException err) {
//			System.out.println("숫자형식으로만 입력해 주세요.");
//		} catch(ArithmeticException err) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		} catch(Exception err) {
//			System.out.println("예외가 발생하였습니다.");
//		}
		
		try {
			try {
				int userInputNum = Integer.parseInt(sc.nextLine());
			
				System.out.println("결과 = " + (num1 / userInputNum));
			
				System.out.println("");
			} catch(ArithmeticException err) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
		} catch(NumberFormatException err) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 종료.");
	}

}
