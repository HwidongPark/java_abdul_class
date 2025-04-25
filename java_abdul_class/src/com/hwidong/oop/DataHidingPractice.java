package com.hwidong.oop;

public class DataHidingPractice {

	public static void main(String[] args) {
		Rectangle2 rect1 = new Rectangle2();
		rect1.setLength(5);
		rect1.setBreadth(7);

		System.out.println(rect1.area());
	}

}


class Rectangle2 {

	private int length;
	private int breadth;
	
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setLength(int l) {
		if (l > 0) {
			length = l;
		} else {
			l = 0;
		}
	}
	
	public void setBreadth(int b) {
		if (b > 0) {
			breadth = b;
		} else {
			breadth = 0;
		}
	}
	
	public double area() {
		return length * breadth;
	}
	
	public double perimeter() {
		return 2 * (length + breadth);
	}
	
	public boolean isSquare() {
		if (length == breadth) {
			return true;
		} else {
			return false;
		}
	}
	
	
}