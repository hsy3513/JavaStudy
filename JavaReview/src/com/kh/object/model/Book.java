package com.kh.object.model;

public class Book {
	// 필드부
	private String title;
	private String author;
	
	// 생성자부
	// => 특징: 반환형이 없고, 이름이 클래스명과 동일!
	
	// * 기본생성자: 생성자가 하나도 정의되어 있지 않았을 때, 자동으로 추가되는 생성자
	public Book() {
		super();
	
	}
	
	// * 매개변수 생성자: 전달되는 값을 해당 필드에 초기화 해주는 생성자
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	// 메소드부
	// 접근제한자 예약어 반환형 메소드명(매개변수) {}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
}
