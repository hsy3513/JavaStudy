package com.kh.inter.ex1;

public class Tiger implements Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 성큼성큼 워킹");
		
	}

	@Override
	public void eat() {
		System.out.println("호랑이 떡 먹는다");
		
	}

	@Override
	public void makeSound() {
		System.out.println("어흥 어흥");
		
	}
	
}
