package com.kh.c_array;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice7();
	}
	
	public static void practice4() {
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("0 ~ 6 사이의 숫자 입력: ");
		int n = sc.nextInt();
		
		if (n >= 0 && n < arr.length)
		{
			System.out.print(arr[n]);
		} else {
			System.out.print("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
	
	public static void practice7() {
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
