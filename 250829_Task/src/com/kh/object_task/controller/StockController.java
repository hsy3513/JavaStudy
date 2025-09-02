package com.kh.object_task.controller;

import com.kh.object_task.model.vo.Stock;

public class StockController {
	private Stock[] stk = new Stock[4];

	public StockController() {
		super();
		stk[0] = new Stock("엔비디아", "나스닥", 200000000, 180.0);
		stk[1] = new Stock("삼성전자", "코스피", 13000000, 69800.0);
		stk[2] = new Stock("펄어비스", "코스닥", 230000, 32550);
		stk[3] = new Stock("테슬라", "나스닥", 68000000, 345.98);
				
	}

	public void viewAll() {
		for (int i = 0; i < stk.length; i++) {
			System.out.printf("%d. %s\n", i + 1, stk[i].toString());
		}
	}
	
	public void viewMarketCap(int index) {
		System.out.printf("%s 시가총액: %.1f\n", stk[index - 1].getName(), stk[index - 1].calcMarketCap());
	}
	
	public void viewRateToWon(int index) {
		System.out.printf("%s 1주당 가격: %.1f\n", stk[index - 1].getName(), stk[index - 1].calcRateToWon());
	}
}
