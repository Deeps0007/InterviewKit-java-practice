package com.deepstech.string;

public class ReverseString {

	public static void main(String[] args) {
		
		// System.out.println(new StringBuilder("dynamo").reverse().toString());
		
		String str="This is a boy";
		
		String[] st=str.split(" ");
		for (int i = 0; i < st.length; i++) {
			
			System.out.print(new StringBuilder(st[i]).reverse().toString()+" ");
		
			
		}
		
		
		// siht si a yob
		// yob a sa sith
		
	}
}
