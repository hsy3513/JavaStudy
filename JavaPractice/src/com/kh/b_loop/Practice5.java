package com.kh.b_loop;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		
		int n = sc.nextInt();
		
		for(int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
