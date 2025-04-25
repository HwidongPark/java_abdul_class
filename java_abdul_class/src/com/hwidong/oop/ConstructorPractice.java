package com.hwidong.oop;

public class ConstructorPractice {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();		
	}

}


class Rectangle {
	private double length;
	private double breadth;
	
	// constructors
	public Rectangle() {		
		this.setLength(1);
		this.setBreadth(1);
	}
	
	public Rectangle(double length, double breadth) {		
		this.setLength(length);
		this.setBreadth(breadth);
	}
			
	public Rectangle(double s) {
//		length = breadth = s;
		this.setLength(s);
		this.setBreadth(s);
	}
	
	// Getter Setter
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	
	public void setLength(double length) {
		if (length > 0) {			
			this.length = length;
		} else {
			this.length = 0;
		}
	}


	public void setBreadth(double breadth) {
		if (breadth > 0) {			
			this.breadth = breadth;
		} else {
			this.breadth = 0;
		}
	}
}
