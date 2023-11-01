package com.testj.pr;

public class SwapParingOfCharactersInString {
//Input: str = “GeeksForGeeks”

//Output: eGkeFsroeGkes
	
	public static void main(String[] args) {
		String string = "GeeksForGeeks";
		char[] a = string.toCharArray();
		

		
		for(int i=0; i<a.length-1; i=i+2) {
			char temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
System.out.println(new String(a));

	}
}
