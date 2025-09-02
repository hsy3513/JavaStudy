package com.kh.b_condition;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력: ");
		int n1 = sc.nextInt();
		
		System.out.print("피연산자2 입력: ");
		int n2 = sc.nextInt();
		
		System.out.print("연산자 입력 (+, -, *, /, %): ");
		String str = sc.next();
		char ch = str.charAt(0);
		
		if (n1 > 0 && n2 > 0) {
			switch (ch) {
			case '+':
				System.out.printf("%d", n1 + n2);
				break;
			case '-':
				System.out.printf("%d", n1 - n2);
				break;
			case '*':
				System.out.printf("%d", n1 * n2);
				break;
			case '/':
				System.out.printf("%d", n1 / n2);
				break;
			case '%':
				System.out.printf("%d", n1 % n2);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
			}
		} else {
			System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
		}		
		
		sc.close();
	}

}
