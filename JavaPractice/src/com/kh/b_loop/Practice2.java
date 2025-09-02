package com.kh.b_loop;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do {

			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();

			if (num > 0) {
				for (; num > 0; num--) {
					System.out.printf("%d ", num);
				}
				
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		} while(true);
		
		sc.close();
	}

}
