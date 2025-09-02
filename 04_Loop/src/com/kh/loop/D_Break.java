package com.kh.loop;

public class D_Break {
	/*
	 * 분기문: break
	 * 	=> 반복문 내에서 사용 시 가장 가까운 반복문을 종료!
	 */

	public static void main(String[] args) {
		// 1 ~ 100 사이의 랜덥값을 추출하여 출력 => "랜덤값: " + ㅌ
		// 단 해당 값이 짝수일 경우 반복문 종료
		
				
		while (true) {
			int num = (int)(Math.random() * 100 + 1);
			
			if (num % 2 == 0) {
				System.out.println("반복문 종료 --> " + num);
				break;
			}

			System.out.println("랜덤값: " + num);
		}
		

	}

}
