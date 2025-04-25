package com.hwidong.exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int A[] = {30, 20, 10, 40, 0};
		
		// 방법 1. multiple catch block
		// 중요! 항상 위에 있는 catch문이 아래 있는 catch문의 subclass이거나, 아래 있는 catch문보다 specific한 catch문이여야 한다
//		try {
//						
//			int c = A[0]/A[1];
//			
//			System.out.println("Division is " + c);
//			System.out.println("Bye");
//			
//			// 일부로 index out of bounds exception만듦.
//			//-> IndexOutOfBoundsException catch문으로 들어감
//			System.out.println(A[6]);
//		} catch(ArithmeticException err) {
//			System.out.println("Arithmetic Exception");
//			
//		} catch(IndexOutOfBoundsException err) {
//			System.out.println("Index out of bounds exception");
//			
//		}
		
		
		// 방법2. nested catch statement사용
		try {
			
			try {				
				int c = A[0]/A[4];
				
				System.out.println("Division is " + c);
				System.out.println("Bye");
				
				// 일부로 index out of bounds exception만듦.
				//-> IndexOutOfBoundsException catch문으로 들어감
				System.out.println(A[6]);
			} catch(ArithmeticException err) {
				System.out.println("Arithemetic exception 발생.");
								
			}
		}  catch(IndexOutOfBoundsException err) {
			System.out.println("Index out of bounds exception");
			
		}
	}
}
