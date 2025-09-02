package com.kh.loop;

public class A_For {
	/*
	 * 반복문: 프로그램 흐름을 제어하는 문법 중 하나로 특정 코드를 반복적으로 수행
	 * 
	 * * for문
	 *  [표현식]
	 *  	for (초기식; 조건식; 증감식) {
	 *  		// 반복 수행 할 코드
	 *   	}
	 *   
	 *   	* 초기식: 반복문이 수행될 때 "최초" 한번만 실행하는 식
	 *   	* 조건식: 반복문이 "수행될 조건"을 작성하는 식
	 *   		- 조건식의 결과가 true일 때 중괄호 안의 내용을 실행
	 *   		- 조건식의 결과가 false일 때 반복문 종료
	 *   	* 증감식: 반복문을 제어하는 변수의 값을 증감시키는 식
	 *   
	 *   [for문 실행 순서]
	 *   	초기식 -> 조건식 검사 -> 결과가 true인 경우 반복할 내용 수행 -> 증감식
	 *   		 -> 조건식 검사 -> 결과가 true인 경우 반복할 내용 수행 -> 증감식
	 *   		---------------- 반복 ----------------
	 *   		 -> 조건식 검사 -> 결과가 false인 경우 반복문 종료
	 *   
	 *   * 참고: 초기식, 조건식, 증감식은 생략 가능!
	 *   		=> 세미콜론(;)은 반드시 작성해야 함!!
	 *   	- 증감식 생략 => for (초기식; 조건식; ) {}
	 *   	- 조건식 생략 => for (초기식; ; 증감식) {}
	 *   	- 초기식 생략 => for (; 조건식; 증감식) {}
	 *   	- 모두 생략 => for (;;) {}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method5();
	}
	
	/**
	 * "Happy" 5번 출력
	 */
	public static void method1() {
		/*
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		*/
		// => for문 사용하여 출력
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("Happy");
		}
		*/

		for (int i = 1; i < 6; i++) {
			System.out.println("Happy");
		}
	}

	/**
	 * 10부터 1까지 출력
	 * 
	 * 출력: 10 9 8 ... 2 1
	 */
	public static void method2() {
		
		for (int i = 10; i > 0; i--) {
			System.out.printf("%d ", i);
		}
	}
	
	public static void method3() {
		// 총합을 저장할 변수
		int total = 0;
		
		for (int i = 1; i < 11; i++) {
			total += i;
		}
		
		System.out.printf("1 ~ 10까지 총 합: %d\n", total);
		
	}
	
	/**
	 * 랜덤값을 추출하여 1부터 그 값까지의 총 합
	 */
	public static void method4() {
		/*
		 * [랜덥값을 구하는 방법]
		 *  - Math: java.lang.Math
		 *  	Math.random() 호출하여 사용
		 */
		int rand = (int)(Math.random() * 10 + 1);
		int sum = 0;
		
		for (int i = rand; i > 0; i--) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 총 합: %d", rand, sum);
	}
	
	/**
	 * 구구단 출력 (2단 ~ 9단 출력)
	 */
	public static void method5() {
		
		for (int dan = 2; dan < 10; dan++) {

			System.out.printf("%d단\n", dan);

			for (int n = 1; n < 10; n++) {
				// 해당 단의 결과 출력
				System.out.printf("%d x %d = %d\n", dan, n, dan * n);
			}
			System.out.println();
		}
	}
	
}
