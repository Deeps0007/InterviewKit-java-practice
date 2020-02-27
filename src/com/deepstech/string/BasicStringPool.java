package com.deepstech.string;

public class BasicStringPool {

	public static void main(String[] args) {
		
		 String str="hello"; //String is immutable Class
		 
		 String str2=new String("hello");
		 
		 System.out.println(str==str2);
		 System.out.println(str.equals(str2));
		 
		 String str3=str+"test";
		 System.out.println(str3);
		 System.out.println(str);
		 
		
	}
	
}
