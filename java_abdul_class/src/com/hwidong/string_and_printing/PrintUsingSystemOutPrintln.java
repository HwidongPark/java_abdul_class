package com.hwidong.string_and_printing;

public class PrintUsingSystemOutPrintln {
	
	public static void main(String[] args) {
		int a = 10;
		int x = 10, y = 20;
		float b = 12.55f;
		char c = 'A';
		
		
		// Number is , y이런식으로는 사용하지 못하고, + 를 사용하여 concatenation을 해야 함
		System.out.println("Number is " + y);
		
		// 먼저 expression계산 값이 나오면 계산값 + String으로 concatenation이 된다.
		System.out.println(x + y + " Sum");
		
		// 먼저 String이 나오고 그 다음 계산값을 하려면 그냥 값들이 계산되지 않고 String으로 concatenation되서 나온다/
		System.out.println("Sum " + x + y);
		
		// 계산된 값으로 Concatenation되서 나오도록 하고 싶으면 아래와 같이 ( )안에서 연산을 먼저 시켜줘야 한다.
		System.out.println("Sum " + (x + y));
		
		// 연습..
		System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
		
	}
	
}
