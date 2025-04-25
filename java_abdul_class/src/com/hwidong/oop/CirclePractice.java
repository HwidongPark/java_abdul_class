package com.hwidong.oop;

public class CirclePractice {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.radius = 7;
		
		Circle circle2 = new Circle();
		circle2.radius = 14;
		
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());
		System.out.println(circle1.circumference());
		
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		System.out.println(circle2.circumference());
	}
}

class Circle {
	public double radius;
	
	public double area() {
		return Math.pow(radius,2) * Math.PI;		
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}
