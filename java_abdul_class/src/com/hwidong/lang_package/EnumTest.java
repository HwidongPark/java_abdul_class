package com.hwidong.lang_package;

enum DeptEnum {
	IT, CIVIL, CS, ECE;
	
	private DeptEnum() {
		System.out.println(this.name() + " " + this.ordinal());
	}
}

public class EnumTest {

	public static void main(String[] args) {
		DeptEnum d1 = DeptEnum.CS;
		
		DeptEnum d2 = DeptEnum.CIVIL;

	}

}
