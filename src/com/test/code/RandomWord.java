package com.test.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomWord {
	public static void main(String[] args) {
		String s = "My Name is Farhan";
		String reversedString = reverse(s);
		System.out.println(reversedString);
		random(s);
		
		
	}
	public static void random(String s) {
		String[] stringArray = s.split(" ");
		Random random = new Random();
		Set<Integer> intte = new HashSet();
		
		

		
		for(int i=0; i<10; i++) {
			int index = random.nextInt(stringArray.length);
			if(index<stringArray.length) {
				intte.add(index);				
			}

		}
		Iterator<Integer> it = intte.iterator();
		while(it.hasNext()) {
			int index = it.next();
			System.out.println(stringArray[index]);
		}
		
		
	}
	public static String reverse(String s) {
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			newString = s.charAt(i) + newString;
		}
		return newString;

	}
}
