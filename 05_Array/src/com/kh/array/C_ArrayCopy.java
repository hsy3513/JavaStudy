package com.kh.array;

public class C_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shallowCopy();
		deepCopy();

	}
	
	/*
	 * 얕은 복사 => 주소값(참조값)을 복사!
	 */
	public static void shallowCopy() {
		int[] origin = { 1, 2, 3, 4, 5 };
		
		System.out.println("====== 원본 배열 출력 ======");
		for (int i = 0; i < origin.length; i++) {
			System.out.printf("%d ", origin[i]);	
		}
		
		System.out.println();
		
		int[] copy = origin;
		// 복사 -> 얕은 복사. 주소값이 복사됨!
		System.out.println("====== 복사본 배열 출력 ======");
		for (int i = 0; i < copy.length; i++) {
			System.out.printf("%d ", copy[i]);	
		}

		System.out.println();
		
		// 복사본 배열(copy)의 세번째 위치의 값을 200으로 변경
		copy[2] = 200;
		
		System.out.println("====== 복사본 배열 출력 ======");
		for (int i = 0; i < copy.length; i++) {
			System.out.printf("%d ", copy[i]);	
		}
		
		System.out.println();

		System.out.println("====== 원본 배열 출력 ======");
		for (int i = 0; i < origin.length; i++) {
			System.out.printf("%d ", origin[i]);	
		}
		
		System.out.println();
		
	}
	/**
	 * 깊은 복사: 새로운 배열을 생성하여 원본 배열의 값을 복사
	 */
	public static void deepCopy() {
		int[] origin = { 1, 2, 3, 4, 5 };
		
		// 복사본 배열(copy)을 선언하고 원본배열(origin)의 크기만큼 할당(생성)
		int[] copy = new int[origin.length];
		
		System.out.println("====== 복사전 copy ======");
		
		for(int n : copy) {
			System.out.printf("%d ", n);
		}
		
		System.out.println();
				
		System.out.println("====== 값 변경 후 copy ======");
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		
		for(int n : copy) {
			System.out.printf("%d ", n);
		}
		
		System.out.println();

		copy[2] = 999;
		
		System.out.println("====== 값 변경 후 copy ======");
		
		for(int n : copy) {
			System.out.printf("%d ", n);
		}
		
		System.out.println();
		
		System.out.println("====== 값 변경 후 origin ======");
		
		for(int n : origin) {
			System.out.printf("%d ", n);
		}
		
		System.out.println();
		// --------------------------------
		// * System.arraycopy(원본배열명, 복사를 시작할 인덱스, 복사본 배열명, 복사본 배열의 시작 인덱스, 복사할개수);
		//System.arraycopy(origin, 0, copy, 0, origin.length);
		
		copy = new int[10];		// [0, 0, 0, ... , 0, 0]
		System.arraycopy(origin, 2, copy, 4, origin.length - 2);

		System.out.println("====== 값 변경 후 copy ======");
		
		for(int n : copy) {
			System.out.printf("%d ", n);
		}
		
		System.out.println();
		
	}

}
