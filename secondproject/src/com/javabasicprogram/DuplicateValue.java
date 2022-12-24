package com.javabasicprogram;

public class DuplicateValue {
	
	public static void main(String[] args) {
		
		String ar[]= {"java","python","java"};
		
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) {
					System.out.println("Duplicate value found:"+ar[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			
			System.out.println("duplicate value not found");
		}
	}

}
