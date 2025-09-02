package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lotto();
	}

	/** lotto 메소드
	*   : 1 ~ 45 정수를 중복되지 않게 6개 생성
	*     생성된 6개의 정수를 int[] 로 변환 후 출력
	* * Set 활용
	*/
	public static void lotto(){
		Set<Integer> lottoNum = new HashSet<>();
		while (lottoNum.size() < 6) {
			lottoNum.add((int)(Math.random() * 45 + 1));
		}
		
		int[] arr = new int[lottoNum.size()];
		int index = 0;
				
		for(Integer num : lottoNum) {
			arr[index++] = num;
		}

		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		// Iterator 반복자 활용
		int[] arr2 = new int[lottoNum.size()];
		Iterator<Integer> it = lottoNum.iterator();
		
		for (int i = 0; it.hasNext(); i++) {
			arr2[i] = it.next();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}		
}
