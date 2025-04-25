package com.hwidong.inheritance;

public class InheritancePractice {

	public static void main(String[] args) {
		
		Cylinder c = new Cylinder();
		c.radius = 7;
		c.height = 10;
		
		System.out.println("Volume: " + c.volume());
		System.out.println("Area: " + c.area());
		
	}

}


/**
 * Circle class 정의
 */
class Circle {
	public double radius;
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}


/**
 * Cylinder class 정의
 */
class Cylinder extends Circle {
	public double height;
	
	
	public double volume() {
		return area() * height;
	}
}