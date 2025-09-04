package com.kh.stockapp.model.vo;

import java.io.Serializable;

public class Customer implements Serializable {
	private String pw;	
	
	public Customer() {
		super();
	}

	public Customer(String pw) {
		super();
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
