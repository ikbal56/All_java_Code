package com.te.shoppingapp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoppingCart {
	
	
	 List<Product> item;
	
	 double totalAmout;
	 double payableAmout;
	 double discount;
	 
	 double tax;
	 
	 String coupon;
	 
	 ShoppingCart(){
		 
		 
		 this.item=new ArrayList<Product>();
		 this.totalAmout=0;
		 this.payableAmout=0;
		 this.discount=0;
		 this.tax=0;
		 
		 this.coupon="";
	 }
	 
	 public void addToCart(Product item) {
		 
		 this.item.add(item);
	 }

	 public void showCart() {
		 
		 ListIterator<Product> iterator=item.listIterator();
		 
		 while(iterator.hasNext()) {
			 
			 Product item2=iterator.next();
			 
			 System.out.println(item2);
		 }
			 
	 }
	 
	 public void removeFromCart(Product i) {
		 
		 ListIterator<Product>iterator2=item.listIterator();
		 
		 while(iterator2.hasNext()) {
			 Product iteam2=iterator2.next();
			 
			 if(iteam2.getProductName().equals(i.getProductName())) {
				 
				 this.item.remove(i);
				 break;
			 }
		 }
		 
	 }
	 
	 public double getTotalAmount() {
		 
		 ListIterator<Product> iterator3=item.listIterator();
		 this.totalAmout=0;
		 while(iterator3.hasNext()) {
			 
			 Product it=iterator3.next();
			 this.totalAmout=this.totalAmout+(it.getQuantity()*it.getPrice());
		 }
		 
		 return this.totalAmout;
	 }
	 
	 public void applyCoupon(String coupon) {
		 
		 this.coupon=coupon;
		 
		 if(coupon.equals("IND11")) {
			 
			 this.discount=this.getTotalAmount()*(0.1);
			 
			 this.totalAmout=this.totalAmout-this.discount;
		 }else {
			 
			 this.totalAmout=this.totalAmout;
		 }
	 }
	 
	 public double getPayableAmount() {
		 
		 this.payableAmout=0;
		 
		 this.tax=this.totalAmout*(0.14);
		
		 this.payableAmout=this.totalAmout+this.tax;
		 
		 return this.payableAmout;
	 }
	 
	 public void printInvoice() {
			ListIterator<Product> iterator3 = item.listIterator();
			while(iterator3.hasNext()) {
				Product item4 = iterator3.next();
				System.out.print(item4.getProductName() + "\t");
				System.out.print(item4.getQuantity() + "\t");
				System.out.print(item4.getPrice() + "\t");
				System.out.println(item4.getPrice() * item4.getQuantity());
			}
			System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());
			this.applyCoupon(this.coupon);
			System.out.println("\t\t\t" + "Discount : " + this.discount);
			this.getPayableAmount();
			System.out.println("\t\t\t" + "Tax      : " + this.tax);
			System.out.println("\t\t\t" + "Total    : " + this.getPayableAmount());
		}
}
