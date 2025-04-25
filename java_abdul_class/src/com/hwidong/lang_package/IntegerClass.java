package com.hwidong.lang_package;

public class IntegerClass {
	
	public static void main(String[] args) {
		
		int m1 = 15;
		Integer m2 = m1;
		Integer m3 = 18;
		
		
		// ### Interger class의 compareTo
		// a.compareTo(b);
		// 1. a > b 인 경우 -> 1 리턴
		// 2. a == b인 경우 -> 0 리턴
		// 3. a < b 인 경우 -> -1 리턴
		int compareToResult1 = m2.compareTo(m1);
		int compareToResult2 = m3.compareTo(m1);
		
		System.out.println("compareToResult1 = " + compareToResult1);
		System.out.println("compareToResult2 = " + compareToResult2);
		
		
		// ### Integer class의 equals메서드
		boolean equalsResult1 = m2.equals(m1);
		boolean equalsResult2 = m3.equals(m1);
		
		System.out.println("equalsResult1 = " + equalsResult1);
		System.out.println("equalsResult2 = " + equalsResult2);
		
		
		// ### static method
		// ### Integer.valueOf
		int m4 = Integer.valueOf("123");
		// Integer.valueOf()에 두번째 아규먼트는 redix(진법)임.
		int m5 = Integer.valueOf("1010", 2);	//-> 2진법
		
		System.out.println("m4 = " + m4);	//-> m4 = 123
		System.out.println("m5 " + m5);	//-> m5 = 10
		
		
		// ### static method
		// ### Integer.bitCount()
		//-> 2진법에서 1의 개수를 리턴
		int m6 = Integer.bitCount(10);
		System.out.println("m6" + m6);
		
		
		// ### static method
		// ### Integer.decode()
		int m7 = Integer.decode("0xA7");
		System.out.println("m7 = " + m7);
		
		// ### static method
		// ### Integer.parseInt()
		int m8 = Integer.parseInt("123");
		System.out.println("m8 = " + m8);
		
		try {			
			System.out.println(Integer.parseInt("123a"));
		} catch(NumberFormatException err) {
			System.out.println("Number format exception 발생");
		}
		
		// ### static method
		// ### signum
		int m9 = 10;
		System.out.println("Integer.signum(m9) = " + Integer.signum(m9));
		
		int m10 = -10;
		System.out.println("Integer.signum(m10) = " + Integer.signum(m10));
		
		// ### static method
		// ### reverse
		int m11 = 128;
		System.out.println("Integer.reverse(m9) = " + Integer.reverse(m9));
		
		// ### static method
		// ### reverseBytes
		int m12 = 129;
		System.out.println("Integer.reverse(m10) = " + Integer.reverseBytes(m10));
		System.out.println("Integer.reverseBytes(128) == Integer.MIN_VALUE = " + (Integer.reverseBytes(m10) == Integer.MIN_VALUE));
	}
}
