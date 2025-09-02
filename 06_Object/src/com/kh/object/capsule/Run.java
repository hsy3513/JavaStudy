package com.kh.object.capsule;

public class Run {

	public static void main(String[] args) {
		// Person 객체 생성
		Person p1 = new Person();
		
		p1.setName("길동이");		// 직접 값을 변경하는 것이 아니라 setter 를 통해 값을 간접적으로 변경!
		p1.introduce();
		
		// Person 객체 생성 -> 내 이름, 나이 저장하여 출력
		Person p2 = new Person();
		
		p2.setName("호성");
		p2.setAge(34);
		System.out.println(p2.getName());
	}

}
