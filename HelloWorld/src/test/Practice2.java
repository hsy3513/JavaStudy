package test;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		
		sc.close();
	}

}
