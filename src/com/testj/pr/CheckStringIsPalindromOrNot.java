package com.testj.pr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckStringIsPalindromOrNot {

	public static void main(String[] args) {
		String string = "abcba";
		String reverseString = "";
		for (int i = 0; i < string.length(); i++) {
			reverseString = string.charAt(i)+reverseString ;
		}
		System.out.println(reverseString);
		if(string.equals(reverseString)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a Palindrom");
		}
		
		String ui = "adfsdafvsggkyfhdsajfdhz";
		 char[] anm=ui.toCharArray();
		 Arrays.sort(anm);
		 Set<Character> set = new HashSet<Character>();
		 for(char anmn:anm) {
			 set.add(anmn);
		 }
		 System.out.println(anm);
		 System.out.println(set);

	}
}
