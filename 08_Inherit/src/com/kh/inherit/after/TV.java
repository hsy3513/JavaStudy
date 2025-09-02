package com.kh.inherit.after;

public class TV extends Product{ // Product 클래스 상속
	private int inch;
	
	public TV(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	@Override
	public String information() {
		return String.format("%s, inch: %d", super.information(), inch);
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
}
