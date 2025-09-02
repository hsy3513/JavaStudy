package com.kh.d_object.practice2.run;

import com.kh.d_object.practice2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// 실행
		Book b1 = new Book("객체지향의 사실과 오해", "조영호", "위키북스", 25000, 0.1);
		Book b2 = new Book("클린 코드", "로버트 C. 마틴", "인사이트", 38000, 0.15);
		Book b3 = new Book("실용주의 프로그래머", "앤드류 헌트, 데이비드 토마스", "인사이트", 35000, 0.15);

		b1.inform();
		b2.inform();
		b3.inform();
		
	}

}
