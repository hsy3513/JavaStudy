package com.kh.b_loop;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사용자로부터 두개의 값을 입력받아
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();

		sc.close();
		
		if (num1 > 0 && num2 > 0) {

			if (num1 < num2) {
				for (; num1 <= num2; num1++) {
					System.out.printf("%d ", num1);
				}
			} else {
				for (; num2 <= num1; num2++) {
					System.out.printf("%d ", num2);
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	
	}

}
