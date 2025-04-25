package com.hwidong.string_and_printing;

public class CreatingStringObject {

	public static void main(String[] args) {
		
		// String pool에 저장됨
		String str1 = "Java Program";
		
		
		// heap에 저장되며 str2는 heap의 String객체를 참조함
		// 그리고 "JAVA"라는 String객체가 String pool에 저장됨
		String str2 = new String("JAVA");
		
		
		char c[] = {'H', 'e', 'l', 'l', 'o'};
		
		byte b[] = {65, 66, 67, 68};
		
		String str4 = new String(b, 2, 2);
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str4);
		
		String str6 = "Java";
		String str7 = "Java";

		System.out.println(str6 == str7);
	}

}
