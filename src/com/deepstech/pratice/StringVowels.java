package com.deepstech.pratice;

public class StringVowels {

	public static void main(String[] args) {
		
		String str="removevowels";
		int l=str.length();
		for (int i = 0; i <l; i++)
		{
			char c=str.charAt(i);
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
			{
				System.out.print(c);
			}
		}
	}
}
