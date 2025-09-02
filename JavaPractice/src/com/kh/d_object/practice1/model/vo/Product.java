package com.kh.d_object.practice1.model.vo;

public class Product {
	// 필드부
	private String productName;
	private int price;
	private String brand;

	// 생성자부
	public Product() {

	}

	// 메소드부
	/*
	 * + setter()/getter()
	 * + information(): void
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// getter 부
	public String getProductName() {
		return this.productName;
	}

	public int getPrice() {
		return this.price;
	}

	public String getBrand() {
		return this.brand;
	}
	
	public void information() {
		System.out.printf("%s / %d / %s\n", productName, price, brand);
	}

}
