package com.te.springcorebeanscope;

public class MarwadiShop {

	private double price;
	private String sweetName;

	public MarwadiShop(double price, String sweetName) {
		super();
		this.price = price;
		this.sweetName = sweetName;
	}

	public MarwadiShop() {
		super();
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSweetName() {
		return sweetName;
	}

	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}

	@Override
	public String toString() {
		return "MarwadiShop [price=" + price + ", sweetName=" + sweetName + "]";
	}

}
