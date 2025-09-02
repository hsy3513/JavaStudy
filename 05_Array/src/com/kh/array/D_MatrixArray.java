package com.kh.array;

public class D_MatrixArray {
	/*
	 * 2차원 배열: 배열 안에 배열.
	 * "같은 자료형의 "1차원 배열의 묶음"
	 * 
	 * 2차원 배열은 할당 된 공간마다 인덱스 번호를 "두 개" 부여
	 * : 앞의 번호는 행의 인덱스(몇 번째 1차원 배열인지), 뒤의 번호는 열의 인덱스(1차원 배열에서 몇 번째 데이터인지)
	 * 
	 * 선언 => 1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만듬!
	 * 
	 * 		자료형[][] 배열명;
	 * 		자료형 배열명[][];
	 * 		자료형[] 배열명[];
	 * 
	 * 할당
	 * 
	 * 		배열명 = new 자료형[행크기][열크기]
	 * 		* 행크기: 1차원 배열의 개수
	 * 		* 열크기: 1차원 배열의 크기 (생략 가능-> 가변 길이의 1차원 배열 할당)
	 * 
	 * 선언 및 할당: 자료형[][] 배열명 = new 자료형[행크기][열크기]
	 * 
	 * 값 대입
	 * 		배열명[행인덱스][열인덱스] = 값;
	 * 		* 행인덱스: 몇 번째 1차원 배열인지
	 * 		* 열인덱스: 1차원 배열의 몇 번째 데이터인지(인덱스)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice1();
		practice2();
	}
	
	public static void practice1() {
		// 정수형 2차원 배열 arr 선언
		//int[][] arr;
		
		// 크기가 4인 1차원 배열 3묶음으로 할당(3행 4열)
		//arr = new int[3][4];
		
		// * 값 대입
		int[][] arr2 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
		};
		
		// 6이라는 값을 출력 => 1행 1열 위치에 있음
		System.out.println(arr2[1][1]);
	}

	
	public static void practice2() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + "행 " + j + "열)";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
