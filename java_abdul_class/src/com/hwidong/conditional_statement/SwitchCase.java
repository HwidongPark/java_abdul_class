package com.hwidong.conditional_statement;

public class SwitchCase {
	public static void main(String[] args) {
		int day = 1;
		
		switch(day) {	// ( )에는 value 또는 expression이 들어갈 수 있음
		
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
			default:			
				System.out.println("Invalid Day");
				break;		
		}
		
		
	}
}
