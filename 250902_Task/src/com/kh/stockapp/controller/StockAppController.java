package com.kh.stockapp.controller;

import com.kh.stockapp.model.vo.Customer;

public class StockAppController {
	private Customer ctm;
	
	public StockAppController(String pw) {
		this.ctm = new Customer(pw);
	}

	public Customer getCtm() {
		return ctm;
	}

	public void setCtm(Customer ctm) {
		this.ctm = ctm;
	}
		
}
