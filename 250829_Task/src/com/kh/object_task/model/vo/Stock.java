package com.kh.object_task.model.vo;

public class Stock {
	// 필드부
	private String name;			// 주식 명
	private String country;			// 국가 명
	private int totalSharesIssued;	// 총 발행 주식 수
	private double price;			// 1주당 주가
	
	// 생성자부
	public Stock() {
		super();
	}

	public Stock(String name, String country, int totalSharesIssued, double price) {
		super();
		this.name = name;
		this.country = country;
		this.totalSharesIssued = totalSharesIssued;
		this.price = price;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTotalSharesIssued() {
		return totalSharesIssued;
	}

	public void setTotalSharesIssued(int totalSharesIssued) {
		this.totalSharesIssued = totalSharesIssued;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Stock [name=" + name + ", country=" + country + ", totalSharesIssued=" + totalSharesIssued + ", price=" + price + "]";
	}
	
	public double calcMarketCap() {
		return totalSharesIssued * price;
	}
	
	public double calcRateToWon() {
		double rate = 0;
		
		switch (country) {
		case "나스닥":
			rate = price * 1380;
			break;
			
		default:
			rate = price;
			break;
		}
		
		return rate;
	}

}
