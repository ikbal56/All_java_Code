package com.te.interview;

public class FoundDuplicatString {

	public static void main(String[] args) {

		String[] str = { "java", "java", "python", "nodejs" };

		boolean flag=false;
		
		for(int i=0;i<str.length;i++) {
			
			for(int j=i+1;j<str.length;j++) {
				
				
				if(str[i]==str[j]) {
					
					System.out.println("duplicate value found: "+str[i]);
					
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			
			System.out.println("duplicate not found");
		}
	}

}
