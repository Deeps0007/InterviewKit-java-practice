package com.deepstech.string;

public class ResourceLeak {

	public static void main(String[] args) {
		
		String str=new String("hii");
		String str2=str;
		
		str=null;
		str2=null;
		
		
	}
	
}
