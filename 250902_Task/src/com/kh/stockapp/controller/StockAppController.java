package com.kh.stockapp.controller;

import java.util.HashMap;
import java.util.Map;

import com.kh.stockapp.model.vo.Customer;

public class StockAppController {
	private Map<String, Customer> cusData = new HashMap<>();

	public StockAppController() {
		super();
	}

	public StockAppController(String id, Customer ctm) {
		super();
		
		cusData.put(id, ctm);
		
	}

	
	public Map<String, Customer> getCusData() {
		return cusData;
	}

	public void setCusData(Map<String, Customer> cusData) {
		this.cusData = cusData;
	}
		
}
