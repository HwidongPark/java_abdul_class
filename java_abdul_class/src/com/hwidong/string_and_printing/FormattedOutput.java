package com.hwidong.string_and_printing;

public class FormattedOutput {

	public static void main(String[] args) {
		
		// printf메서드 는 아래와 같은 아규먼트들을 받을 수 있다.
		// 1) String, Object(대체할 값들 포함)을 받는 경우		
		// 2) Locale, String, Object를 받는 경우
		//-> Locale은 geographic location과 관련된 information임.
		
		
		int x = 10;
		float y = 12.568f;
		char z = 'A';

//		System.out.printf("Hello %d %f %c\n", x, y, z);
//		System.out.printf("Hello %o %f %c\n", x, y, z);
//		System.out.printf("Hello %x %f %c\n", x, y, z);
//		System.out.printf("Hello %g %c\n", y, z);
		
//		// Argument Index		
		// n번째 아규먼트의 값을 사용한다는 의미
//		System.out.printf("%1$d %2$f %1$d", x, y);

		
		// Flag
		int a = 10;		
//		System.out.printf("%05d", a);
//		System.out.printf("%+5d", a);
//		System.out.printf("%-5d", a);
//		System.out.printf("%(5d", a);
//		System.out.printf("%.2f", y);
//		System.out.printf("%06.2f", 3.14);
		
//		System.out.printf("%20s", "Java");
		System.out.printf("%-20s", "Java");
		
		
		// width
		//-> n의 길이로 출력한다는 의미//		
//		System.out.printf("%5d", a);
	}
	

	
}
