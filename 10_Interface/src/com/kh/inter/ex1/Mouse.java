package com.kh.inter.ex1;

public class Mouse implements Animal, Baby{

	@Override
	public void move() {
		// Baby 는 움직이지 못함...
		
	}

	@Override
	public void eat() {
		System.out.println("쥐는 치즈 먹는다");
		
	}

	@Override
	public void makeSound() {
		System.out.println("쥑 쥑");
		
	}
	
}
