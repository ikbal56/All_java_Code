package com.te.rythoms;

public class RemoveWhitespace {

	
	public static void main(String[] args) {
		
//		String name="Hii my name is ikbal";
//		
//		char[] chars=name.toCharArray();
//		
//		String str="";
//		for(int i=0;i<chars.length;i++) {
//			
//			if(chars[i]!=' ') {
//				
//				str=str+chars[i];
//			}
//		}
//		
//		System.out.println(str);
		
		
		String value="Hlo Ruku what are you doing";
		
		String str=value.replaceAll(" ","");
		
		System.out.println(str);
	}
}
