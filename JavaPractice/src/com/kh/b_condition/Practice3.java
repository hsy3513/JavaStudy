package com.kh.b_condition;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0-100): ");

		int n = sc.nextInt();

		if (n >= 90 && n <= 100) {
			System.out.println("A");
		} else if (n >= 80 && n < 90) {
			System.out.println("B");
		} else if (n >= 70 && n < 80) {
			System.out.println("C");
		} else if (n >= 0 && n < 70) {
			System.out.println("F");
		} else {
			System.out.println("점수를 올바르게 입력해주세요.");
		}

		sc.close();

	}

}
