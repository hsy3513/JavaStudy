package com.kh.e_object_array.student.model.vo;

public class Student {
	// ====== 필드부
	private String name;	// 이름
	private String subject;	// 과목
	private	int score;		// 점수
	
	// ====== 생성자부
	public Student() {}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
		
	}
	
	// ====== setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// ====== getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	public String inform() {
		
		return name + subject + score;
	}
}
