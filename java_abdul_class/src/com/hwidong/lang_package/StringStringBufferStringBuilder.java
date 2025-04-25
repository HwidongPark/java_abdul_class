package com.hwidong.lang_package;

public class StringStringBufferStringBuilder {
	
	
	public static void main(String[] args) {
		StringBuffer stringBuffer= new StringBuffer("abcd");
		
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.length());
		
		
		// ### append사용
		stringBuffer.append("e");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.length());
		
		
		// ### insert사용
		stringBuffer.insert(1, "INSERT");
		System.out.println(stringBuffer);
	}
	
}
