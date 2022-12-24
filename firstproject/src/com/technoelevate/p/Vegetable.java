package com.technoelevate.p;

public class Vegetable implements Comparable<Vegetable> {
	
	private String name;
	private double price;
	private int quantity;
	public Vegetable(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Vegetable [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Vegetable o) {
		
		return this.getName().compareTo(o.getName());
	}
	
//	@Override
//	public int compareTo(Vegetable o) {
//		
//		return getPrice().compareTo(o.getPrice());
//	}
	
//	@Override
//	public int compareTo(Vegetable o) {
//		
//		return getQuantity().compareTo(o.getQuantity());
//	}
	
	
	

}
