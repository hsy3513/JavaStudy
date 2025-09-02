package com.kh.inter.ex1;


public class Cat implements Animal{

	// * 오버라이딩 조건: 반환형, 메소드명, 매개변수가 같아야함
	@Override
	public void move() {
		System.out.println("꽁꽁 언 한강 위로 고양이가 걸어갑니다.");
	}

	@Override
	public void eat() {
		System.out.println("고양이 생선 먹는다");
		
	}

	@Override
	public void makeSound() {
		System.out.println("껄룩 껄룩");
		
	}
}
