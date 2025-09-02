package com.kh.inter.ex2;

public class Run {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		// | 원 | 사각형 |
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(3, 4);
		
		for (Shape shape : shapes) {
			if (shape instanceof Rectangle) {
				System.out.print("사각형의 넓이: ");
			} else {
				System.out.print("원의 넓이: ");
			}
			
			System.out.println(shape.calculateArea());
		}

	}

}
