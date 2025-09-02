package com.kh.b_loop;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();

		sc.close();
		
		if (num > 0) {
			for (; num > 0; num--) {
				System.out.printf("%d ", num);
			}			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

}
