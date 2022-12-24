package com.technoelevate.p;

public class SweetShop {

	private String Name;
	private double price;
	private int quantty;
	public SweetShop(String name, double price, int quantty) {
		super();
		Name = name;
		this.price = price;
		this.quantty = quantty;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantty() {
		return quantty;
	}
	public void setQuantty(int quantty) {
		this.quantty = quantty;
	}
	@Override
	public String toString() {
		return "SweetShop [Name=" + Name + ", price=" + price + ", quantty=" + quantty + "]\n";
	}
	
	
	
}
