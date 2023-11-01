package com.test.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		String string = "farhan";
		System.out.println(findDublicate(string));
		System.out.println(findUnique(string));
		Iterator<String> it = findUnique(string).iterator(); 
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

	public static Set<String> findDublicate(String string) {
		String newString = "";
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < string.length() ; i++) {
			for (int j = 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					set.add(String.valueOf(string.charAt(i)));
					break;
				}else {
					break;
				}
				
			}

		}
		return set;

	}
	public static Set<String> findUnique(String string) {
		String newString = "";
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < string.length() ; i++) {
			for (int j = 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {

					break;
				}else {
					set.add(String.valueOf(string.charAt(i)));
					break;
				}
				
			}

		}
		return set;

	}
}
