package com.deepstech.string;

public class String2 {

	
	public static void main(String[] args) {
		
		   String str="anvhjvd";
		
		
		
		//str="bbcddee";
		 //"cddee";
		//"ddee"
		//"ee"
		
			while(str.length()>0)
			{
				
			int prev=str.length();  
			
			char ch1=str.charAt(0);
			str=str.replace(""+ch1,"");
			int after=str.length();
			
			int result=prev-after;
			
			System.out.println(ch1+ " : "+result);
			
			
			}
		
		
		
		
		
		
		
	}
}
