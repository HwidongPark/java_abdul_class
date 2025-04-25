package com.hwidong.lang_package;

public class FloatAndBooleanClass {

	public static void main(String[] args) {
		
		float a = 12.5f;
		Float b = 12.5f/0;
		
		System.out.println("b = " + b);
		System.out.println("b.isInfinite()" + b.isInfinite());
		System.out.println("Float.isInfinite(b) = " + Float.isInfinite(b));
		System.out.println("b.POSITIVE_INFINITY = " + (b == Float.POSITIVE_INFINITY));
		System.out.println("b.NEGATIVE_INFINITY = " + (b == Float.NEGATIVE_INFINITY));
		
		
		
		// ### isNaN()
		//-> static, instance method모두 존재
		
		Float c = (float) Math.sqrt(-1);
		
		System.out.println("c = " + c);
		System.out.println("b.isNaN() = " + c.isNaN());
		System.out.println("Float.isNaN(b) = " + Float.isNaN(c));
		System.out.println("b.getClass() = " + c.getClass());

	}

}
