package com.hwidong.method;

public class CommandLineArgumentChallenge {
	
	public static void main(String[] args) {
		double sum = 0;
		for (String stringInput : args) {
			if (stringInput.matches("[0-9]+(\\.[0-9]+)?")) {				
				double doubleNumber = Double.parseDouble(stringInput);
				sum += doubleNumber;
			}
		}
		System.out.printf("Sum = %f\n", sum);
	}
}
