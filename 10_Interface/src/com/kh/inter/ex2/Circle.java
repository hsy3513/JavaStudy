package com.kh.inter.ex2;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		// 원 넓이 => PI * 반지름^2
		return Math.PI * radius *radius;
	}
	
}
