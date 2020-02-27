package com.deepstech.string;

public class ReverseWithoutMethod {

	
	public static void main(String[] args) {
		
		String str="tiger";
		
		char[] ch=str.toCharArray();
		
		 for (int i = ch.length-1; i >=0; i--) {
			 System.out.print(ch[i]);
			 
		}
		
		
		
		
	}
	
}
