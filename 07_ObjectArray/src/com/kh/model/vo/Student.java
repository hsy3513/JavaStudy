package com.kh.model.vo;

public class Student { // => 학생 정보
	// 데이터 -> 이름, 나이, 학년, 키, 학번, 성적 등등
	// 이름: String, 나이: int, 성적: double => private(-)
	
	// 필드부
	private String name;	// 이름
	private int age;		// 나이
	private double score;	// 성적
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	// 기능 -> 공부한다, 밥먹기, 술마시기, 질문하기 등등
	
	// 학생 정보 출력 printInfo():void
	// getter/setter -> private 필드
	public void printInfo() {
		System.out.printf("이름: %s, 나이: %d, 성적: %.1f\n", name, age, score);
	}


	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getScore() {
		return score;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
}
