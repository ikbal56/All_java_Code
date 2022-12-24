package com.te.shoppingapp;



public class App {

	public static void main(String[] args) {

		Product p=new Product("Bread",2,50.0);
		Product p2=new Product("cake",1,250.0);
		Product p3=new Product("less",5,20.0);
		Product p4=new Product("kaju",2,50.0);
		Product p5=new Product("Sugar",2,50.0);
		
		
		ShoppingCart cart=new ShoppingCart();
		
		cart.addToCart(p);
		cart.addToCart(p2);
		cart.addToCart(p3);
		cart.addToCart(p4);
		cart.addToCart(p5);
		
		
		cart.showCart();
		
		cart.removeFromCart(p3);
		
		cart.showCart();
		
		double totalAmount=cart.getTotalAmount();
		
		System.out.println(totalAmount);
		
		
		double payableAmount=cart.getPayableAmount();
		
		System.out.println(payableAmount);
		
		cart.applyCoupon("IND11");
		
		cart.printInvoice();

	    cart.applyCoupon("IND11");
	    
	    cart.printInvoice();

	    cart.addToCart(new Product("Milk", 5, 30.00));
	    
	    cart.printInvoice();
		
	}

}
