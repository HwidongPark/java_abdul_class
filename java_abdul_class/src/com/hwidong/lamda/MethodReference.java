package com.hwidong.lamda;

interface MyLamdaMethodReference {
	public void display(String str);
}

interface MyLamdaMethodReference2 {
	public int display(String str1, String str2);
}

public class MethodReference {
	static String testField;
	public MethodReference(String s) {
		System.out.println(s.toUpperCase());
		
		this.testField = s;
	}
	
	public static void reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		
		// ### static method refernece 예1
		MyLamdaMethodReference mlStaticMethodReference1 = System.out::println;
		mlStaticMethodReference1.display("static method reference");
		
		// static method refernce 예2
		MyLamdaMethodReference mlStaticMethodReference2 = MethodReference::reverse;
		mlStaticMethodReference2.display("ABCDE");
		
		// ### constructor reference
		MyLamdaMethodReference mlConstructorReference = MethodReference::new;
		mlConstructorReference.display("Constructor reference1");
		
		System.out.println("this.testField = " + testField);
		
		MyLamdaMethodReference mlConstructorReference2 = MethodReference::new;
		mlConstructorReference.display("Constructor reference2");
		
		System.out.println("this.testField = " + testField);
		
		
		// ### multiple parameters
		MyLamdaMethodReference2 mlMultipleParam = String::compareTo;
		System.out.println("" + mlMultipleParam.display("hello", "wello"));
		
	}

}
