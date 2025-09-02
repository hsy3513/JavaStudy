package com.kh.oop;

import com.kh.oop.model.BankTransfer;
import com.kh.oop.model.PaymentMethod;
import com.kh.oop.model.Toss;

public class Run {

	public static void main(String[] args) {
		// 결제 방식 별 객체 생성
		Toss toss = new Toss();
		BankTransfer bt = new BankTransfer("123-1234-1234");
		
		toss.process(1000);
		System.out.println();
		bt.process(3000);

		System.out.println();
		// 다형성 적용. 부모 타입으로 자식 객체들을 다루는 기술
		PaymentMethod pm1 = new Toss();
		PaymentMethod pm2 = new BankTransfer("112-1536-1516");
		
		pm1.process(5000);
		System.out.println();
		pm2.process(7500);
		
		// ------------------------------
		PaymentMethod[] methods = new PaymentMethod[4];
		
		//methods[0].process(1000);
		methods[0] = new Toss();
		methods[1] = new BankTransfer("123-1533-1351");
		methods[2] = toss;
		methods[3] = bt;
		
		for (int i = 0; i < methods.length; i++) {
			methods[i].process(10000);
			System.out.println();
		}
		
		
	}

}
