package com.javalearningspractice.dayone;

public class PalindromeString {
	public static void main(String[] args) {
		String a = "javavaj";
		String reverse = "";
		for(int i = 0; i<a.length(); i++) {
			reverse = a.charAt(i)+reverse;
		}
		if(a.equals(reverse)) {
			System.out.println("P");
		}else {
			System.out.println("N");
		}
//		System.out.println(reverse);
		reverseStringUsingBufferClass();
	}
	
	public static void reverseStringUsingBufferClass() {
//		String a = "javaworld";
		StringBuffer buffer = new StringBuffer("javaworld");
		
		System.out.println(buffer.reverse());
	}

}
