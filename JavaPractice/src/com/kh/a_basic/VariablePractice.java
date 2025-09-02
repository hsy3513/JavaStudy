package com.kh.a_basic;

import java.util.Scanner;

public class VariablePractice {
	public static void main(String[] args) {
		//practice1();
		practice6();
	}
	
	public static void practice1() {
		// 입력 -> Scanner
		Scanner sc = new Scanner(System.in);

		// 이름, 성별, 나이, 키를 입력받아 출력하기
		System.out.print("이름을 입력하세요: ");
		// "아무개" --> String
		String name = sc.nextLine();

		// "남" 또는 "여" --> String
		System.out.print("성별을 입력하세요(남/여): ");
		String sex = sc.next();
		// sc.next(), sc.nextLine(): String 형태로만 읽어옴
		// => 문자타입으로 추출하고자 할 경우: 문자열.charAt(위치): 
		char gen = sex.charAt(0);

		// 20 --> int
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();

		// 180.5 --> double
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		
		// 결과 출력
		/*
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^", 
				height, age, sex, name);		
		*/

		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^", 
				height, age, gen, name);
		
		sc.close();
	}
	
	public static void practice2() {
		// 입력 -> Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("첫 번째 정수: ");
		int num2 = sc.nextInt();

		System.out.printf("더하기 결과: %d\n", num1 + num2);
		System.out.printf("빼기 결과: %d\n", num1 - num2);
		System.out.printf("나누기 몫 결과: %d\n", num1 / num2);
		System.out.printf("나누기 나머지 결과: %d\n", num1 % num2);

		sc.close();
	}
	
	public static void practice3() {
		// 입력 -> Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("가로: ");
		float num1 = sc.nextFloat();
		System.out.print("세로: ");
		float num2 = sc.nextFloat();

		System.out.printf("면적: %.2f\n", num1 * num2);
		System.out.printf("둘레: %.1f\n", (num1 + num2) * 2);

		sc.close();
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		// apple --> "apple" --> String
		String word = sc.nextLine();
		
		char a;
		a = word.charAt(0);
		System.out.printf("첫 번째 문자: %c\n", a);
		a = word.charAt(1);
		System.out.printf("두 번째 문자: %c\n", a);
		a = word.charAt(2);
		System.out.printf("세 번째 문자: %c\n", a);
		
		sc.close();
		
	}	

	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		String word = sc.next();
		
		char ch = word.charAt(0);
		
		System.out.printf("%c unicode %d\n", ch, (int)ch);
		
		sc.close();
		
	}
	
	public static void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어: ");
		float kor = sc.nextFloat();

		System.out.print("영어: ");
		float eng = sc.nextFloat();

		System.out.print("수학: ");
		float math = sc.nextFloat();

		System.out.printf("총점: %.0f\n", kor + eng + math);
		System.out.printf("평균: %.0f\n", (kor + eng + math) / 3);

		sc.close();
		
	}

}
