package com.technoelevate.java8features;

public class Vegetable {

	private String vName;
	private int quantity;
	private double price;

	public Vegetable(String vName, int quantity, double price) {
		super();
		this.vName = vName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getvName() {
		return vName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	
	public void payment() {
		double totalprice=quantity*price;
		System.out.println(totalprice+" you have to pay at the counter");
	}
}
